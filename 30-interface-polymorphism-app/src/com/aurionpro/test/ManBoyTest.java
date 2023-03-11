package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		Man man=new Man();
		Boy boy=new Boy();
		IMannerable obj=new Man();
		IEmotionable obj1=new Man();
	
		obj.greetOnArrival();
		obj.greetOnDeparture();
		
		atTheMovies(man);
		//atTheMovies(boy);
		
		atTheParty(man);
		atTheParty(boy);
			
		}

	private static void atTheParty(IMannerable obj) {
		obj.greetOnArrival();
		obj.greetOnDeparture();
		
	}

	private static void atTheMovies(IEmotionable obj1) {
		obj1.laugh();
		obj1.cry();
		
	}
}


