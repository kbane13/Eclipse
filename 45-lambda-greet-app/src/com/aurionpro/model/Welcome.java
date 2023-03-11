package com.aurionpro.model;

public class Welcome implements IGreetable {

	@Override
	public void greet(String name) {
		System.out.println("Welcome"+name);
	}
	

}
