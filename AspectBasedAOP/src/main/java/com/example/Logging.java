package com.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;

@Aspect
public class Logging {
	@Pointcut("execution(* com.example.Student.printThrowEx(..))")
	private void PrintEx() {}
	
	@Pointcut("execution(* com.example.Student.getName(..))")
	private void selectGetName() {}
	
	@Pointcut("execution(* com.example.*.*(..))")
	private void selectAll() {}
	
	@Before("selectGetName()")
	public void beforeAdvice() {
		System.out.println("Going to Setup Student Profile...");
	}
	
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("Student Profile has been Setup!");
	}
	
	@AfterReturning(pointcut = "selectAll()", returning = "retVal")
	public void afterReturiningAdvice(Object retVal) {
		System.out.println("Returning : " + retVal);
	}
	
	@AfterThrowing(pointcut = "PrintEx()", throwing = "ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception : " + ex);
	} 
}
