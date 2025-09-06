package com.example.demoapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
	
//	@GetMapping("/hello")
//	public String sayHello() {
//		return "Hello from Backend!";  // this is a plain text
//	}
	
	@GetMapping("/hello")
	public Message sayhellow() {
		return new Message("I am Groove","Good");   // this is json format
	}

}
