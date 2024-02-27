package com.example;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.StudentJDBCTemplate;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		StudentJDBCTemplate sjt = (StudentJDBCTemplate)con.getBean("sjtBean");
		
		System.out.println("Records Creation : ");
		sjt.create("Satoru", "Gojo", 25);
		sjt.create("Monkey D.", "Luffy", 19);
		sjt.create("Ichigo", "Kurosaki", 20);
		
		System.out.println("\nGetting Record 1 : ");
		Student zoro = sjt.getStudent(1);
		System.out.println("Name : " + zoro.getFname() + " " + zoro.getLname() + "\nAge : " + zoro.getAge());
		
		System.out.println("\nListing Multiple Records : ");
		List<Student> stu1 = sjt.listStudents();
		
		for(Student rec : stu1) {
			System.out.println("Name : " + rec.getFname() + " " + rec.getLname() + "\nAge : " + rec.getAge());
		}
	}
}
