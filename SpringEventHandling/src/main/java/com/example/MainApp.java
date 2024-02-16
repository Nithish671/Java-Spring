package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new ClassPathXmlApplicationContext("beans.xml"); 
		
		con.start();
		
		HelloWorld obj = (HelloWorld)con.getBean("hwBean");
		System.out.println(obj.getMessage());
		
		con.stop();
	}
}
