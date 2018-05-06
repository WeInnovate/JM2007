package com.jm2007.learn.jdbc.dao;

import com.jm2007.learn.jdbc.User;

public class UserApplication {

	public static void main(String[] args) {
		UserDaoImpl obj = new UserDaoImpl();
		
		/*
		User user = obj.getUser(500);
		System.out.println(user);
		*/
		
		/*User u = new User(500, "A1");
		obj.saveUser(u);*/
		
		String un = obj.getUserName(500);
		System.out.println(un);
	}

}
