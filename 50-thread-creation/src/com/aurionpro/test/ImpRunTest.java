package com.aurionpro.test;

import com.aurionpro.model.ImpRun;
import com.aurionpro.model.ThreadExtend;

public class ImpRunTest {
	public static void main(String[] args) {
		ImpRun ir = new ImpRun();
		System.out.println("Thread Starts");
		Thread thread=new Thread(ir);
		thread.start();
	}

}
