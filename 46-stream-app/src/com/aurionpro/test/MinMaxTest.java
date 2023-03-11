package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Employee;

public class MinMaxTest {

	public static void main(String[] args) {
		List<Employee> accounts = Arrays.asList(new Employee(100, "Krutika", 60000, "IT"),
				new Employee(101, "Rasika", 70000, "Marketing"), new Employee(102, "Sheetal", 80000, "Account")

		);
//		accounts.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);//displays minimum sal
//		accounts.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);//displays maximum sal
	Optional<Employee> max = accounts.stream().max(Comparator.comparing(Employee::getSalary));
if(max.isPresent()) {
	System.out.println(max.get());
}
}

}
