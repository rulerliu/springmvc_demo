package com.liuwq.interceptor;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 preHandle在业务处理器处理请求之前被调用;
 postHandle在业务处理器处理请求执行完成后,生成视图之前执行;
 afterCompletion在DispatcherServlet完全处理完请求后被调用,可用于清理资源等 。afterCompletion()执行完成后开始渲染页面

 不能拦截servlet请求
 */
public class TokenInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(">>>preHandle<<<");
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            response.getWriter().print("not find token");
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(">>>>>postHandle<<<<<<<<<");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(">>>afterCompletion<<<");
    }
}
