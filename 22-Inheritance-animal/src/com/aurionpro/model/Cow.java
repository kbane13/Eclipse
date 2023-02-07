package com.aurionpro.model;

public class Cow extends Animal {

	public Cow(String name, boolean isCarnivorous) {
		super("Cow", false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Cow is eating");
	}

}
