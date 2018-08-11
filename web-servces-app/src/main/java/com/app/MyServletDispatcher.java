package com.app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="MyServletDispatcher", urlPatterns = "/MyServletDispatcher")
public class MyServletDispatcher extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String paramValue = req.getParameter("param");
        if("a".equalsIgnoreCase(paramValue)){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/ServletA");
            requestDispatcher.include(req, res);
        }
        if("b".equalsIgnoreCase(paramValue)){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/ServletB");
            requestDispatcher.forward(req, res);
        }
        res.getWriter().append("THIS IS DISPATCHER'S END");
    }

}
