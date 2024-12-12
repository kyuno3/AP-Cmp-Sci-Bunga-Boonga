/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        
        System.out.println("Please enter a number:");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter another number:" );
        int num2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("The sum of these numbers is " + (num1+num2));
        System.out.println("What's you favorite food?");
        String food = sc.nextLine();
	}
}