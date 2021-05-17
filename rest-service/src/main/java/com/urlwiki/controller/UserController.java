package com.urlwiki.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
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
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/users/")
public class UserController {
	
	@Autowired
	public UserService userService;

	@GetMapping("/")
	@ApiOperation(
			value = "Get all users", 
			notes = "Get all users from database",
			response = User.class,
			responseContainer = "List")
	public Collection<User> getAll() {
		return userService.getAll();
		
	}
	
	@GetMapping("/{id}")
	@ApiOperation(
			value = "Get user by ID", 
			notes = "Get users from database by ID",
			response = User.class,
			responseContainer = "List")
	public User getById(@ApiParam(value = "User ID", required = true) @PathVariable int id) {
		return userService.getById(id);
	}

	@ApiModelProperty(notes ="Add a new user to Database")
	@PostMapping("/")
	@ApiOperation(
			value = "Add user to database", 
			notes = "Adds a new user to the database",
			response = User.class,
			responseContainer = "List")
	public User addNewUser(@ApiParam(value = "First Name, Last Name and ID ", required = true)
	@RequestBody User user) {
		return userService.addNewUser(user);
	}
	
	@ApiModelProperty(notes ="Update an existing user in Database")
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
		return userService.updateUser(id, updatedUser);
	}
	
	@ApiModelProperty(notes ="Remove an existing user in Database")
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	} 
	
}
  