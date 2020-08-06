package com.satya.dto;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter method is called");
		this.name = name;
		throw(new RuntimeException());
	}
//	public String setNameandReturn(String name) {
//		System.out.println("setter return method is called");
//		this.name = name;
//		return name;
//	}
	
}
