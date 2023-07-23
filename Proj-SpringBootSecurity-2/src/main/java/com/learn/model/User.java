package com.learn.model;

import lombok.Data;

@Data
public class User {
	private String user;
	private String email;
	private String password;
	
	public User(String user, String email, String password) {
		super();
		this.user = user;
		this.email = email;
		this.password = password;
	}

}
