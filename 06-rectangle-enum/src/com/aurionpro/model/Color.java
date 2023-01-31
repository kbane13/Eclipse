package com.aurionpro.model;

public class Color {
	private String color;

	public void setColor(String color) {
		this.color = CorrectedValues(color);

	}

	private String CorrectedValues(String clr) {
		if (clr.equalsIgnoreCase("blue") || clr.equalsIgnoreCase("green")) {
			return clr;
		}

		return "red";

	}

	public String getColor() {
		return color;

	}
}
