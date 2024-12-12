/*
 *	Author: Isaac No
 *  Date: 9/11/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		System.out.println("Here are the next 5 numbers:\n"+(num+1)+","+(num+2)+","+(num+3)+","+(num+4)+","+(num+5));
		System.out.println("Here are the next 5 numbers:\n"+(num*1)+","+(num*2)+","+(num*3)+","+(num*4)+","+(num*5));
		System.out.println("Here is "+num+" divided by 100:\n"+((double)num/100));
		System.out.println("Here is "+num+" divided by 10:\n"+((double)num/10));		
	}
}
