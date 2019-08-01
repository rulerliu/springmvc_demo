package com.liuwq.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/8/1 0001 上午 10:36
 * @version: V1.0
 */
@WebServlet(
        // Servlet的访问URL
//        value = "/myServlet",
        // Servlet的访问URL，可以使用数组的方式配置多个访问路径
        urlPatterns = {"/myServlet", "/myServlet1"},//此方法和value的作用一样
        // Servlet的初始化参数
        initParams = {
                // 在服务器初始化的时候会打印，因为调用Init方法
                @WebInitParam(name = "zsms", value = "醉生梦死")
        },
        //不填的话默认是类的路径
        name = "MyServlet",
        description = "MyServlet"
)
public class MyServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>service");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("的数据库廊坊市可好看");
    }
}
