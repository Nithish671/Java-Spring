package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDao ed = (EmployeeDao)con.getBean("empDao");
		ed.save(new Employee("Itachi", 50000));
	}
}
