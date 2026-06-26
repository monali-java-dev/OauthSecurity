package com.aadiandjava.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to aadi and java";
	}
}
