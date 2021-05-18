package com.urlwiki.restservice;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


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
		user.setId(1L);
		user.setFirstName("test");
		user.setLastName("testet");
		Optional<User> userMock = Optional.of((User) user);
		
		when(userRepo.findById(anyLong())).thenReturn(userMock);
		when(userRepo.save(any(User.class))).thenReturn(user);

		var updateUser = new User();
		updateUser.setLastName("testet");
		
		// ACT
		var result = sut.updateUser(1L, updateUser);
		
		// ASSERT
		assertEquals(updateUser.getLastName(), result.getLastName());
		
		
	}

}
