package com.aurionpro.model;

public class LambdaThread {
	public static void main(String args[]) {

		// Thread creation using java 8 lambda using runnable
		Thread evenNo = new Thread(() -> {

			// this logic is implementation of run() method to print only even numbers
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0) {
					System.out.println("Even Number Thread : " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		evenNo.start();
	}
}
