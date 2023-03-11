package com.aurionpro.test;

import com.aurionpro.model.ThreadExtend;

public class AnonymousTest {

	public static void main(String[] args) {
		ThreadExtend te = new ThreadExtend();
		System.out.println("Thread Starts");
		te.start();
	}

}
