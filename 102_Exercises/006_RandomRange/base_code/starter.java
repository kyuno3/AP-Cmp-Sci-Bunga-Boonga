/*
 *	Author: Isaac No
 *  Date: 9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers to create a range\n"+"Please enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter a second, larger integer: ");
		int num2 = sc.nextInt();
		System.out.println("Your range is "+ num1 + " to " + num2 + ".\n"+"Here are five numbers generated in that range: ");
		System.out.print((int)(Math.random()*(num2-num1)+num1)+", "+(int)(Math.random()*(num2-num1)+num1)+", "+(int)(Math.random()*(num2-num1)+num1)+", "+(int)(Math.random()*(num2-num1)+num1)+", "+(int)(Math.random()*(num2-num1)+num1));
	}
}
