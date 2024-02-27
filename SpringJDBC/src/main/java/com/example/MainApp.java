package com.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.StudentJDBCTemplate;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		StudentJDBCTemplate student = (StudentJDBCTemplate)con.getBean("student");
		
		System.out.println("Records Creation : ");
		student.create("Sanji", "Vinsmoke", 21);
		
		System.out.println("\nGet Record by Id : 16");
		Student student1 = student.getStudent(16);
		
		System.out.println("Id : " + student1.getId());
		System.out.println("FirstName : " + student1.getFname());
		System.out.println("LastName : " + student1.getLname());
		System.out.println("Age : " + student1.getAge());
		
		System.out.println("\nMultiple Records of Students");
		
		List<Student> student2 = student.listStudents();
		
		for(Student rec : student2) {
			System.out.println("Id : " + rec.getId());
			System.out.println("FirstName : " + rec.getFname());
			System.out.println("LastName : " + rec.getLname());
			System.out.println("Age : " + rec.getAge() + "\n");
		} 
		
		System.out.println("Deleting the Record : " + 15);
		student.delete(15);
		
		System.out.println("\nUpdating the Record : " + 2);
		
		student.update(2, 30);
	}

}
