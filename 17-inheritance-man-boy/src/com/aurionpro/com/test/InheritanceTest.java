package com.aurionpro.com.test;

import com.aurionpro.com.Man;
import com.aurionpro.com.boy;
import com.aurionpro.com.kid;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		case1();
//		case2();
		//case3();
		case4();//AutoBoxing 
		
	}

	private static void case4() {// TODO Auto-generated method stub
	 Object x;
	 x=100;//Auto boxing Integer
	 System.out.println(x.getClass());
	 x="hello";
	 System.out.println(x.getClass());
	 x=true;
	 System.out.println(x.getClass());
	}

	private static void case3() {//polymorphism one method hold parents and child class
		atThePark(new Man());
		atThePark(new boy());
		atThePark(new kid());
	}

	private static void atThePark(Man man) {
		man.eat();

	}

	private static void case2() {
		System.out.println("case 2");
		Man man = new boy();
		man.eat();
		man.swim();// cannot call method inside the boy class
		man.play();
		man.dance();

	}

	private static void case1() {
		// TODO Auto-generated method stub
		System.out.println("case1");
		boy b = new boy();
		b.eat();
		b.swim();
		b.play();
		kid k = new kid();
		k.eat();
		k.swim();
	}

}
