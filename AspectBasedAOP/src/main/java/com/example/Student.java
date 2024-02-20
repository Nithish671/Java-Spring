package com.example;

public class Student {
	private String name;
	private Integer age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getAge() {
		System.out.println("Age : " + age);
		return age;
	}
	
	public void printThrowEx() {
		System.out.println("Exception raised : ");
		throw new IllegalArgumentException();
	}
}
