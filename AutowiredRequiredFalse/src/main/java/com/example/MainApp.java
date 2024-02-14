package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = (Student)con.getBean("student");
		
		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
	}
}
