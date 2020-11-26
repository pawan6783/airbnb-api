package com.example.airbnbClone.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airbnbClone.dao.UserDao;
import com.example.airbnbClone.entity.User;

@Service
public class UserServiceImpl implements UserService{


	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(UserDao userDao){
		super();
		// TODO Auto-generated constructor stub
		this.userDao = userDao;
	}


	@Override
	@Transactional
	public User addUser(User theUser) {
		// TODO Auto-generated method stub
		userDao.addUser(theUser);
		return theUser;
	}


	@Override
	public User getUser(User theUser) {
		// TODO Auto-generated method stub
		User user = userDao.getUser(theUser);
		return user;
	}

}
