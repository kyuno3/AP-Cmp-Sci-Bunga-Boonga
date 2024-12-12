/*
 *	Author: Isaac No
 *  Date: 9/25/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int num1 = sc.nextInt();
		System.out.print("Please input another nunmber: ");
		int num2 = sc.nextInt();
		if ((num1%2)==0){
			System.out.println("Number 1 is Even.");
		}
		else {
			System.out.println("Number 1 is Odd");
		}
		
		if ((num2%2)==0){
			System.out.println("Number 2 is Even.");
		}
		else {
			System.out.println("Number 2 is Odd");
		}
		
		if ((num1%3)==0){
			System.out.println("Number 1 is divisible by 3.");
		}
		else if ((num1%4)==0){
			System.out.println("Number 1 is divisible by 4.");
		}
		else if ((num1%5)==0){
			System.out.println("Number 1 is divisible by 5.");
		}
		else{
			System.out.println("Number 1 is not divisivle by 3, 4, or 5.");
		}
		
		if ((num2%3)==0){
			System.out.println("Number 2 is divisible by 3.");
		}
		else if ((num2%4)==0){
			System.out.println("Number 2 is divisible by 4.");
		}
		else if ((num2%5)==0){
			System.out.println("Number 2 is divisible by 5.");
		}
		else{
			System.out.println("Number 2 is not divisivle by 3, 4, or 5.");
		}
	}
}
