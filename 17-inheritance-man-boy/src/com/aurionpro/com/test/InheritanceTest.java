package com.aurionpro.com.test;

import com.aurionpro.com.Man;
import com.aurionpro.com.boy;
import com.aurionpro.com.kid;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		case1();
		case2();

	}

	private static void case2() {
		Man man=new boy();
		man.eat();
		man.swim();
		man.play();
		
		
	}

	private static void case1() {
		// TODO Auto-generated method stub
		boy b=new boy();
		b.eat();
		b.swim();
		 kid k=new kid();
		 k.eat();
		 k.swim();
	}

}
