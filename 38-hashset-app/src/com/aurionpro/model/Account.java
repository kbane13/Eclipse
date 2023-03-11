package com.aurionpro.model;



public class Account{
	
	private int accountnumber;
	private String name;
	private double balance;
	public Account(int accountnumber, String name, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
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
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountnumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountnumber != other.accountnumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + "]\n";
	}
//	@Override
//	public int compareTo(Account o) {
//		// TODO Auto-generated method stub
//		//return Double.compare(balance,o/balance);for descending or ascending
//		return name.compareTo(o.name);
//		
//	}
	

}
