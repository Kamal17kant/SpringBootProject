package com.kamal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kamal.model.User;

@Service
public class UserService {
	List<User> list=new ArrayList<>();

	public UserService() {
		list.add(new User("Kamal","kamal@gmail.com","123"));
		list.add(new User("Kant","kant@gmail.com","1234"));
		list.add(new User("Prakash","prakash@gmail.com","12345"));
	}
	public List<User> getAllUsers(){
		return list;
	}
	public User getUser(String userName) {
		return list.stream().filter((user)->user.getUser().equals(userName)).findAny().orElse(null);
	}
	public User addUser(User user) {
		list.add(user);
		return user;
	}
	
	
}
