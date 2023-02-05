package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account(1000, "krutika", 4000);
		PrintaccDetails(acc);
		withdraw(acc, 1000);
		deposit(acc, 1000);

		//PrintaccDetails(acc);

	}

	private static void deposit(Account acc, int amount) {
		if (acc.withdraw(amount)) {
			System.out.println("withdraw successfully");
			System.out.println("your balance " + acc.getBalance());

		} else {
			System.out.println("not withdraw successfully");
		}

	}

	private static void withdraw(Account acc, int amount) {
		if (acc.deposit(amount)) {
			System.out.println("deposited successfully");
			System.out.println("your balance " + acc.getBalance());
		} else {
			System.out.println("not deposited");
		}
	}

	private static void PrintaccDetails(Account acc) {
		/*System.out.println("name:" + acc.getName());
		System.out.println("accountno:" + acc.getAccountno());
		System.out.println("withdraw:" + acc.getBalance());*/
	}
}
