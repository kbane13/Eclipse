package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;
import com.aurionpro.model.Student;

public class EmployeeSortTest {

	public static void main(String[] args) {
		List<Employee> accounts = Arrays.asList(new Employee(100, "Krutika", 60000, "IT"),
				new Employee(101, "Rasika", 70000, "Marketing"), new Employee(102, "Sheetal", 80000, "Account")

		);

//		List<Double> sortedSalary =accounts.stream().map(n->n.getSalary()).sorted().collect(Collectors.toList());
//		System.out.println(sortedSalary);
//		List<String> SortedDepartment = accounts.stream().map(n->n.getDepartment()).sorted().collect(Collectors.toList());
//		System.out.println(SortedDepartment);
        //sort by salary
		List<Employee> empList = accounts.parallelStream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(empList);

		// sort by name
		List<Employee> empNameList = accounts.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(empNameList);
		
		List<Employee> collect = accounts.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName)).collect(Collectors.toList());
	System.out.println(collect);
	}

}
