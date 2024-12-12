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
		Char myCharacter = new Char();
		System.out.println("What role would you like to play?");

		myCharacter.setRole();
		myCharacter.setStrength();
		myCharacter.setDexterity();
		myCharacter.setIntelligence();
		myCharacter.setCharisma();
		if (myCharacter.setAll()==true){
			System.out.println("\n____________________________\nAll values accepted. Here is your character:");
			myCharacter.myToString();
		}
	}
}
