package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.AccountStream;

public class AccountTest {

	public static void main(String[] args) {
		List<AccountStream>accountList=Arrays.asList(
				new AccountStream(101,"Krutika",40000),
				new AccountStream(103,"Sheetal",50000),
				new AccountStream(104,"Komal",2000)
				
				);
		System.out.println("Minimum Balance");
		accountList.stream().min(Comparator.comparing(AccountStream::getBalance)).ifPresent(System.out::println);
		System.out.println("MAximum balance");
		accountList.stream().max(Comparator.comparing(AccountStream::getBalance)).ifPresent(System.out::println);
		
		List<AccountStream> collect = accountList.parallelStream().filter(n->n.getName().length()>6).collect(Collectors.toList());
		System.out.println("Name greater than 6"+collect);
		DoubleSummaryStatistics collect2 = accountList.stream().collect(Collectors.summarizingDouble(AccountStream::getBalance));
		System.out.println("Total of all balance:"+collect2);
		   } 
	}


