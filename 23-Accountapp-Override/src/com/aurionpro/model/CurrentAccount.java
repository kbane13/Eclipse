package com.aurionpro.model;

public class CurrentAccount extends Account {
	private int OVER_DRAFT_LIMIT= -20000;

	public CurrentAccount(int accountno, String name, double balance) {
		super(accountno, name, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public  void  withdraw(double amount) {
		
		 if (getBalance() - amount > OVER_DRAFT_LIMIT) {
		System.out.println("overdrafted");
		}
	}

}
