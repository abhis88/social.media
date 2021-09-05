package com.social.media.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessage {

	@GetMapping ("/welcome")
	public String welcomeToApplicationMessage() {
		System.out.println("from Welcome Message page");
		return "Welcome to my Social Media Application. Enjoy";
	}

}
