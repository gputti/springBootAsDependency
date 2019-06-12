package com.testapp.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class App2 extends SpringBootServletInitializer {
	
	@GetMapping("test2")
	String home() {
		return "test app2";
	}
	
    public static void main( String[] args )
    {
        System.out.println( "test app2 " );
        SpringApplication.run(App2.class, args);
    }

}
