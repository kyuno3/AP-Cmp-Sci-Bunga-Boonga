/*
 *	Author: Isaac No
 *  Date: 9/20/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What day is it today?\n"+"Sun: 1 | Mon: 2 | Tues: 3 | Wed: 4 | Thur: 5 | Fri: 6 | Sat: 7");
		int day = sc.nextInt();
		if (1<day&&day<7){
			System.out.print("Set alarm for 7:00am.");
		}
		else{
			System.out.print("Set alarm for 10:00am.");
		}
	}
}
