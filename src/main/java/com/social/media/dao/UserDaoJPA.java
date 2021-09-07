package com.social.media.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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

	// Insert a User
	public User insert(User user) {
		return entityManager.merge(user);
	}

	// Update a User
	public User update(User user) {
		return entityManager.merge(user);
	}

	// Delete a User
	public void delete(int id) {
		User userToBeRemoved = fetchById(id);
		entityManager.remove(userToBeRemoved);
	}
	
	// using JPQL - Java Persistence Query Language
	
	public List<User> findAll() {
		
		TypedQuery<User> namedQuery = entityManager.createNamedQuery("find_all_users", User.class);
		return namedQuery.getResultList();
		
	}

}

