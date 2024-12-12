/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog toro = new Dog("Toro");
		toro.setAge(10);
		if (toro.isSleeping()==false){
			toro.bark();
		}
		else{
			System.out.println("Toro is sleeping.");
		}
		Dog bob = new Dog("Bob", "Bulldog");
		if (toro.isSleeping() == false){
			bob.bark();
		}
		else{
			System.out.println("Bob is sleeping.");
		}
	}
}
