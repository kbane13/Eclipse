package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account(1000, "krutika", 4000);
		
		Account acc1=new Account(2000,"Rasika",3000);
		
		Account acc2=new Account(3000,"Komal",4000);
		int con=Account.AccountCount();
		System.out.println(con);
//		PrintaccDetails(acc);
//		withdraw(acc, 1000);
//		deposit(acc, 1000);

		//PrintaccDetails(acc);
 
	}

	
}
