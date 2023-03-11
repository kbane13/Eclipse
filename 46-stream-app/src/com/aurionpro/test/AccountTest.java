package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account>accountList=Arrays.asList(
				new Account(101,"Krutika",20000),
				new Account(102,"Komal",30000),
				new Account(103,"Sheetal",40000),
				new Account(104,"Rasika",12000),
				new Account(105,"Sakshi",5000)
				);
		System.out.println(accountList);
		List<Account>collect=accountList.stream().filter(n->n.getBalance()>=10000).collect(Collectors.toList());
		System.out.println(collect);
		

	}

}
