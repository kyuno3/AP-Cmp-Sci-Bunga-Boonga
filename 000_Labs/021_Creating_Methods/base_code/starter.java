/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static String toString(String a){
        return a;
    }
    public static String toStringCombined(String a, String b){
        String ab = a+" "+b;
        return ab;   
    }
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String a = sc.nextLine();
        System.out.println("Write another sentence:");
        String b = sc.nextLine();
        
		System.out.println(toString(a));
		System.out.println(toStringCombined(a,b));
	}
}
