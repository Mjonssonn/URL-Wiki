package com.urlwiki.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.urlwiki.entities.User;
import com.urlwiki.services.UserService;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users/")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	private final UserService userService;

	@GetMapping("/log")
	public String testLogging() {
		// Error > Warn > Info > Debug > Trace
		logger.trace("Tracing");
		logger.debug("Debugging");
		logger.info("Info");
		logger.warn("Warning");
		logger.error("Error");
		return "Logging works!"; 
	}

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
	public User getById(@ApiParam(value = "id", required = true) @PathVariable int id) {
		User response = userService.getById(id);
		 
		if (response == null) {
			logger.warn("Could not find user with id: " + id);
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find user");
		}
		
		return userService.getById(id);
	}

	@ApiModelProperty(notes ="Add a new user to Database")
	@PostMapping("/")
	@ApiOperation(
			value = "Add user to database", 
			notes = "Adds a new user to the database",
			response = User.class,
			responseContainer = "List")
	public User addNewUser(@ApiParam(value = "firstName", required = true)
	@RequestBody User user) {
		return userService.addNewUser(user);
	}
	
	@ApiModelProperty(notes ="Update an existing user in Database")
	@PutMapping("/{id}")
	@ApiOperation(
			value = "Update user", 
			notes = "Update an user in the database",
			response = User.class,
			responseContainer = "List")
	public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
		return userService.updateUser(id, updatedUser);
	}
	
	@ApiModelProperty(notes ="Remove an existing user in Database")
	@DeleteMapping("/{id}")
	@ApiOperation(
			value = "Delete user", 
			notes = "Delete an user from the database",
			response = User.class,
			responseContainer = "List")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	} 
	
}
  