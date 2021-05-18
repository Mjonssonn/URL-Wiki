package com.urlwiki.restservice;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.urlwiki.entities.User;
import com.urlwiki.repositories.UserSqlRepository;
import com.urlwiki.services.UserService;

public class UserServiceTests {

	private UserService sut;
	
	private UserSqlRepository userRepo;
	
	@BeforeEach
	void initTests() {
		this.userRepo = Mockito.mock(UserSqlRepository.class);
		this.sut = new UserService(this.userRepo);
	}
	
	@Test
	void UserService_updateUser_Success() {
		// Arrange
		
		var user = new User();
		user.setId(1);
		user.setFirstName("test");
		user.setLastName("testet");
		Optional<User> userMock = Optional.of((User) user);
		
		when(userRepo.findById(anyInt())).thenReturn(userMock);
		// ACT
	}

}
