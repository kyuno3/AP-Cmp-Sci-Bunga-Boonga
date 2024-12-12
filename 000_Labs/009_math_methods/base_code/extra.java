/*
 *	Author: Isaac No 
 *  Date: 10/10/24
*/

import java.util.Scanner;

class extra {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a number: ");
		double x = sc.nextDouble();
		System.out.println("Please input another number: ");
		double y = sc.nextDouble();
		double max = Math.max(x,y);		
		System.out.println("Maximum: " + max);
		double sqrt = Math.sqrt(y);	
		System.out.println("Square root of y: " + sqrt);
		double pow = Math.pow(x,y);
		System.out.println("x^y: " + pow);
	}
}
