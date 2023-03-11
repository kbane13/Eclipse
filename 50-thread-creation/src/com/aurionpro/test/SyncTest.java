package com.aurionpro.test;

import com.aurionpro.model.MyThread;
import com.aurionpro.model.Sync;

public class SyncTest {

	public static void main(String[] args) {
		Sync obj = new Sync();
		MyThread t1 = new MyThread(obj);
		t1.start();

	}

}
