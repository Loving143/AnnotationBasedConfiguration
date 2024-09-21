package com.example.beans;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String hello() {
		return "Hello ji I am Annotation Based";
	}

}
