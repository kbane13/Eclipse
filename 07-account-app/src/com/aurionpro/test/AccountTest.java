package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[]args) {
		Account acc= new Account(1000,"krutika",4000);
		PrintaccDetails(acc);
		acc.withdraw(1000);
		PrintaccDetails(acc);
		
		
	}

	private static void PrintaccDetails(Account acc) {
	System.out.println("name:"+acc.getName());
	System.out.println("accountno:"+acc.getAccountno());
	System.out.println("withdraw:"+acc.getBalance());
		}

}
