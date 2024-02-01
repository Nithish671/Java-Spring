package com.springDemo;

public class Hello {
	private String name;
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("Hello " + name);
	}
}
