package com.urlwiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private String firstName;
	private String lastName;


	@PostMapping("/create-user")
	public String createUser() {
		return "User was created";
	}
	
	@PostMapping("/comment")
	public String comment() {
		return "Comment was placed";
	}
	
	@PostMapping("/like")
	public String like() {
		return "Like was placed";
	}
	
	
}
