package com.liuwq.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myServlet2")
public class MyServlet2 extends HttpServlet {
    private Integer count = 0;

    public MyServlet2() {
        System.out.println("<<<MyServlet被实例化...>>>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        try {
            Thread.sleep(50);
        } catch (Exception e) {
        }
        resp.getWriter().print(" this is mayikt  count:" + count);
    }
}
