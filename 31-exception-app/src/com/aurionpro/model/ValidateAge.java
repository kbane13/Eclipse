package com.aurionpro.model;

import java.util.Scanner;

public class ValidateAge {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		//validateAge(age);
		try {
			validateAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		System.out.println("End of Code");
	}

	private static void validateAge(int age) throws InvalidAgeException {
		if(age>=18) {
			System.out.println(" you are Eligible");
		}
		else {
			throw new InvalidAgeException(" Under Age");
		}
	}
	

}
