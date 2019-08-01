package com.liuwq.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/8/1 0001 上午 11:21
 * @version: V1.0
 */
public class PayServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>payServlet");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("十点多积分开始就发生拉家里");
    }
}
