package com.aurionpro.model;

public class Account {
	private int accountno;
	private double max;
	private String name;
	private double balance;
	public Account(int accountno,String name, double balance) {
		this.accountno=accountno;
		this.name=name;
		this.balance=balance;
	}
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", name=" + name + ", balance=" + balance + "]";
	}
	public Account(int accountno,String name) {
		this(accountno,name,1000);
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
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
	public void  deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(balance-amount>1000) {
			balance=balance-amount;
		}
	}

}
