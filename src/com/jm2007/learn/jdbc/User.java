package com.jm2007.learn.jdbc;

public class User {
	
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	public User() {
		super();
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
