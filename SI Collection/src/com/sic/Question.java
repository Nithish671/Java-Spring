package com.sic;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> ans;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	
	public List<String> getAns() {
		return ans;
	}
	
	public void displayInfo() {
		System.out.println(id + " : " + name);
		System.out.println("Answers : ");
		Iterator<String> itr = ans.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
