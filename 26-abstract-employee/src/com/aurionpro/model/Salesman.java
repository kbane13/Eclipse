package com.aurionpro.model;

public class Salesman extends Employee {
	private double bonus;

	public Salesman(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		bonus=0.30;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculateAnnualCTC() {
		// TODO Auto-generated method stub
		return getBasicSalary() + (getBasicSalary()*bonus)*12;
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	

}
