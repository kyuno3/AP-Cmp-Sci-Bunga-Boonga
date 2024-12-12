/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean isLeapYear(int a){
		int check = a%4;
		boolean leapYear = false;
		if (a%100 == 0){
			if (a%400 == 0){
				leapYear = true;
			}
			else{
				leapYear = false;
			}
		}
		else{
			if (check == 0){
				leapYear = true;
			}
			else{
				leapYear = false;
			}
		}
		return leapYear;
	}
	public static int getDigitSum(int a){
		int firstDigit = a /10000;
		int thouRemain = a-(firstDigit*10000);
		int secondDigit = thouRemain /1000;
		int hunRemain = thouRemain-(secondDigit*1000);
		int thirdDigit = hunRemain / 100;
		int tenRemain = hunRemain-(thirdDigit*100);
		int fourthDigit= tenRemain/10;
		int oneRemain = tenRemain-(fourthDigit*10);
		int fifthDigit=oneRemain;
		System.out.print(fifthDigit);
		return firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit;
	}
	public static void printIfConsecutive(int a, int b, int c){
		if (a+1==b && b+1 == c){
			System.out.print(a + " "+ b + " " + c + " is consecutive!"); 
		}
		else {
			System.out.print(a + " "+ b + " " + c + " is not consecutive!"); 
		}
	}
	
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
		
	}
}
