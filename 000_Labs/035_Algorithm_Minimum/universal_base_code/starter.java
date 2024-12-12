/*
 *	Author: Isaac No
 *  Date: 11/5/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int [100];
		for(int count = 0; count<arr.length; count++){
			arr[count]=(int)((Math.random()*100)+1);
		}
		
		int min=Integer.MAX_VALUE;
		for(int count = 0; count<arr.length; count++){
			if(arr[count]<min){
				min = arr[count];
			}
		}
		System.out.println(min);
		
		int max = 0;
		for(int count = 0; count<arr.length; count++){
			if(arr[count]>max){
				max = arr[count];
			}
		}
		
		System.out.println(max);
		double average = 0;
		for (int count = 0; count<arr.length; count++){
			average = average+arr[count];
		}
		System.out.println(average = average/arr.length);
		
		// Your code goes below here
		BaseClass test = new BaseClass();

	}
}
