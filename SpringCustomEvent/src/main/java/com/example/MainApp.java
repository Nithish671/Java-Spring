package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		CustomEventPublisher cv = (CustomEventPublisher)con.getBean("customEventPublisher");
		
		cv.publish();
		cv.publish();
	}
}
