package com.bean;

import org.hibernate.validator.constraints.NotBlank;

public class UserBean {

	private int userId;
	
	private boolean isdelete=false;

	@NotBlank(message = "Please Enter FirstName")
	private String firstName;

	@NotBlank(message = "Please Enter Email")
	private String email;

	@NotBlank(message = "Please Enter Password")
	private String password;

	@NotBlank(message = "Please Select Gender")
	String gender;

	@NotBlank(message = "Please Select atleast 1 hobby")
	String hobby;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public boolean isIsdelete() {
		return isdelete;
	}

	public void setIsdelete(boolean isdelete) {
		this.isdelete = isdelete;
	}
	
	
	

}
