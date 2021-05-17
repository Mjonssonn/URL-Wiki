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

@RestController
@RequestMapping("/api/users/")
public class UserController {
	

<<<<<<< Updated upstream
=======
	//@Autowired
	//private UserService userservice;
	
	
>>>>>>> Stashed changes
	Map<Integer, User> users = new HashMap<Integer, User>();

	@GetMapping("/")
	public Collection<User> getAll() {
		return users.values();
		
	}
	
	@GetMapping("/{id}")
	public User getById(@PathVariable int id) {
		return users.get(id);
	}

	@PostMapping("/")
	public User addNewUser(@RequestBody User user) {
		users.put(user.getId(), user);
		return user;
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
		
		User user = users.get(id);
		user.setFirstName(updatedUser.getFirstName());
		user.setLastName(updatedUser.getLastName());
		return user;
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		users.remove(id);     
	} 
	
}
  