package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Salesman;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager obj = new Manager(1, "krutika", 80000);
		printSalaryDetails(obj);
		Salesman obj1 = new Salesman(1, "Rasika", 20000);
		printSalaryDetails(obj1);
		Accountant obj2 = new Accountant(2, "komal", 90000);
		printSalaryDetails(obj2);
	}

	private static void printSalaryDetails(Accountant obj2) {
		System.out.println("employee id:" + obj2.getEmployeeId());
		System.out.println("employee name:" + obj2.getName());
		System.out.println("employee salary:" + obj2.getBasicSalary());
		System.out.println("Annual CTC:" + obj2.calculateAnnualCTC());
		System.out.println("------------------------------------------------");

	}

	private static void printSalaryDetails(Salesman obj1) {
		System.out.println("employee id:" + obj1.getEmployeeId());
		System.out.println("employee name:" + obj1.getName());
		System.out.println("employee salary:" + obj1.getBasicSalary());
		System.out.println("Annual CTC:" + obj1.calculateAnnualCTC());
		System.out.println("------------------------------------------------");
	}

	private static void printSalaryDetails(Manager obj) {
		System.out.println("employee id:" + obj.getEmployeeId());
		System.out.println("employee name:" + obj.getName());
		System.out.println("employee salary:" + obj.getBasicSalary());
		System.out.println("Annual CTC:" + obj.calculateAnnualCTC());
		System.out.println("------------------------------------------------");
	}

}