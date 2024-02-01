package com.Dic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory fact = new XmlBeanFactory(r);
		
		Employee s = (Employee)fact.getBean("emp1");
		s.show();
		
		Employee s1 = (Employee)fact.getBean("emp2");
		s1.show();
		
		Employee s2 = (Employee)fact.getBean("emp3");
		s2.show();
		
		Employee s3 = (Employee)fact.getBean("emp4");
		s3.show();
	}
}
