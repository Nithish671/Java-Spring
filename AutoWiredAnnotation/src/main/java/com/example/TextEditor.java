package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellC;
	
	@Autowired
	public void setSpellC(SpellChecker spellC) {
		this.spellC = spellC;
	}
	
	public SpellChecker getSpellC() {
		return spellC;
	}
	
	public void spellCheck() {
		spellC.checkSpelling();
	}
}
