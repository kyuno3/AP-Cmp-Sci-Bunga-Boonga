/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		int count = 0;
		while (count<1000){
			arr[count]=(int)(Math.random()*1000);
			System.out.println(arr[count]);
			count++;
		}
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
