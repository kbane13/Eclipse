package com.aurionpro.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Krutika");
		hm.put(2, "Rasika");
		hm.put(3, "Komal");

		hm.put(4, "Sheetal");
		hm.put(4, "Janavi");
		System.out.println(hm);

//		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		// Set<Entry<Integer, String>> entrySet2 = hm.entrySet(); //hm.entryset..ctrl+1

//		for(Entry<Integer, String> set:hm.entrySet()) {
//			System.out.println(set.getKey()+" : "+set.getValue());
//		}
		hm.put(4, "Sheetal");
		for (Integer x : hm.keySet()) {
			System.out.println(x + ":" + hm.get(x));
		}
//		hm.replace(1, "krutika", "Riya");
//		System.out.println("replace:" +hm);
		// hm.remove(4, "Sheetal");
		//System.out.println("after removing ");
		Iterator<Entry<Integer, String>> iterator = hm.entrySet().iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getKey().equals("Rasika"))
				iterator.remove();
		}
		System.out.println(hm);//deleting value
	
         
	}

}
