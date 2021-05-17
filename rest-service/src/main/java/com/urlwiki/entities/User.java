package com.urlwiki.entities;

//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Add new User request model")
@Data
public class User {

	
	
	
	@ApiModelProperty(notes = "Unique ID of a user")
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id")
	private int id;
	
	@ApiModelProperty(notes = "FirstName of the user")
	//@Column(name = "first_name")
	private String firstName;
	
	
	@ApiModelProperty(notes = "LastName of the user")
	//@Column(name = "last_name")
	private String lastName;
	
	public User() {
	}
	
	public User(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

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
