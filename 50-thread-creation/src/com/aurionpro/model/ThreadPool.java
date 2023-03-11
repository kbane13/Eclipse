package com.aurionpro.model;

public class ThreadPool implements Runnable{
	private String name;
	

	public ThreadPool(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		System.out.println("Start Thread"+name);
		try {
			Thread.sleep(1000);
		}
	catch(InterruptedException e){
		e.printStackTrace();
		
	}
		System.out.println("Ended Thread:"+name);
		
	}
	

}
