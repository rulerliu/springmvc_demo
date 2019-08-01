package com.liuwq.config;

import com.liuwq.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

/**
 * 使用拦截器一定要关闭EnableWebMvc
 */
@Configuration
//@EnableWebMvc
@ComponentScan("com.liuwq.controller")
public class MyMvcConfig extends WebMvcConfigurationSupport {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        // 前缀
        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        // 后缀
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }

    @Bean
    public TokenInterceptor tokenInterceptor() {
        return new TokenInterceptor();
    }

    /**
     * 注册拦截器
     *
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(tokenInterceptor()).addPathPatterns("/**");
    }

    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

    }

}