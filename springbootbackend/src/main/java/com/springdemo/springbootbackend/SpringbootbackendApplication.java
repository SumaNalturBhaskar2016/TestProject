package com.springdemo.springbootbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.springdemo.springbootbackend")
public class SpringbootbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);
	}

}
