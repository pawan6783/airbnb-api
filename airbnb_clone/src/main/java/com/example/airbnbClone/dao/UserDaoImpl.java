package com.example.airbnbClone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.airbnbClone.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	private EntityManager entityManager;
	
	@Autowired
	public UserDaoImpl(EntityManager entityManager) {
		super();
		// TODO Auto-generated constructor stub
		this.entityManager = entityManager;
	}


	@Override
	public User addUser(User theUser) {
		// TODO Auto-generated method stub
		entityManager.persist(theUser);
		return theUser;
	}


	@Override
	public User getUser(User theUser) {
		// TODO Auto-generated method stub
		Query theQuery = entityManager.createQuery("Select u from User u where u.email = :email and u.password = :password");
		theQuery.setParameter("email", theUser.getEmail());
		theQuery.setParameter("password", theUser.getPassword());
		List<User> users = theQuery.getResultList();
		
		User user = null;
		if(users!=null && users.size()==1) {
			 user = (User) users.get(0);
		}
		return user;
	}
}
