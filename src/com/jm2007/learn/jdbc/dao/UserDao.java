package com.jm2007.learn.jdbc.dao;

import com.jm2007.learn.jdbc.User;

public interface UserDao {
	
	void saveUser(User user);
	
	User getUser(int id);
	
	String getUserName(int id);
}
