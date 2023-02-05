package com.aurion.pro.model;

public class Parent {
	static int count;	
public Parent(String message) {

	System.out.println("I am parent class " +message);
	
}
//static block 
static {
	System.out.println("I am Static (Parent)");
}
}
