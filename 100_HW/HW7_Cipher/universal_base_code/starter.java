/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you have a key? ");
		String ifKey = sc.nextLine();
		if (ifKey.equals("yes")||ifKey.equals("y")||ifKey.equals("Yes")){
			Cipher decryptKey = new Cipher();
			System.out.println("What is the message you would like to encode/decode?");
			String message = sc.nextLine();
			System.out.println("What is your key?");
			int key = sc.nextInt();
			System.out.println(decryptKey.keyedEncode(message,key));			
		}
		else{
			Cipher decrypt = new Cipher();
			System.out.println("What is the message you would like to decode?");
			String message = sc.nextLine();
			System.out.println(decrypt.encode(message));
		}																																									
	}
}
