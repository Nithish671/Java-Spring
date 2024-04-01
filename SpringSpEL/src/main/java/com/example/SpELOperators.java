package com.example;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import java.util.Date;

public class SpELOperators {
	
	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		
		System.out.println(parser.parseExpression("'Welcome SPEL'+'!'").getValue() + "\n");
		 
		System.out.println(parser.parseExpression("'10 * 10/2'").getValue() + "\n");
		
		System.out.println(parser.parseExpression("'Today is : ' + new java.util.Date()").getValue() + "\n");
		
		System.out.println("\n" + parser.parseExpression("'true and true'").getValue() + "\n");
		
		System.out.println("\n" + parser.parseExpression("'sonoo'.length() == 5").getValue());
		
	}
	
}
