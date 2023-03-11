package com.aurionpro.model;

public class Anonymous {
	public void run() {
		System.out.println("Thread is under Running...");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread :" + i);
		}

	}
}
