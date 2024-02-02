package com.sic2;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<Answer> ans;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getid() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	public String getname() {
		return name;
	}
	
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	
	public List<Answer> getAns() {
		return ans;
	}
	
	public void displayInfo() {
		System.out.println(id + " . " + name);
		System.out.println("Answers : ");
		
		Iterator<Answer> itr = ans.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
