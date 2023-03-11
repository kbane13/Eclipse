package com.auriopro.test;

public class CheckedTest {

	public static void main(String[] args) {
		try {
		method1();
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}
		System.out.println("main");
	}

	private static void method1() throws Exception {
		method2();
		System.out.println("method 1");
		
	}

	private static void method2() throws Exception {
		method3();
		System.out.println("method 2");
	}

	private static void method3() throws Exception {
		throw new Exception("an exception occurred");
	}

}
