package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDao eDao = (EmployeeDao)con.getBean("eDao");
		
		
		 eDao.saveEmployee(new Employee("Rukia", 50000)); 
		 eDao.saveEmployee(new Employee("Mikasa", 50000)); 
		 eDao.saveEmployee(new Employee("Eren", 50000));
		  
		 eDao.updateEmployee(new Employee(11 ,"Renji", 50000));
		
		
		List<Employee> emp = eDao.listEmployee();
		
		System.out.println("\nEmployee List : ");
		
		for(Employee e : emp) {
			System.out.println("Id : " + e.getId() + "\nName : " + e.getName()  + "\n"
					+ "Salary : " + e.getSalary() + "\n");
		}
	}
}
 




