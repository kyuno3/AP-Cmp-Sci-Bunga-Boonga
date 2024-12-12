/*
 *	Author: Isaac No
 *  Date: 9/26/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times do you want to print");
		int num = sc.nextInt();
		int count = 0;
		while(true){
			if (count==num){
				break;
			}
			System.out.println(name);
			count=count+1;
		}
	}
}
