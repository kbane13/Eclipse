package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class BookCricket {
	public static int Playerno;

	public static int Points;
	public static int Player1Point;
	public static int Player2Point;
	public static int Player2TotalScore;
	public static int Player1SumScore;
	public static int Player2SumScore;
	public static int Player1TotalScore;

	public static int OpenBook;

	public static int Score;

	// 1Book(TotalScore);

	public static void main(String[] args) {
		System.out.println("Enter Playerno ");
		Scanner sc = new Scanner(System.in);
		Playerno = sc.nextInt();
		for (int i = 1; i <= 4; i++) {

			if (Playerno == 1) {
				System.out.println("Enter any no to open book");
				OpenBook = sc.nextInt();
				Random rand = new Random();

				int Pageno = rand.nextInt(300) + 1;

				Player1Point = Pageno % 7;
				Player1SumScore += Player1Point;

				// Player1SumScore = Player2SumScore + Player1TotalScore;
				System.out.println("Pageno:" + Pageno);
				System.out.println();
				System.out.println("     P1 Points :" + Player1Point + "   P1 Score  :" + Player1Point);

				System.out.println("P1 Total  Score is:" + Player1SumScore);
			}
			
		}
        System.out.println("===========================================================================");
		System.out.println("Next Player2 : enter 2");
		Playerno = sc.nextInt();
		for (int j = 1; j <= 4; j++) {

			if (Playerno == 2) {
				System.out.println("Enter any no to open book");
			OpenBook = sc.nextInt();
			Random rand = new Random();
			int Pageno = rand.nextInt(300) + 1;

			Player2Point = Pageno % 7;
			Player2SumScore += Player2Point;

			// Player1SumScore = Player2SumScore + Player1TotalScore;
			System.out.println("Pageno:" + Pageno);
			System.out.println();
			System.out.println("    P2 Points :" + Player2Point + "    P2 Score :" + Player2Point);

			System.out.println("You Total 1 Score is:" + Player2SumScore);
		}
			
		}
		ALLScore();

	}

	public static void ALLScore() {
		if (Player1SumScore > Player2SumScore) {
			System.out.println("Player 1 is winner");
		} else {
			System.out.println("Player 2 is winner");
		}
	}
}
