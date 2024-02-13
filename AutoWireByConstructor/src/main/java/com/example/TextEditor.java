package com.example;

public class TextEditor {
	private SpellChecker spellC;
	private String name;
	
	public TextEditor(SpellChecker spellC, String name) {
		this.spellC = spellC;
		this.name = name;
	}
	
	public SpellChecker getSpellChecker() {
		return spellC;
	}
	
	public String getName() {
		return name;
	}
	
	public void spellCheck() {
		spellC.checkSpelling();
	}
}
