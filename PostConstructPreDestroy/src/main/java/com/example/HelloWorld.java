package com.example;

import javax.annotation.*;

public class HelloWorld {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init!");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean will be destroyed now...");
	}
}
