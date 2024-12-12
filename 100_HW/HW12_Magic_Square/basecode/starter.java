import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many special squares would you like to see?");
		int numSpecial = sc.nextInt();
		CVMath.specialSquare(numSpecial);
		//System.out.println(CVMath.findMid(2,3,1));
	}
}
