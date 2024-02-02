package com.sido;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question {
	private int id;
	private String name;
	private Map<Answer, User> anss;
	
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
	
	public void setAnss(Map<Answer, User> anss) {
		this.anss = anss;
	}
	
	public void displayInfo() {
		System.out.println("Question : ");
		System.out.println(id + " . " + name);
		System.out.println("Answers : ");
		
		Set<Entry<Answer, User>> set = anss.entrySet();
		Iterator<Entry<Answer, User>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry<Answer, User> entry = itr.next();
			Answer ans = entry.getKey();
			User user = entry.getValue();
			System.out.println(ans);
			System.out.println("Posted By : ");
			System.out.println(user);
		}
	}
}
