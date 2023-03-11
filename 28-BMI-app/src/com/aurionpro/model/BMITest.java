package com.aurionpro.model;

public class BMITest {

	public static void main(String[] args) {
		Person p=new Person("Krutika", 22,2,80);
 BMI b=new BMI(p);
 System.out.println(b.getBMI());
 b.getBodyType();
	   

	}

}
