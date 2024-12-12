/*
 *	Author: Isaac No
 *  Date: 9/26/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int secret_num = (int)(Math.random()*1000);
		System.out.println(secret_num);
		System.out.print("Guess a random number from 1-1000: ");
		int guess = sc.nextInt();
		while(true){
			if (guess==secret_num){
				break;
			}
			else if (guess>secret_num){
				System.out.println("The secret number is smaller.");
				guess = sc.nextInt();
			}
			else if (guess<secret_num){
				System.out.println("The secret number is larger.");
				guess = sc.nextInt();
			}
			
		}
		System.out.println("You guessed the number!");
	}
}
