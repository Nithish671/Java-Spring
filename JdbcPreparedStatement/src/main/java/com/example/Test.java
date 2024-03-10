package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDao ed = (EmployeeDao)con.getBean("empDao");
		
		ed.saveEmployee(new Employee("Armin", 10000));
	}
}
