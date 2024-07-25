package com.example.admin.config;

import com.example.admin.controller.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMVCConfig implements WebMvcConfigurer {
     @Override
     public void addViewControllers(ViewControllerRegistry registry) {
         registry.addViewController("/").setViewName("index");
         registry.addViewController("/index.html").setViewName("index");
     }
     //注入自定义的区域解析器
     @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

    //配置登录拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index.html", "/", "/login", "/css/**", "/js/**", "/img/**");
    }

}
