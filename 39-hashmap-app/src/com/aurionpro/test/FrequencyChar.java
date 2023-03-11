package com.aurionpro.test;

import java.util.HashMap;

public class FrequencyChar {

	public static void main(String[] args) {
		String str="krutika";
		HashMap<Character, Integer> map = new HashMap<>();		 
		
		for(Character c:str.toLowerCase().toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
			
			}
	}
	map.forEach((key,value)->System.out.println(key + " : "+value));
	
}
}