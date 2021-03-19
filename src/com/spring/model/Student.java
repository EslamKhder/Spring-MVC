package com.spring.model;

import java.util.HashMap;

public class Student {

	private String fName;
	
	private String lName;
	
	private String age;
	
	private String country;
	
	private String language;
	
	private String []players;
	
	private HashMap<String, String> countryOptions;
	
	
	public Student() {
		countryOptions = new HashMap<>();
		countryOptions.put("Egypt", "EG");
		countryOptions.put("Brazel", "BR");
		countryOptions.put("France", "FR");
		countryOptions.put("Germany", "GE");
		
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(HashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}
	
	
	
}
