package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class MapTest {

	public static void main(String[] args) {
		List<Integer>numberList=Arrays.asList(3,10,22,30,44);
		
		
//		
//		List<Integer>collect=numberList.stream().map(n->n*n).collect(Collectors.toList());
//System.out.println(collect);

List<String> friends=Arrays.asList("Krutika","Rasika");
//List<String>collect=friends.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
//System.out.println(collect);
List<Account>accountList=Arrays.asList(
		new Account(101,"Krutika",20000),
		new Account(102,"Komal",30000),
		new Account(103,"Sheetal",40000),
		new Account(104,"Rasika",12000),
		new Account(105,"Sakshi",5000)
		);
//List<Double>collect=accountList.stream().map(n->n.getBalance()).collect(Collectors.toList());
//System.out.println(collect);
accountList=accountList.stream().map(n->new Account(n.getAccountNumber(),n.getName(),n.getBalance()*1.06)).collect(Collectors.toList());
System.out.println(accountList);

List<Account>collect2=accountList.stream().filter(n->n.getAccountNumber()==103).collect(Collectors.toList());
System.out.println(collect2);

List<Double> collect3 = numberList.stream().filter(n ->n%2==0).map(n -> Math.pow(n, 2)).collect(Collectors.toList());
System.out.println("Square of even  elements =" + collect3);   



	

}
}
