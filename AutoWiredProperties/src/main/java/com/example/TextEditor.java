package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	@Autowired
	private SpellChecker spellC;
	
	public TextEditor() {
		System.out.println("Inside TextEditor constructor...");
	}
	
	public SpellChecker getSpellC() {
		return spellC;
	}
	
	public void spellCheck() {
		spellC.checkSpelling();
	}
}
