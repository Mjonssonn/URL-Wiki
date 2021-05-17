package com.urlwiki.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.urlwiki.entities.User;

import lombok.Data;


@Service
@Data
public class UserRepository {
	
	
	Map<Integer, User> users = new HashMap<Integer, User>();
	

	public Collection<User> getAll() {
		return users.values();
		
	}
	

	public User getById( int id) {
		return users.get(id);
	}


	public User addNewUser(User user) {
		users.put(user.getId(), user);
		return user;
	}
	

	public User updateUser(int id, User updatedUser) {
		
		User user = users.get(id);
		user.setFirstName(updatedUser.getFirstName());
		user.setLastName(updatedUser.getLastName());
		return user;
	}
	

	public void deleteUser(int id) {
		users.remove(id);     
	} 
	
	


}
