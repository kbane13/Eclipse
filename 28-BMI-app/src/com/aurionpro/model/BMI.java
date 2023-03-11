package com.aurionpro.model;

public class BMI {

	private Person person;
	private double bmi;

	public BMI(Person person) {
		super();

		this.person = person;
		bmi = CalculateBMI();

	}

	private double CalculateBMI() {

		return person.getWeight() / (person.getHeight() * person.getHeight());

	}

	public String getBodyType() {
		if (bmi <= 18.5) {
			System.out.println("UnderWeight");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Healthy Weight");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("OverWeight");
		} else {
			System.out.println("Obese");
		}
		return null;

	}

	public double getBMI() {
		return bmi;
	}

}
