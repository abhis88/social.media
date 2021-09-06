package com.social.media.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.social.media.entity.User;

@Repository
@Transactional
public class UserDaoJPA {

	//JPA
	@PersistenceContext
	EntityManager entityManager;
	
	// Select one record
	public User fetchById(int id) {
		return entityManager.find(User.class, id);
	}

}
