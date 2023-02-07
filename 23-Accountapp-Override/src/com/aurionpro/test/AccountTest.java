package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		SavingAccount sv=new SavingAccount(100,"krutika",100000);
		System.out.println( "Saving "+sv);
		
		CurrentAccount ca=new CurrentAccount(100,"Krutika",10000);
		System.out.println( "Current"+ca);
		ca.withdraw(20000);
		System.out.println("Account no :"+ca.getAccountno());
		
		
	
	}

}
