/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Please input a number: ");
	int num1 = sc.nextInt();
	System.out.print("Please input a different number: ");
	int num2 = sc.nextInt();
	System.out.print("Please input the last number: ");
	int num3 = sc.nextInt();
	
	if(num1 > num2 && num1 > num3){
		System.out.println(num1 + " is the largest integer.");
	}
	else if(num2 > num1 && num2 > num3){
		System.out.println(num2 + " is the largest integer.");
	}
	else if(num3 > num2 && num3 > num1){
		System.out.println(num3 + " is the largest integer.");
	}
	else{
		System.out.println("You had one job and you put repeat numbers.");
	}

	
	if (num1 < num2 && num1 < num3){
		System.out.println(num1 + " is the smallest integer.");
	}
	else if (num2 < num1 && num2 < num3){
		System.out.println(num2 + " is the smallest integer.");
	}
	else if (num3 < num2 && num3 < num1){
		System.out.println(num3 + " is the smallest integer.");
	}
	else{
		System.out.println("You had one job and you put repeat numbers.");
	}
	}
}
