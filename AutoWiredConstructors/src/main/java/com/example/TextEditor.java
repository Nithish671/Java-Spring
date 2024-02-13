package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellC;
	
	@Autowired
	public TextEditor(SpellChecker spellC) {
		System.out.println("Inside TextEditor Constructor...");
		this.spellC = spellC;
	}
	
	public void spellCheck() {
		spellC.checkSpelling();
	}
}
