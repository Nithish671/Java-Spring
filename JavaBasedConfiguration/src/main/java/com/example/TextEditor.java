package com.example;

public class TextEditor {
	private SpellChecker spellC;
	
	public void init() {
		System.out.println("Initializing the Bean...");
	}
	
	public void destroy() {
		System.out.println("Destroying the Bean...");
	}
	
	public TextEditor(SpellChecker spellC) {
		this.spellC = spellC;
	}
	
	public void spellCheck() {
		spellC.checkSpelling();
	}
}
