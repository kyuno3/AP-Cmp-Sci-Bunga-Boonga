/*
 *	Author:  Isaac No
 *  Date: 10/7/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int count = 1;
		while (count<b){
			count++;
			a = a*a;
		}
		return a;
	}

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base?");
		int x = sc.nextInt();
		System.out.println("What is your exponent?");
		int y  = sc.nextInt();
		System.out.println("Your answer: "+pow(x,y));
	}
}
