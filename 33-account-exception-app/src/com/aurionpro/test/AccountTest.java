package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientFundsException;

public class AccountTest {

	public static void main(String[] args) {
		Account acc=new Account(1,"krutika",2000);
		try {
			acc.withdraw(300);
			System.out.println("withdrawal success");//if withdrawn is successfull
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());//throws exception
		}
	}
}
