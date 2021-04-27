package com.urlwiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class UserController {
	
	@RestController
	@RequestMapping
	
	public UserController() {
		@PostMapping()
		public String createUser()}
	return "HTTP User created successfully";
	
	    @PostMapping() 
	    public String writeComment()}
    return "HTTP Comment was posted";
    
        @PostMapping()
        public String giveLike()}
    return "HTTP Like was given";
	
	
	}
		
	}
