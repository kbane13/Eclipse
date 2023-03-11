package com.aurionpro.model;

public class InsufficientFundsException extends Exception {

	Account account;
	double amount;

	public InsufficientFundsException(Account account, double amount) {
		this.account = account;
		this.amount = amount;

	}

	public String getMessage() {
		return this.getClass() .getName()+ " :" + account + " \nAccountno:" + account.getAccountnumber() + " \nCurrent Balance"
				+ account.getBalance() + " \nMinimum balance is 1000";
	}

}

//@Override
//public String getMessage() {
//	return this.getClass()+" "+msg;
//}
