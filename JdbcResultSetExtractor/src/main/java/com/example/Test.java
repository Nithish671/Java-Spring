package com.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDao ed = (EmployeeDao)con.getBean("empDao");
		
		List<Employee> list = ed.listEmployees();
		
		for(Employee e : list) {
			System.out.println(e);
		}
	}
}
