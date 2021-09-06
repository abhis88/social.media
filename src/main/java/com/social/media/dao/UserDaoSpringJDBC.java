package com.social.media.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.social.media.entity.User;

@Repository
public class UserDaoSpringJDBC {

	//Spring JDBC
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// Select more than one record
	public List<User> fetchAllUsers(){
		//this works, but you can also define custom row mapper
		return jdbcTemplate.query("Select * from User", new BeanPropertyRowMapper<User>(User.class));
	}

	// Select one record
	public User fetchById(int id) {
		return jdbcTemplate.queryForObject("select * from user where id=?", new Object[] {id}, new BeanPropertyRowMapper<User>(User.class));
	}
	
	// Insert a record
	public int createNewUser(User user) {		
		System.out.println(user.getCountry());
		return jdbcTemplate.update("insert into User(firstname, lastname, dateofbirth, country) values (?,?,?,?)", 
				new Object[] {user.getFirstName(), user.getLastName(), user.getDateOfBirth(), user.getCountry()});
	}
	
	// Delete a record
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from user where id=?", new Object[] {id});
	}

	// Update a record
	public int updateUser(User user) {
		return jdbcTemplate.update(
				"update User "
				+ "set firstname = ?, lastname = ?, dateofbirth = ?, country = ?, profilebiomessage = ?, membersincedate = ?"
				+ "where id = ?",
				new Object[] {user.getFirstName(), user.getLastName(), user.getDateOfBirth(), user.getCountry().toString(), user.getProfileBioMessage(), user.getMemberSinceDate(), user.getId()});
	}
}
