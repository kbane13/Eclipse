package com.aurionpro.model;

public class Accountant extends Employee {
	private double PerformanceAllowance = 0.15;
	
	public Accountant(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		PerformanceAllowance = 0.15;
	}

	

	public double getPerformanceAllowance() {
		return PerformanceAllowance;
	}

	public void setPerformanceAllowance(double performanceAllowance) {
		PerformanceAllowance = PerformanceAllowance;
	}

	@Override
	public double calculateAnnualCTC() {
		// TODO Auto-generated method stub
		return getBasicSalary() + (getBasicSalary() * PerformanceAllowance)*12;
	}

}
