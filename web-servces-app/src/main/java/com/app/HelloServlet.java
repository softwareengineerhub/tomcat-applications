package com.app;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    /*static{
        System.out.println("static init block{}");
    }

    {
        System.out.println("init block{}");
    }

    public HelloServlet() {
        System.out.println("Constructor");
    }*/

    @Override
    public void init() throws ServletException {
        System.out.println("Init()");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long start = System.currentTimeMillis();
        super.service(req, resp);
        System.out.println("Time: "+(System.currentTimeMillis()-start));
        //System.out.println("Service: hashCode()="+hashCode());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET()");
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis()-start<=10000){

        }
        //super.doGet(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("Destroy()");
    }
}
