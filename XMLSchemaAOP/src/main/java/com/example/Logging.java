package com.example;

public class Logging {
	public void beforeAdvice() {
		System.out.println("Going to setup Student Profile...");
	}
	
	public void afterAdvice() {
		System.out.println("Student Profile has been setup!");
	}
	
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning : " + retVal.toString());
	}
	
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an Exception : " + ex.toString());
	} 
}
