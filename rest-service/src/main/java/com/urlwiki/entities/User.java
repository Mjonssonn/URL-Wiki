package com.urlwiki.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="UserID")


public class User {

	private int id;
	private String firstName;
	private String lastName;
	
	public User() {
	}
	
	public User(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	@ApiModelProperty(notes= "The unique identifier of an User")
	@javax.persistence.Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "id")
	private Long Id;
	
	@ApiModelProperty(notes= "The FirstName of the User")
	@Column(name= "first_name")
	private String firstname;
	
	@ApiModelProperty(notes= "The LastName of the User")
	@Column(name= "last_name")
	private String lastname;
	
	@ApiModelProperty(notes= "The date the User was created")
	@Column(name= "created_at")
	private Date createdAt;
	
	@ApiModelProperty(notes= "The date the User was updated")
	@Column(name="updated_at")
	private Date updatedAt;
	

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setFirstName(Object firstName) {
		// TODO Auto-generated method stub
		
	}

	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLastName(Object lastName) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

	
}
