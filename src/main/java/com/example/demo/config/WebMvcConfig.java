package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * dùng cách này ko hay, vì bootstrap đc lưu ở Private folder sẽ phải lấy qua Thymeleaf => performance is not good
 * thí dụ này dùng mô hình MVC.
 * Mô hình MVC đã lỗi thời => nên tách bootstrap theo font end độc lập với back end thì hay hơn.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //
        // Access Bootstrap static resource:
        //
        // http://somedomain/SomeContextPath/webjars/bootstrap/4.1.0/css/bootstrap.min.css
        //
        registry.addResourceHandler("/webjars/**") //
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
 
}