package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.ThreadPool;

public class ThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService obj = Executors.newFixedThreadPool(4);
		for (int i = 1; i <= 4; i++) {
			Runnable run = new ThreadPool(" " + i);
			System.out.println("Thread :" + i);
			obj.execute(run);
		}
	}

}
