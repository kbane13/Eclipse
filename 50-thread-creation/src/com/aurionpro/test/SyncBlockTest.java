package com.aurionpro.test;

import com.aurionpro.model.Sync;
import com.aurionpro.model.SynchronizedBlock;
import com.aurionpro.model.ThreadBlock;

public class SyncBlockTest {

	public static void main(String[] args) {
		SynchronizedBlock obj1 = new SynchronizedBlock();
		ThreadBlock t1 = new ThreadBlock(obj1);
		t1.start();
		
	}

}
