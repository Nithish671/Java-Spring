package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld hwObj = (HelloWorld)ctx.getBean(HelloWorld.class);
		hwObj.setMessage("Hello World");
		System.out.println(hwObj.getMessage());
		
		Satoru gojoObj = (Satoru)ctx.getBean("gojoObj");
		Satoru gojoObj1 = (Satoru)ctx.getBean(Satoru.class);
		gojoObj.setName("Satoru Gojo");
		gojoObj.setDomain("Infinite Void");
		
		System.out.println("\nName : " + gojoObj.getName());
		System.out.println("Domain : " + gojoObj.getDomain());
		
		TextEditor txBean = (TextEditor)ctx.getBean("txBean");
		txBean.spellCheck();
		
		TextEditor txBean1 = (TextEditor)ctx.getBean(TextEditor.class);
		txBean1.spellCheck();
		
		System.out.println("\nName : " + gojoObj1.getName());
		System.out.println("Domain : " + gojoObj1.getDomain());
	}
}
