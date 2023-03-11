package com.aurionpro.model;

public class SynchronizedBlock {
	void printTable(int n) {
		synchronized (this) {//synchronized block
			for(int i=0;i<=10;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}

}
