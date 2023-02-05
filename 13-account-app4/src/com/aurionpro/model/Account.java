package com.aurionpro.model;

public class Account {
	private String accountno;
	private String name;
	private double balance;
	private static int count;

	public Account(String accountno, String name, double balance) {
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
		count++;
	}

	public Account(String accountno, String name) {
		this(accountno, name, 1000);
	}

	public Account(int accountno) {
		this.accountno = 1000;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int AccountCount() {
		return count;
	}
//
//	public boolean withdraw(double amount) {
//		if (balance - amount > 1000) {
//			balance = balance - amount;
//			return true;
//		}  
//			return false;

}
