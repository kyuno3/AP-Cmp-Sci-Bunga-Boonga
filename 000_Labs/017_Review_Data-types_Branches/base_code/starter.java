/*
 *	Author: Isaac No 
 *  Date: 9/23/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is your title?");
		String title = sc.nextLine();
		
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?"); 
		String role = sc.nextLine();
		if (role.equals("Wizard")||role.equals("wizard")||role.equals("Warrior")||role.equals("warrior")||role.equals("Rogue")||role.equals("rogue")){
			System.out.println("You have chosen to be a "+ role +"!");
		}
		else {
			System.out.println("The role "+role+ " does not exist. Rerun program.");
		}
		
		System.out.println("You have 20 stat points to spend on the following: Strength, Dexterity, Intelligence, and Charisma.\n");
		int stat_pts = 20;
		
		System.out.print("Strength (1-10): ");
		int str = sc.nextInt();
		if (str>10||str>stat_pts){
			System.out.print("Please input a smaller number (1-10): ");
			str = sc.nextInt();
		}
		stat_pts = stat_pts-str;
		System.out.println("You have "+ stat_pts + " stat points left.\n");
		
		System.out.print("Dexterity (1-10): ");
		int dex = sc.nextInt();
		if (dex>10||dex>stat_pts){
			System.out.print("Please input a smaller number (1-10): ");
			dex = sc.nextInt();
		}
		stat_pts = stat_pts-dex;
		System.out.println("You have "+ stat_pts + " stat points left.\n");
		
		System.out.print("Intelligence (1-10): ");
		int m_int = sc.nextInt();
		if (m_int>10||m_int>stat_pts){
			System.out.print("Please input a smaller number (1-10): ");
			m_int = sc.nextInt();
		}
		stat_pts = stat_pts-m_int;
		System.out.println("You have "+ stat_pts + " stat points left.\n");
		
		System.out.print("Charisma (1-10): ");
		int rizz = sc.nextInt();
		if (rizz>10||rizz>stat_pts){
			System.out.print("Please input a smaller number (1-10): ");
			rizz = sc.nextInt();
		}
		stat_pts = stat_pts-rizz;
		System.out.println("You have "+ stat_pts + " stat points left.\n");
		
		if (stat_pts>0){
		System.out.println("You have decide to not use" + stat_pts + "stat points.\n");
		}
		
		System.out.println("You are "+name+", the "+title+" of CVHS.\n"+"You are a "+role+" with the following stats:\n"+"Strength | "+str+"\n"+"Dexterity | "+dex+"\n"+"Intelligence | "+m_int+"\n"+"Charisma | "+rizz+"\n"+"Good luck on your quest, "+name+"!");
	}
}
