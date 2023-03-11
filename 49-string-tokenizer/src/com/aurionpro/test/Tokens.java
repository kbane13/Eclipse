package com.aurionpro.test;

import java.util.StringTokenizer;

public class Tokens {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("My name is krutika");
		System.out.println("Has more Tokens:" + st.hasMoreTokens());
		System.out.println(st.countTokens());// counting tokens
		System.out.println("Has more Elements:" + st.hasMoreElements());// checks whether the ements are there
		System.out.println("Next Element:" + st.nextElement());// displays next element

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}