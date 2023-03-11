package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.Account;


public class AccountTest {

	public static void main(String[] args) {
		List<Account> listaccount=new ArrayList<>();
	Account acc=new Account(100, "Krutika", 20000);
	listaccount.add(acc);
	Account acc1=new Account(101, "Rasika", 40000);
	listaccount.add(acc1);
	Account acc2=new Account(100, "Ananya", 30000);
	listaccount.add(acc2);
	
	double totalBalance=0;
	
	for(int i=0;i<listaccount.size();i++)
	{
		System.out.println(listaccount.get(i));
		totalBalance+=listaccount.get(i).getBalance();
	
	}
	System.out.println("Total Balance of all Acc:"+totalBalance);
	
	
	double max=listaccount.get(0).getBalance();
	
	Account maximum = listaccount.get(0);
    for (int i = 1; i < listaccount.size(); i++) {
        if (max < listaccount.get(i).getBalance())
        	max = listaccount.get(i).getBalance();
    }
    System.out.println("Maximum:"+max);

    double min = listaccount.get(0).getBalance();	
	for (int i = 1; i < listaccount.size(); i++) {
        if (min > listaccount.get(i).getBalance())
        	min = listaccount.get(i).getBalance();
    }
    System.out.println("Minimum:"+min); 
    //Collection.sort(list,Collections.reverseOrder()); for descending order(integer)
    //System.out.println(listaccount);
    
    Collections.sort(listaccount); //for  descending order (string) 
  
	System.out.println(listaccount);
	}
	
	
	
	
		
	}


