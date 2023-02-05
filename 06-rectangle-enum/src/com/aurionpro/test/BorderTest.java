package com.aurionpro.test;

import com.aurionpro.model.Border;
import com.aurionpro.model.BorderModel;

public class BorderTest {
	public static void main(String[]args) {
		BorderModel br= new BorderModel(Border.solid);
		
		PrintborderDetails(br);
		
		
		
		
	}

	private static void PrintborderDetails(BorderModel br) {
		System.out.println(br.getBorder());
		
	}
}
