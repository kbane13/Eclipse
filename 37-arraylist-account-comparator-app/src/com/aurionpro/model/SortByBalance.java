package com.aurionpro.model;

import java.util.Comparator;

public class SortByBalance implements Comparator<Account>{  

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
 return Double.compare(o1.getBalance(),o1.getBalance());
	}

	

}
