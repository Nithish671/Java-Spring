package com.example;

public class Student {
	private Integer id;
	private String fname;
	private String lname;
	private Integer age;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setFname(String fname) {
		this.fname = fname;	
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getAge() {
		return age;
	}
}
