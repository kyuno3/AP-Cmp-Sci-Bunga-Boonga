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
		System.out.println("Type in a sentence to reverse:");
		String phrase = sc.nextLine(); 
		String reverse = "";
		int numSpace = -1;
		while(true){	
			int nextSpace = phrase.indexOf(" ", numSpace+1);
			if(nextSpace == -1){
				reverse = phrase.substring(numSpace+1)+" " + reverse;
				break;
			}
			reverse = phrase.substring(numSpace+1,nextSpace)+" " + reverse;
			numSpace = nextSpace;
		}
		System.out.print(reverse);
	}
}