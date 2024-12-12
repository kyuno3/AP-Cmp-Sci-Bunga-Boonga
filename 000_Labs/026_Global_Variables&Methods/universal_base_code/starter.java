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
		System.out.println("What role would you like to play?");
		String setRole = sc.nextLine();
		if (roleSelect.equals("Wizard")||roleSelect.equals("wizard")||roleSelect.equals("Rogue")||roleSelect.equals("rogue")||roleSelect.equals("Warrior")||roleSelect.equals("warrior")){
			Char myCharacter = new Char(roleSelect,10,10,10,10);
			myCharacter.myToString();
		}
		else{
			System.out.println("You didn't choose a role.");
			Char myCharacter = new Char();
			myCharacter.myToString();
		}
	}
}
