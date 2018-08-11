package com.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name="BinaryServlet", urlPatterns = "/BinaryServlet")
public class BinaryServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/jpeg");
        byte[] data = getImage();
        resp.setContentLength(data.length);
        try(OutputStream out = resp.getOutputStream()){
            out.write(data);
        }
    }

    private byte[] getImage(){
        return new byte[]{1,2,3,4,5,6,7,8,9,0};
    }

}
