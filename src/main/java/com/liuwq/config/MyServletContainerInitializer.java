package com.liuwq.config;

import com.liuwq.servlet.PayServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes(value = WebApplicationInitializer.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {

    /**
     * @param set            感兴趣类型 也就是MyHandlesType 所有子类型
     * @param servletContext
     * @throws ServletException
     */
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        // 1.打印所有感兴趣的类型
        if (set != null) {
            for (Class<?> c : set) {
                System.out.println(c);
            }
        }
        // 2.servletContext 手动注册过滤器、servlet、监听器
        ServletRegistration.Dynamic payServlet = servletContext.addServlet("payServlet", new PayServlet());
        payServlet.addMapping("/pay");
    }
}
