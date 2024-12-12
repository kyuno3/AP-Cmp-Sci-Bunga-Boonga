/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		System.out.println("What is your pet peeve?");
		String response = sc.nextLine();
		System.out.println("Really? \""+response + "\" is your pet peeve?\n\t \\\\Get out of here!");
		
	}
}
