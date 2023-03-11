package com.aurionpro.test;

import com.aurionpro.model.IGreetable;

public class GreetTest {

	public static void main(String[] args) {
		
//		
//	IGreetable obj=(name)->System.out.println("Good morning "+name);
//	obj.greet("Krutika");	
		//lambda
		IGreetable obj1=(n)->System.out.println("Welcome : "+n);
		obj1.greet("Komal");
		//method reference 
		IGreetable obj2=GreetTest::welcome;
		obj2.greet("Riya");
		GreetTest test=new GreetTest();
		IGreetable obj3=test::Hello;
		obj3.greet("Rasika");
	
	}
	
	
	public static void welcome(String name) {
		System.out.println("Hii  "+name);
	}
	public  void Hello(String name) {
		System.out.println("Hello! "+name);
	}
}


