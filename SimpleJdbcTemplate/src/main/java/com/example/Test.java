package com.example;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		EmpDao ed = (EmpDao)con.getBean("empDao");
		
		ed.update("Sanji", 5);
		
		List<Employee> empList = ed.listEmployees();
		
		System.out.println("\nList of Employees : ");
		
		for(Employee e : empList) {
			System.out.println("Id : " + e.getId() + "\n"
					+ "Name : " + e.getName() + "\n"
							+ "Salary : " + e.getSalary() + "\n");
		}
	}
}
