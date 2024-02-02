package com.CIdo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext.xml");
		
		BeanFactory fact = new XmlBeanFactory(r);
		
		Employee s = (Employee)fact.getBean("emp");
		s.show();
	}
}
