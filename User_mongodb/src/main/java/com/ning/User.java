package com.ning;

import java.util.Date;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document (collection = "UserDB")
public class User {
	@Id
	long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Size(min = 3, max = 50)
	private String name;
	
	@NotBlank
	@Email(message = "Please enter a valid e-mail address")
	private String email;
	
	@NotBlank
	@Size(min = 8, max = 15)
	private String password;
	

	
	public User(String name, String email, String password) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.email=email;
		this.password=password;
	}

	

	@Size(max = 100)
	private String note;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	
	

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", note="
				+ note + "]";
	}



}
