/*

/*

Author: Matthew Leung
Date  : 09/06/2022
Rev   : 03
Notes : Fixed invalid moves


import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class RPS {	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("How many wins do you want to play to?");
		int times = myObj.nextInt();
		int compWins = 0;
		int playerWins = 0;
		int move = 0;
		int compMove = 0;
		while(true) {
			System.out.println("Score - You: "+ playerWins + ", Computer: " + compWins);
			  if (compWins == times) {
				  System.out.println("You lost :(");
				  break;
			  }
			  else if (playerWins == times) {
				  System.out.println("You won :)");
				  break;
			  }
			System.out.println("Pick One: 0 for Rock, 1 for Paper, and 2 for Scissors.");
			move = myObj.nextInt();
			compMove = (int)Math.floor(Math.random()*(2-0+1)+0);
			//&& = and || = or
			while (move != 2 && move != 1 && move != 0) {
				System.out.println("Incorect Input, Please Try Again.");
				move = myObj.nextInt();
			}
			if (move == compMove) {
				if (move == 1) {
					System.out.println("Computer chose Paper - You guys tied.");
				}
				else if (move == 2) {
					System.out.println("Computer chose Scissors - You guys tied.");
			}
				else {
					System.out.println("Computer chose Rock - You guys tied.");
				}
			compMove = compMove + 1;	
			}
			else if (move > compMove) {
				if (move == compMove + 1) {
					if (move == 2) {
						System.out.println("Computer chose Paper - You Won!");
						playerWins = playerWins + 1;
					}
					else {
						System.out.println("Computer chose Rock - You Won!");
						playerWins = playerWins + 1;
					}
				}
				else {
					System.out.println("Computer chose Rock - You Lost :(");
					compWins = compWins + 1;
				}	
			}
			else {
				if (compMove == move + 1) {
					if (compMove == 2) {
						System.out.println("Computer chose Scissors - You Lost :(");
						compWins = compWins + 1;
					}
					else {
						System.out.println("Computer chose Paper - You Lost :(");
						compWins = compWins + 1;
					}
				}
				else {
					System.out.println("Computer chose Scissors - You Won!");
					playerWins = playerWins + 1;
				
			}
		}
	}
}
*/


