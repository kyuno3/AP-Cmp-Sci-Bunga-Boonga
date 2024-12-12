/*
 *	Author: Isaac No
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?"); 
		String role = sc.nextLine();
		if (role.equals("Wizard")||role.equals("wizard")||role.equals("Warrior")||role.equals("warrior")||role.equals("Rogue")||role.equals("rogue")){
			System.out.println("You have chosen to be a "+ role +"!");
		}
		else {
			System.out.println("The role "+role+ " does not exist. Rerun program.");
		}
	}
}
