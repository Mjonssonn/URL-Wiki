package com.urlwiki.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Add new User")
public class AddUserRequest {
	
	@ApiModelProperty(notes = "User First Name")
	private String firstName;
	@ApiModelProperty(notes = "User Last Name")
	private String lastName;
	@ApiModelProperty(notes = "User ID")
	private String userId;
	
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
