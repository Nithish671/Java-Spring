package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld obj = (HelloWorld)con.getBean("hwObj");
		System.out.println(obj.getMessage());
		
		con.registerShutdownHook();
	}
}
