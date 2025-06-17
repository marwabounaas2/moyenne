/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author marwa
 */
public class etude_serTest {
    
      @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
       requestDispatcher dispatcher=mock(requestDispatcher.class);
      when(Integer.parseInt(request.getParameter("note1"))).thenReturn(5);
      when(Integer.parseInt(request.getParameter("note2"))).thenReturn(7);
          RequestDispatcher Dispatcher = null;
      when(request.getRequestDispatcher("calcul.jsp")).thenReturn(Dispatcher);
        etude_ser instance = new etude_ser();
        instance.doPost(request, response);
        verify(dispatcher).forward(request,response);

    }
    
}
