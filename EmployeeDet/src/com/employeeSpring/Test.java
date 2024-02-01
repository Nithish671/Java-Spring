package com.employeeSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory fact = new XmlBeanFactory(r);
		
		Employee e = (Employee)fact.getBean("emp1");
		
		e.display();
	}
}
