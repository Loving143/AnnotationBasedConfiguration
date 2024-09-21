package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.HelloService;

@RestController
public class HellopController {

	@Autowired
	HelloService helloService;
	
	public void greet() {
		System.out.println(helloService.hello());
	}
}
