package com.example;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		StudentDao student = (StudentDao)con.getBean("student");
		
		System.out.println("Records Creation : ");
		student.create("Sanji", "Vinsmoke", 21, 85, 1011);
		student.create("Pudding", "Charlotte", 19, 90, 2510);
		
		System.out.println("Students List : ");
		
		List<Student> student1 = student.listStudents();
		
		for(Student rec : student1) {
			System.out.println("ID : " + rec.getId() + "\n"
					+ "Name : " + rec.getFname() + " " + rec.getLname() + "\n"
							+ "Age : " + rec.getAge() + "\n"
									+ "Marks : " + rec.getMarks() + "\n"
											+ "Year : " + rec.getYear() + "\n");
		}
		
	}
}
