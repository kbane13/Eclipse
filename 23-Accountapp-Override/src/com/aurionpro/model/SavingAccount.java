package com.aurionpro.model;

public class SavingAccount extends Account {

	public SavingAccount(int accountno, String name, double balance) {
		super(accountno, name, balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public  void  withdraw(double amount) {
		if (getBalance() - amount > 1000) {
			amount = getBalance() - amount;
	}

}
}
