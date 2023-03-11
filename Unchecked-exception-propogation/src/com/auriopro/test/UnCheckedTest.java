package com.auriopro.test;

public class UnCheckedTest {

	public static void main(String[] args) {
		try {
		method1();
		}
		catch(RuntimeException e){
		System.out.println(e.getMessage());
		}
		System.out.println("main");
	}

	private static void method1() {
		method2();
		System.out.println("method 1");
		
	}

	private static void method2()  {
		method3();
		System.out.println("method 2");
	}

	private static void method3() {
		throw new RuntimeException("an exception occurred");
	}

}
