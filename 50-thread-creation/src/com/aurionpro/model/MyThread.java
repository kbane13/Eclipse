package com.aurionpro.model;

public class MyThread  extends Thread{
	Sync t;
	public MyThread(Sync t){
		this.t=t;
	}
	public void run() {
		t.printTable(6);
	}
	
	
	
	
	

}
