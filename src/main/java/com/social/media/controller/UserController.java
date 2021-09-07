package com.social.media.controller;

import java.net.Authenticator.RequestorType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.social.media.entity.User;
import com.social.media.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	// Using Spring JPA
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> fetchAllUsers(){
		return userService.fetchAllUsers();
	}
	
	@PostMapping("/createUser")
	public int createNewUser(@RequestBody User user){
		return userService.createNewUser(user);
	}
	
	@GetMapping("/fetchSingleUser/{id}")
	public User fetchASingleUser(@PathVariable int id) {
		return userService.fetchAUser(id);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public int deleteUserById(@PathVariable int id) {
		return userService.deleteById(id);
	}
	
	@PutMapping("/updateUser")
	public int updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	
	// Using JPA
	@GetMapping("/findAUser/{id}")
	public User findAUser(@PathVariable int id) {
		return userService.findAUser(id);
	}

	@PostMapping("/createAUser")
	public User insert(@RequestBody User user) {
		return userService.insert(user);
	}
	
	@GetMapping("/UpdateAUser")
	public User update(@RequestBody User user) {
		return userService.update(user);
	}
	
	@DeleteMapping("/deleteAUser/{id}")
	public void delete(@PathVariable int id) {
		userService.delete(id);
	}
	
	@GetMapping("/findAll")
	public List<User> findAll() {
		return userService.findAll();
	}

}
