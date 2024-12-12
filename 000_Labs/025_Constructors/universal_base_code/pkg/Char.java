/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Char {
	public String role;
	public int str;
	public int dex;
	public int intel;
	public int rizz;
	
	public Char(){
		role = "No role";
		str = 0;
		dex = 0;
		intel = 0;
		rizz = 0;
	}
	public Char(String r, int s, int d, int i, int c){
		role = r;
		str = s;
		dex = d;
		intel = i;
		rizz = c;
	}
}

