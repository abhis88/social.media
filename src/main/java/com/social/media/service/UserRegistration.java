package com.social.media.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistration {

	@GetMapping ("/welcome")
	public String welcomeToApplicationMessage() {
		return "Welcome to my Social Media Application. Enjoy";
	}
}
