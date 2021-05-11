package com.urlwiki.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.urlwiki.entities.User;

import lombok.Data;


@Service
@Data
public class UserRepository {
	
	
	Map<Integer, User> users = new HashMap<Integer, User>();
	

	
	


}
