package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account[] accounts = { new Account(10, "krutika", 4000), new Account(20, "Rasika", 4000),
				new Account(30, "Komal", 50), new Account(60, "sheetal", 7000), new Account(80, "Sakshi", 9000) };
		// highest balance
		double max = accounts[0].getBalance();
		int index = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (max < (accounts[i].getBalance())) {
				max = accounts[i].getBalance();
				index = i;
			}
		}
		System.out.println("highest balance" + accounts[index]);
		System.out.println();
		
		for (int i = 0; i < accounts.length; i++) {
			for (int j = i + 1; j < accounts.length; j++) {
				if (accounts[i].getBalance() < accounts[j].getBalance()) {
					System.out.println("Sorting balance");
					 Account temp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = temp;
				}
			}
		}

		for (Account x : accounts) {

			PrintaccDetails(x);
		}
		

		

		
	}

	private static void PrintaccDetails(Account acc) {

		System.out.println("accountno:" + acc.getAccountno());
		System.out.println("name:" + acc.getName());
		System.out.println("balance:" + acc.getBalance());
	}

}
