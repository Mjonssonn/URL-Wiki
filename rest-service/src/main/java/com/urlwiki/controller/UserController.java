package com.urlwiki.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.urlwiki.entities.User;
import com.urlwiki.services.UserService;

import io.swagger.annotations.ApiModelProperty;

@RestController
@RequestMapping("/api/users/")
public class UserController {
	
	public UserService userService;

	Map<Integer, User> users = new HashMap<Integer, User>();

	@ApiModelProperty(notes ="Get all users from database")
	@GetMapping("/")
	public Collection<User> getAll() {
		return userService.getAll();
		
	}
	
	@GetMapping("/{id}")
	public User getById(@PathVariable int id) {
		return userService.getById(id);
	}

	@PostMapping("/")
	public User addNewUser(@RequestBody User user) {
		return userService.addNewUser(user);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
		return userService.updateUser(id, updatedUser);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	} 
	
}
  