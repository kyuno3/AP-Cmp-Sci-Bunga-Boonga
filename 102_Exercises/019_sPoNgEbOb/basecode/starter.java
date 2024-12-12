/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a word: ");
		String input = sc.nextLine();
		int i = 0;
		while(i<input.length()){
			if(input.substring(i,i+1).equals(" ")){
				System.out.print(" ");
				i++;
			}
			String letterLow = input.substring(i,i+1);
			System.out.print(letterLow.toLowerCase());
			i++;
			if(i<input.length()){
				String letterUp = input.substring(i,i+1);
				System.out.print(letterUp.toUpperCase());
				i++;
			}
			else{
				break;
			}
		}
	}
}
