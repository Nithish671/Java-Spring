package com.sido;

public class User {
	private int id;
	private String name, email;
	
	public User() {}
	
	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public String toString() {
		return "Name : " + name + "\nE-Mail : " + email;
	}
}
