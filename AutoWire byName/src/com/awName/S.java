package com.awName;

public class S {
	N n;
	
	S() {System.out.println("S is Created!");}
	
	public N getN() {
		return n;
	}
	
	public void setN(N n) {
		this.n = n;
	}
	
	void print() {System.out.println("Hello S!");}
	
	void display() {
		print();
		n.print();
	}
}
