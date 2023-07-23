package com.kamal.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kamal.model.User;
import com.kamal.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/")
	public List<User> getAllUser(){
		return userService.getAllUsers();
	}
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") String user) {
		return userService.getUser(user);
	}
	@PostMapping("/")
	public User addUSer(@RequestBody User user){
		return userService.addUser(user);
	}

}
