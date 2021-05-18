package com.urlwiki.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urlwiki.entities.User;
import com.urlwiki.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo; 
	

	public Collection<User> getAll() {
		return userRepo.getAll();
	}

	
	public User getById(int id) {
		return userRepo.getById(id);
		
	}
	
	public User addNewUser(User user) {
		return userRepo.addNewUser(user);
	}

	public User updateUser(int id, User updateUser) {
		return userRepo.updateUser(id, updateUser);		
	}
	
	public void deleteUser(int id) {
		userRepo.deleteUser(id);
	}
	
}
