/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ran_num=(int)(Math.random()*1000);
		System.out.println(ran_num);		
		System.out.println("I am thinking of a number between 1 and 1000.\n"+"Guess the number I am thinking of:");
		int user_guess = sc.nextInt();
		if (user_guess==ran_num){
			System.out.print("You guessed correctly!");
		}
		else {
			System.out.print("That guess is incorrect.");
		}
	}
}
