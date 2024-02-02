package com.sido;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory fact = new XmlBeanFactory(r);
		
		Employee emp = (Employee)fact.getBean("emp");
		emp.displayInfo();
	}
}
