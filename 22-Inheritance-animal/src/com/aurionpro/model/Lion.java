package com.aurionpro.model;

public class Lion extends Animal {

	public Lion(String name, boolean isCarnivorous) {
		super("Lion", true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Lion is eating");
	}

}
