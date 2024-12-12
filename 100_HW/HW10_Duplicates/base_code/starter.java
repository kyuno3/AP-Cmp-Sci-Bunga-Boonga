/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] array = new int[20];
		for (int c = 0; c < array.length; c++){
			array[c]=(int)((Math.random()*10)+1);
		}
		int target = (int)((Math.random()*10)+1);
		System.out.println("The target is: " + target);
		int numDupe = 0;
		for (int c = 0; c < array.length; c++){
			if(array[c]==target){
				System.out.println("There is a duplicate at: " + c);
				numDupe++;
			}
		}
		System.out.println("There is a total of " + numDupe + " duplicates.");
		System.out.println("__________________________________________\n");
		for (int c = 1; c<array.length; c++){
			if(array[c]==array[c-1]+1){
				System.out.println("Number " + (c-1) + " and number " + c + " are consecutive.");
				System.out.println(array[c] + " "+ array[c-1]);
			}
		}
	}
}
