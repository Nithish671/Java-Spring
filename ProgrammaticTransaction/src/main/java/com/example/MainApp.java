package com.example;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		StudentJDBCTemplate student = (StudentJDBCTemplate)con.getBean("student"); 
		
		System.out.println("Records Creation : ");
		
		student.create("Orihime", "Inoue", 23, 95, 2000);
		student.create("Ichigo", "Kurosaki", 21, 79, 2002);
		
		System.out.println("Students List : ");
		
		List<Student> studentList = student.listStudents();
		
		for(Student rec : studentList) {
			System.out.println("ID : " + rec.getId() + "\n"
					+ "Name : " + rec.getFname() + " " + rec.getLname() + "\n"
							+ "Age : " + rec.getAge() + "\n"
									+ "Marks : " + rec.getMarks() + "\n"
											+ "Year : " + rec.getYear() + "\n");
		}
		
	}
}
