package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;



public class PigGame {
	public static int turn;
	 static int  TotalScore;
	 static int i=1;
	public static void main(String[] args) 
	{
		while(turn<=4) {
			
		do {
			 
		
		System.out.println("Enter 1 for r and 0 for h");
		Scanner sc=new Scanner(System.in);
		int dice=sc.nextInt();
		Random rand=new Random();
		int Decision=rand.nextInt(6)+1;
		if(dice==1 ) {
			System.out.println("Roll");
//			 TotalScore+=Decision;
//			System.out.println("dice is thrown "+dice);
//			System.out.println("Random no "+Decision);
//			System.out.println("Total Score"+TotalScore);
		if(Decision==1) {
			TotalScore=0;
			System.out.println("TotalScore"+TotalScore);
		}
		else {
			TotalScore+=Decision;
			System.out.println("dice is thrown "+dice);
			System.out.println("Random no "+Decision);
			System.out.println("Total Score"+TotalScore);
			turn++;
		}
		}
		
		if (dice==0){
			
			System.out.println("Hold");
			System.out.println("Total score is" +TotalScore);
			turn++;
		}
		else {
			System.out.println("Busted");
			turn++;
		}
		
		
	//System.out.println("turns"+i);
	
	}while(TotalScore<10);
	
		}
}
	}
