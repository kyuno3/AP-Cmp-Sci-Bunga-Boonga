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
		System.out.print("Choose a role: ");
		String myRole = sc.nextLine();
		if (myRole.equals("wizard")||myRole.equals("Wizard")){
			Char myChar = new Char("Wizard", 2, 4, 10, 4);
			System.out.println("You have chosen to be a " + myChar.role);
			System.out.println("Strength: " + myChar.str);
			System.out.println("Dexterity: " + myChar.dex);
			System.out.println("Inteligence: " + myChar.intel);
			System.out.println("Charisma: " + myChar.rizz);
		}
		else if(myRole.equals("warrior")||myRole.equals("Warrior")){
			Char myChar = new Char("Warrior", 10, 5, 2, 3);
			System.out.println("You have chosen to be a " + myChar.role);
			System.out.println("Strength: " + myChar.str);
			System.out.println("Dexterity: " + myChar.dex);
			System.out.println("Inteligence: " + myChar.intel);
			System.out.println("Charisma: " + myChar.rizz);			
		}
		else if(myRole.equals("rogue")||myRole.equals("Rogue")){
			Char myChar = new Char("Rogue", 4, 9, 2, 4);
			System.out.println("You have chosen to be a " + myChar.role);
			System.out.println("Strength: " + myChar.str);
			System.out.println("Dexterity: " + myChar.dex);
			System.out.println("Inteligence: " + myChar.intel);
			System.out.println("Charisma: " + myChar.rizz);
		}
		else{
			Char noChar = new Char();
			System.out.println("You have chosen: " + noChar.role);
		}
	}
}
