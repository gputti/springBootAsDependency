package com.testapp.test1;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import com.testapp.test1.controller.SimpleFilter;



@SpringBootApplication
@ComponentScan(basePackages = {"com.testapp.test2.*", "com.testapp.test1.*"})
@EnableJpaRepositories(basePackages={"com.testapp.test2.*", "com.testapp.test1.*"})
@EntityScan(basePackages={"com.testapp.test2.*", "com.testapp.test1.*"})
public class App1 extends SpringBootServletInitializer {
	
	@RequestMapping("/")
	String home() {
		return "test app1";
	}
	
	@GetMapping("test1")
	String test2() {
		return "test app1 test1 ";
	}
	
	@Bean
	public FilterRegistrationBean<SimpleFilter> someFilterRegistration() {

	    FilterRegistrationBean<SimpleFilter> registration = new FilterRegistrationBean<SimpleFilter>();
	    registration.setFilter(new SimpleFilter());
	    registration.addUrlPatterns("/api/notusing");
	    registration.addUrlPatterns("/api/test2/*");
	    registration.addInitParameter("paramName", "paramValue");
	    registration.setName("someFilter");
	    registration.setOrder(1);
	    return registration;
	} 

	
    public static void main( String[] args )
    {
        System.out.println( "test app1 !" );
        SpringApplication.run(App1.class, args);
    }
}
