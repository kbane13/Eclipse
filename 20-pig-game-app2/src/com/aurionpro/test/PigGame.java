package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;



public class PigGame {

	 private static int player1=1;
	private  static int player2=2;
	private  static int WinnerPoints=22;
    private static  int  PlayerTurn;
    private  static int Player1TotalPoints=0;
    private int Player2TotalPoints;
    private  static int die;
    private static int Roll;
    
     public static void  Overall() {
    	 
    	 System.out.println("Pig game");
    	
    			
    			do {
    			System.out.println("Enter r to roll and h to hold");
    			Scanner sc=new Scanner(System.in);
    			String decision=sc.nextLine();
    			if(decision.equals("r")) {
    				Random rand=new Random();
    				int die=rand.nextInt(6)+1;
    				System.out.println(die);
    			
    				Player1TotalPoints=Player1TotalPoints+die;
    				System.out.println("Total"+Player1TotalPoints);
    			
    			
    				if(die==1) {
    					System.out.println(" rolled 1 and busted");
    					 Player1TotalPoints=0;
    				}      
    				
    				
    			}
    			if(decision.equals("h")) {
    				System.out.println("Hold");
    				Player1TotalPoints=0;
    				System.out.println( "Total"+Player1TotalPoints);
    			}
    			
    			}while(Player1TotalPoints<=20);
     }
    
	public static void main(String[] args){
		//Player1TotalPoints=Player1TotalPoints+die;
//		System.out.println("Pig game");
//	
//		
//		do {
//		System.out.println("Enter r to roll and h to hold");
//		Scanner sc=new Scanner(System.in);
//		String decision=sc.nextLine();
//		if(decision.equals("r")) {
//			Random rand=new Random();
//			int die=rand.nextInt(6)+1;
//			System.out.println(die);
//		
//			Player1TotalPoints=Player1TotalPoints+die;
//			System.out.println("Total"+Player1TotalPoints);
//		
//		
//			if(die==1) {
//				System.out.println(" rolled 1 and busted");
//				 Player1TotalPoints=0;
//			}      
//			
//			
//		}
//		if(decision.equals("h")) {
//			System.out.println("Hold");
//			Player1TotalPoints=0;
//			System.out.println( "Total"+Player1TotalPoints);
//		}
//		
//		}while(Player1TotalPoints<=20);
		Overall();
	}
		}
		

