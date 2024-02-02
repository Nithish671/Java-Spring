package com.sido;

public class Address {
	private String addLine, city, state, country;
	
	public void setAddLine(String addLine) {
		this.addLine = addLine;
	}
	
	public String getAddLine() {
		return addLine;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String toString() {
		return addLine + ", \n" + city + ", \n" + state + ", \n" + country + ".";
	}
}
