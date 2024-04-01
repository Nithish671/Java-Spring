package com.example;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	
	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		
		Expression exp = parser.parseExpression("'Hello SPEL'");
		
		String msg = (String)exp.getValue();
		
		System.out.println(msg);
		
		System.out.println(parser.parseExpression("'Hello World'").getValue());
		
		Expression exp1 = parser.parseExpression("'Welcome SPEL'.concat('!')");
		
		System.out.println((String)exp1.getValue() + "\n");
		
		Expression exp2 = parser.parseExpression("'Hello World'.bytes");
		
		byte[] bytes = (byte[])exp2.getValue();
		
		for(int i = 0;i < bytes.length;i++) {
			System.out.println(bytes[i] + " ");
		}
		
		exp2 = parser.parseExpression("'Hello World'.bytes.length");
		
		int length = (Integer)parser.parseExpression("'Hello World'.bytes.length").getValue();
		
		System.out.println("\n" + length);
		
		exp2 = parser.parseExpression("new String('hello world').toUpperCase()");
		
		msg = exp2.getValue(String.class);
		
		System.out.println("\n" + msg + "\n");
		
		System.out.println(parser.parseExpression("'hello world'.toUpperCase").getValue());
		
	}

}
