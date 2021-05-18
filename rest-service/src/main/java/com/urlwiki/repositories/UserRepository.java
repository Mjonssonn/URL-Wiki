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
	
	
	Map<Long, User> users = new HashMap<Long, User>();
	

	public Collection<User> getAll() {
		return users.values();
		
	}
	

	public User getById(long id) {
		return users.get(id);
	}


	public User addNewUser(User user) {
		users.put(user.getId(), user);
		return user;
	}
	

	public User updateUser(long id, User updatedUser) {
		
		User user = users.get(id);
		user.setFirstName(updatedUser.getFirstName());
		user.setLastName(updatedUser.getLastName());
		return user;
	}
	

	public void deleteUser(long id) {
		users.remove(id);     
	} 
	
	


}
