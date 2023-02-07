package com.aurionpro.model;

public class Account {
 @Override
	public String toString() {
		return "Account [accountno=" + accountno + ", name=" + name + ", balance=" + balance + "]";
	}
private int accountno;
 private String name;
 private double balance;
public Account(int accountno, String name, double balance) {
super();
this.accountno=accountno;
this.name=name;
this.balance=balance;
	
}
public Account(int accountno,String name) {
	this(accountno,name,10000);
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
public  void  withdraw(double amount) {
//	if (balance - amount > 1000) {
//		balance = balance - amount;
//		return true;
//	}  
//		return false;
		
} 
}
