package com.aurionpro.model;

public class Manager extends Employee {
	
	private double hra;
	private double da;
	private double ta;
	
	public Manager(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		hra=0.25;
		da=0.15;
		ta=0.10;
	}

	

	@Override
	public double calculateAnnualCTC() {
		// TODO Auto-generated method stub
		return getBasicSalary()+hra+da+ta*12;
	}

	

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

}
