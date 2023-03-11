package com.aurionpro.model;

public class ThreadBlock extends Thread {
	SynchronizedBlock t;
	public ThreadBlock(SynchronizedBlock t){
		this.t=t;
	}
	public void run() {
		t.printTable(2);
	}
	

}
