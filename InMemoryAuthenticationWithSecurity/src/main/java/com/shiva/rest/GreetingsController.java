package com.shiva.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Welcome to Spring Security Example";
	}

	@GetMapping("/user")
	public String userEndPoint()
	{
		return "Hello User";
	}
	@GetMapping("/admin")
	public String adminEndPoint()
	{
		return "Hello admin";
	}
	
	
}
