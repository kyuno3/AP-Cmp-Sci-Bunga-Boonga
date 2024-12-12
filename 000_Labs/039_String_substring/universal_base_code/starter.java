/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Your code goes below here
		BaseClass test = new BaseClass();
		System.out.println("Input a word.");
		String input = sc.nextLine();
		for(int c = 0; c<input.length(); c++){
			System.out.println("Letter "+(c+1)+": "+input.substring(c,c+1));
		}

		
	}
}
