package com.example;

public class Calculation {
	
	private int number;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int cube() {
		return number * number * number;
	}
	
}
