/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] array){
		for(int c = 0; c<array.length; c++){
			System.out.println(array[c]);
		}
	}
	public static double getArrayAverage(int[] array){
		double average = 0;
		for (int c = 0; c<array.length; c++){
			average = (array[c]+average);
		}
		average = average/array.length;
		return average;
	}
	public static int getArrayMax(int[] array){
		int max = 0;
		for (int c = 0; c<array.length; c++){
			if (array[c]>max){
				max=array[c];
			}
		}
		return max;
	}
	public static int getArrayMin(int[] array){
		int min = Integer.MAX_VALUE;
		for (int c = 0; c<array.length; c++){
			if (array[c]<min){
				min=array[c];
			}
		}
		return min;
	}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[] newArr = new int[100];
		for(int c = 0; c<newArr.length; c++){
			newArr[c]=(int)((Math.random()*100)+1);
		}
		toStringArray(newArr);
		System.out.println(getArrayAverage(newArr));
		System.out.println(getArrayMax(newArr));
		System.out.println(getArrayMin(newArr));
	}
}
