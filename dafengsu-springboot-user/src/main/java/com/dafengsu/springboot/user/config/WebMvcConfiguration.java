package com.dafengsu.springboot.user.config;

import com.dafengsu.springboot.user.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author su
 * @description 配置拦截器
 * @date 2020/4/4
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
