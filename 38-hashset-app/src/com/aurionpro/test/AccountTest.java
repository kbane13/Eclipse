package com.aurionpro.test;

import java.util.HashSet;
import java.util.Iterator;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
	
	HashSet<Account> set=new HashSet<>();
	
	Account acc=new Account(1,"krutika",1000);
	Account acc1=new Account(3,"Rasika",2000);
	Account acc2=new Account(5,"krutika",9000);
	Account acc3=new Account(4,"krutikaa",1000);
	
	
	set.add(acc);
	set.add(acc1);
	set.add(acc2);
	set.add(acc3);
	
	System.out.println(set);
	
//	 Iterator itr = set.iterator();
//	 
//     // check element is present or not. if not loop will
//     // break.
//     while (itr.hasNext()) {
//         System.out.println(itr.next());
//     }
		
	}

}