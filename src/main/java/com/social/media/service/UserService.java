package com.social.media.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.media.dao.UserDaoJPA;
import com.social.media.dao.UserDaoSpringJDBC;
import com.social.media.entity.User;

@Service
public class UserService {

	@Autowired
	UserDaoSpringJDBC userDao;
	@Autowired
	UserDaoJPA userDaoJpa;
	
	// using Spring JDBC
	public List<User> fetchAllUsers () {
		return userDao.fetchAllUsers();	
	}

	public int createNewUser(User user) {
		return userDao.createNewUser(user);
	}
	
	public User fetchAUser(int id) {
		return userDao.fetchById(id);
	}
	
	public int deleteById(int id) {
		return userDao.deleteById(id);
	}
	
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}
	
	// using JPA
	public User findAUser(int id) {
		
		User user = userDaoJpa.fetchById(id);
		
		if(user == null) {
			System.out.println("No records found with id "+id);
		}
		
		return userDaoJpa.fetchById(id);
	}
	
	public User insert(User user) {
		return userDaoJpa.insert(user);
	}
	
	public User update(User user) {
		return userDaoJpa.insert(user);
	}
	
	public void delete(int id) {
		userDaoJpa.delete(id);
	}
	
	// using JPQL - Java Persistence Query Language
	
	public List<User> findAll() {
		return userDaoJpa.findAll();
	}
	
}
