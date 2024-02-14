package com.example;

import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public TextEditor txBean() {
		return new TextEditor(spellC());
	}
	
	@Bean
	public SpellChecker spellC() {
		return new SpellChecker();
	}
	
}
