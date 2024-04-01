package com.example;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test1 {
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		
		StandardEvaluationContext con = new StandardEvaluationContext(cal);
		
		ExpressionParser parser = new SpelExpressionParser();
		
		parser.parseExpression("number").setValue(con, "5");
		
		System.out.println(cal.cube());
		
	}
	
}
