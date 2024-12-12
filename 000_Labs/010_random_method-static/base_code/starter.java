/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("A number between 0-9: "+(int)(Math.random() * 10)); 
		System.out.println("A number between 1-100: "+(int)(Math.random() * 101));
		System.out.println("A number between 2.5-3.5: "+(Math.random()*(3.5-2.5)+2.5));
		System.out.println("A number between 14-589: "+(Math.random()*(589-14)+14));
	}
}
