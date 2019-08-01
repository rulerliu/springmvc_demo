package com.liuwq.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        // 1.   创建SpringMVC容器
        AnnotationConfigWebApplicationContext app = new AnnotationConfigWebApplicationContext();
        // 2. 注册我们的配置文件
        app.register(MyMvcConfig.class);
        // 注册我们的
        DispatcherServlet dispatcherServlet = new DispatcherServlet(app);
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
        dynamic.addMapping("/");
        dynamic.setLoadOnStartup(1);// 最优先启动

    }
}
