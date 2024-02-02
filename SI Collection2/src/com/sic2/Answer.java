package com.sic2;

public class Answer {
	private int id;
	private String name;
	private String by;
	
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
	
	public void setBy(String by) {
		this.by = by;
	}
	
	public String getBy() {
		return by;
	}
	
	public String toString() {
		return "\n" + id + " . Ans : " + name + ".\n Posted By : " + by + "\n";
	}
}
