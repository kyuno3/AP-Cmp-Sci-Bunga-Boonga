/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Char {
	Scanner sc = new Scanner(System.in);
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
	public void setRole(){
		role = sc.nextLine();
		if (role.equals("Wizard")||role.equals("wizard")||role.equals("Rogue")||role.equals("rogue")||role.equals("Warrior")||role.equals("warrior")){
			System.out.println("You have picked: " + role);
		}
		else{
			System.out.println("You didn't choose a role.\nYou're role: None");
			Char myCharacter = new Char();
		}
	}
	public int setStrength(){
		System.out.print("Input your Strength: ");
		strength = sc.nextInt();
		if (strength<0){
			System.out.println("Error: Invalid number. Strength set to 0.");
			strength = 0;
		}
		return strength;
	}
	public int setDexterity(){
		System.out.print("Input your Dexterity: ");
		dexterity = sc.nextInt();
		if (dexterity<0){
			System.out.println("Error: Invalid number. Dexterity set to 0.");
			 dexterity = 0;
		}
		return dexterity;
	}
	public int setIntelligence(){
		System.out.print("Input your Intelligence: ");
		intelligence = sc.nextInt();
		if (intelligence<0){
			System.out.println("Error: Invalid number. Intelligence set to 0.");
			 intelligence = 0;
		}
		return intelligence;
	}
	public int setCharisma(){
		System.out.print("Input your Charisma: ");
		charisma = sc.nextInt();
		if (charisma<0){
			System.out.print("Error: Invalid number. Charisma set to 0.");
			 charisma = 0;
		}
		return charisma;
	}

	public boolean setAll(){
		if (strength>0&&dexterity>0&&intelligence>0&&charisma>0){
			return true;
		}
		else{
			System.out.println("A value is invalid. Restart the program.");
			return false;
		}
	}
		
	public void myToString(){
		System.out.println("You picked: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity : " + dexterity);
		System.out.println("Intelligence : " + intelligence);
		System.out.println("Charisma : " + charisma);
	}

}