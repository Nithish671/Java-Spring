package com.sido;

import java.util.Date;

public class Answer {
	private int id;
	private String ans;
	private Date pDate;
	
	public Answer() {}
	
	public Answer(int id, String ans, Date pDate) {
		super();
		this.id = id;
		this.ans = ans;
		this.pDate = pDate;
	}
	
	public String toString() {
		return "\nAnswer : "+ id + " . " + ans + "\nPosted in : " + pDate;
	}
}
