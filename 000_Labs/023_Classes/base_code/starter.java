/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	String role = "Wizard";
	int str = 2;
	int dex = 3;
	int intel = 9;
	int rizz = 4;
	
}
class starter {
	public static void main(String args[]) {
		Character myChar = new Character();
		System.out.println(myChar.role);
		System.out.println(myChar.str);
		System.out.println(myChar.dex);
		System.out.println(myChar.intel);
		System.out.println(myChar.rizz);
	}
}
