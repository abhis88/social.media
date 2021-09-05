package com.social.media.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.media.dao.UserDao;
import com.social.media.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public List<User> fetchAllUsers () {
		return userDao.fetchAllUsers();	
	}

	public User createNewUser(User user) {
		return userDao.createNewUser(user);
	}
	
}
