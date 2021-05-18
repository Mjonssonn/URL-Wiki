package com.urlwiki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urlwiki.entities.User;

@Repository
public interface UserSqlRepository extends JpaRepository<User, Long>{

	
	
}
