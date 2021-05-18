package com.urlwiki.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urlwiki.entities.User;
import com.urlwiki.repositories.UserSqlRepository;

@Service
public class UserService {
	
	@Autowired
	private UserSqlRepository userRepo;

	public Collection<User> getAll() {
		return userRepo.findAll();
	}

	
	public User getById(int id) {
		return userRepo.findById(id).get();
		
	}
	
	public User addNewUser(User user) {
		return userRepo.save(user);
	}

	public User updateUser(int id, User updateUser) {
		User user = new User();
		user = userRepo.findById(id).get();
		return userRepo.save(user);
	}
	
	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}
	
}
