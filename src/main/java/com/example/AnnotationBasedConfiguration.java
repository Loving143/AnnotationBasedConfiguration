package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.controller.HellopController;

@SpringBootApplication
public class AnnotationBasedConfiguration {

	public static void main(String[] args) {
		
	        
		
		SpringApplication.run(AnnotationBasedConfiguration.class, args);
	}

}
