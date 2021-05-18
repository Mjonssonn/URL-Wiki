package com.urlwiki.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Add new User request model")		// Note for Swagger UI
@Getter														// Lombok Getter
@Setter														// Lombok Setter
@Entity 													// Lets SQL know that this class is an entity class
@Table(name = "API_user") 									// Name of the table in SQL
public class User {											// User class
  
	
	
	
	@ApiModelProperty(notes = "Unique ID of a user")		// User ID  -- Note for Swagger UI
	@Id														// Lets SQL know this is an ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) 	// (1,1) SQL
	@Column(name = "id")									// Column name in SQL
	private int id;											
	
	@ApiModelProperty(notes = "FirstName of the user")		// User first name
	@Column(name = "firstName")								
	private String firstName;								
	
	
	@ApiModelProperty(notes = "LastName of the user")		// User last name
	@Column(name = "lastName")								
	private String lastName;								
	
	
	// Article method
	public User() {
	}
	

	// User constructor
	public User(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	// Getters and setters for User called upon in the UserService class
	public int getId() {
		return id;
	}  

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
