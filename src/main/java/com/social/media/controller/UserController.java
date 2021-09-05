package com.social.media.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.social.media.entity.User;
import com.social.media.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> fetchAllUsers(){
		return userService.fetchAllUsers();
	}
	
	@PostMapping("/createUser")
	public User createNewUser(@RequestBody User user){
		return userService.createNewUser(user);
	}
}
