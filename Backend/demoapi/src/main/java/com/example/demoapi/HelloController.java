package com.example.demoapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
	
//	@GetMapping("/hello")
//	public String sayHello() {
//		return "Hello from Backend!";  // this is a plain text
//	}
	
	@GetMapping("/hello")
	public Message sayhellow() {
		System.out.println("Get API CALL ");
		return new Message("I am Groove","Good");   // this is json format
	}
	
	@PostMapping("/hello")
	public Message createMessage(@RequestBody Message newMessage) {
		System.out.println("POST API CALL");
		return new Message("Received: "+newMessage.getText(), "Status: " + newMessage.getStatus());
		
	}

}
