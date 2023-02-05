package com.aurion.pro.test;

import com.aurion.pro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player[] players = { new Player("krutika", 23, "India"), new Player("Rasika", 22, "India") };

//		for (Player x : players) {
//
//			PrintPlayersDetails(x);
//		}

		 Player eldestPlayer = Player.EldestPlayer(players);

		PrintPlayersDetails(eldestPlayer);

//		double max = players[0].getAge();
//		int index = 0;
//		for (int i = 0; i < players.length; i++) {
//			if (max < (players[i].getAge())) {
//				max = players[i].getAge();
//				index = i;
//			}
//		}
//		System.out.println("eldest  is :"+players[index]);

	}

	private static void PrintPlayersDetails(Player x) {
		System.out.println(x);

	}

}
