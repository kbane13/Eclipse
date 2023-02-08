package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> p2Positions = new ArrayList<Integer>();

	public static void main(String[] args) {

		char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

		printGameBoard(gameBoard);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Player 1 enter  your place(1-9)");
			int pos = sc.nextInt();
			System.out.println(pos);
			placePiece(gameBoard, pos, "player 1");
			printGameBoard(gameBoard);

			System.out.println("Player 2 enter  your place(1-9)");
			int p2pos = sc.nextInt();
			System.out.println(p2pos);
			player2Piece(gameBoard, p2pos, "player 2");

			printGameBoard(gameBoard);
			String result = checkWinner();
			System.out.println(result);
			
			
		} 
		
		
		
	} 

	private static void player2Piece(char[][] gameBoard, int p2pos, String user) {

		char symbol = ' ';
		if (user.equalsIgnoreCase("player 1")) {
			symbol = 'X';
			playerPositions.add(p2pos);
		} else if (user.equalsIgnoreCase("player 2")) {
			symbol = 'O';
			p2Positions.add(p2pos);

		}

		switch (p2pos) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			break;

		}
	}

	public static void printGameBoard(char[][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

	public static void placePiece(char[][] gameBoard, int pos, String user) {

		char symbol = ' ';
		if (user.equalsIgnoreCase("player 1")) {
			symbol = 'X';
			playerPositions.add(pos);
		} else if (user.equalsIgnoreCase("player 2")) {
			symbol = 'O';
			p2Positions.add(pos);
		}

		switch (pos) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			break;

		}

	}

	public static String checkWinner() {

		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List leftcol = Arrays.asList(1, 4, 7);
		List midcol = Arrays.asList(2, 5, 8);
		List rightcol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(7, 5, 3);
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftcol);
		winning.add(midcol);
		winning.add(rightcol);
		winning.add(cross1);
		winning.add(cross2);
		
		for (List l : winning) {
			if (playerPositions.containsAll(l)) {
				return "Player 1 wins";

			} else if (p2Positions.containsAll(l)) {
				return "Player 2 wins";
			} else if (playerPositions.size() + p2Positions.size() == 9) {
				return "tie";
			}
			
			
		}
		return " ";
	
	}
	
}
