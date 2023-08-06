package com.example.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("shop");
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/cart").setViewName("cart");
		registry.addViewController("/login").setViewName("login");
        registry.addViewController("/shop").setViewName("shop-single");
	}

}