package com.awName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
		S s = (S)con.getBean("s", S.class);
		s.display();
	}
}
