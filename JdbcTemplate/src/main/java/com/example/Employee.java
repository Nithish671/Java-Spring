package com.example;

public class Employee {
	private int id;
	private String name;
	private float salary;
	
	public Employee() {}
	
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	public Float getSalary() {
		return salary;
	}
}
