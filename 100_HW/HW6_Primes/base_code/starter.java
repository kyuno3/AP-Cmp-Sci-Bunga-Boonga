/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
		int count = 2;
		int check = 0;
		boolean isPrime = true;
		while (count<a){
			check = a%count;
			count++;
			if (check ==0){
				isPrime = false;
				break;
			}
			else{
				isPrime = true;
			}
		}
		return isPrime;
	}
	
	public static void printPrimes(int a){
		int count = 2;
		int check = 0;
		while (count<=a){
			if (checkPrime(count)==true){
				System.out.print(count+" ");
			}
			count++;
		}
		return;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which number do you want to check?");
		int num = sc.nextInt();
		if (checkPrime(num)==false){
			System.out.println(num + " is not a prime number.");
			printPrimes(num);
		}
		else{
			System.out.println(num + " is a prime number.");
			printPrimes(num);
		}
	}
}