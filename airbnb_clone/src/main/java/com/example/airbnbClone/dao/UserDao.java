package com.example.airbnbClone.dao;

import com.example.airbnbClone.entity.User;

public interface UserDao {
	public User addUser(User theUser);
	public User getUser(User theUser);
}
