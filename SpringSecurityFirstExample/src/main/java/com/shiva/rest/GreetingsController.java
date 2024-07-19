package com.shiva.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Welcome to Spring Security Example";
	}

}
