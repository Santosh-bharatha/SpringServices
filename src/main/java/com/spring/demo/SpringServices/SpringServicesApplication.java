package com.spring.demo.SpringServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.demo.examples"})
public class SpringServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServicesApplication.class, args);
	}
}
