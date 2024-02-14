package com.example;

import org.springframework.context.annotation.*;


@Configuration
@Import(TextEditorConfig.class)
public class HelloWorldConfig {
	@Bean
	public HelloWorld hwBean() {
		return new HelloWorld();
	}
	
	@Bean
	@Scope("prototype")
	public Satoru gojoObj() {
		return new Satoru();
	}
}
