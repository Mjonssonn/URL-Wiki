package com.urlwiki.services;

import org.springframework.stereotype.Service;

import com.urlwiki.repositories.UserRepository;

@Service
public class UserService {
	UserRepository userRepo; 
	
	public String createUser() {
		return "";	
	}
	
	public String addComment() {
		return "Comment added";
	}
	
	public String addLike() {
		return "Like added";
	}
	
	public String removeComment() {
		return "Comment removed";
	}
	
	public String removeLike() {
		return "Like removed";
	}

}
