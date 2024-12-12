/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Char {
	String role = "";
	int strength = 0;
	int dexterity = 0;
	int intelligence = 0;
	int charisma = 0;
	
	public Char(){
		role = "No role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	public Char(String r, int s, int d, int i, int c){
		role = r;
		strength = s;
		dexterity = d;
		intelligence = i;
		charisma = c;
	}
	public void myToString(){
		System.out.println("You picked: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity : " + dexterity);
		System.out.println("Intelligence : " + intelligence);
		System.out.println("Charisma : " + charisma);
	}
}