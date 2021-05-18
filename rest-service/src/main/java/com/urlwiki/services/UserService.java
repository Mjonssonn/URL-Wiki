package com.urlwiki.services;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.urlwiki.entities.User;
import com.urlwiki.repositories.UserSqlRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	Logger logger = LoggerFactory.getLogger(UserService.class); // Logging the UserService Class

	private final UserSqlRepository userRepo;

	public Collection<User> getAll() {
		return userRepo.findAll();
	}

	
	public User getById(long id) {
		return userRepo.findById(id).get();
		
	}
	
	public User addNewUser(User user) {
		logger.info("New user was added" + user);
		return userRepo.save(user);
	}

	public User updateUser(long id, User updateUser) {
		User user = new User();
		user = userRepo.findById(id).get();
		logger.info("User was updated" + updateUser);
		return userRepo.save(user);
	}
	
	public void deleteUser(long id) {
		try {
			userRepo.deleteById(id);
			logger.info("Deleted user with id: " + id);
		}
		catch(Exception ex) {
			logger.error("Failed to delete user with id: " + id, ex);
		}
		
	}
	
}
