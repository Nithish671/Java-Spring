package com.sim;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question {
	private int id;
	private String name;
	private Map<String, String> ans;
	
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
	
	public void setAns(Map<String, String> ans) {
		this.ans = ans;
	}
	
	public Map<String, String> getAns() {
		return ans;
	}
	
	public void displayInfo() {
		System.out.println(id + " . " + name);
		System.out.println("Answers : ");
		
		Set<Entry<String, String>> set = ans.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("\nAnswer : " + entry.getKey() + "\nPosted By : " + entry.getValue());
		}
		
	}
}
