package com.social.media.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.social.media.entity.User;


@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<User> fetchAllUsers(){
		return jdbcTemplate.query("Select * from User", new BeanPropertyRowMapper<User>(User.class));
	}

	public User createNewUser(User user) {
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getCountry());
		System.out.println(user.getDateOfBirth());

		//jdbcTemplate.query("insert into User values")
		return null;
	}
}
