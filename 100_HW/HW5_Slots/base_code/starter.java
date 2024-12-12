/*
 *	Author: Isaac No
 *  Date: 9/30/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What game do you want to play?\n"+"Slot Machine | Black Jack");
		String game = sc.nextLine();
		int gametype = 0;
		
		//Slot Machine Code
		if (game.equals("Slot Machine")||game.equals("slot machine")||game.equals("slots")||game.equals("Slots")||game.equals("sm")||game.equals("SM")){
			gametype = 1;
			System.out.println("You have selected: Slot Machine");
			int sm_money = 100;
			System.out.println("Slot Machine Rules:\n"+"1. Player will start with $100.\n"+"2. Wager an amount less than your total.\n"+"3. The slot machine will roll 3 numbers from 1 - 10.\n"+"	a. If you get 2 of the same number, you double your money.\n"+"If you get 3 of the same number, you triple your money.\n"+"If none match, you lose the money you bet.\n"+"____________________________________________________________________\n"+"Are you ready to play? (Yes/No): ");
			String sm_confirm = sc.nextLine();			
			while(true){
				if (sm_confirm.equals("Yes")||sm_confirm.equals("yes")||sm_confirm.equals("Y")||sm_confirm.equals("y")){
					System.out.println("You have $"+sm_money+". How much would you like to wager?");
					int sm_wager = sc.nextInt();
					while (true){
						if (sm_wager<=sm_money&&sm_wager>0){
							break;
						}
						else if (sm_wager>sm_money){
							System.out.println("Wager too high. Input another number.");
							sm_wager=sc.nextInt();
						}
						else{
							System.out.println("Wager too low. Input another number.");
							sm_wager = sc.nextInt();
						}
					}
					System.out.println("Okay! Wager: $"+sm_wager);
					int sm_num1 = (int)(Math.random()*11);
					int sm_num2 = (int)(Math.random()*11);
					int sm_num3 = (int)(Math.random()*11);
					System.out.println("___________________\n"+" \n"+"  | "+sm_num1+" | "+sm_num2+" | "+sm_num3+" |  \n"+"___________________");
					if (sm_num1==sm_num2&&sm_num2==sm_num3){
						System.out.println("Jackpot! Your wager has been tripled!");
						sm_money = sm_money+sm_wager*3;
						System.out.println("You have $"+sm_money+"!");
					}
					else if (sm_num1==sm_num2||sm_num2==sm_num3||sm_num1==sm_num3){
						System.out.println("Win! Your wager has been doubled!");
						sm_money = sm_money+sm_wager*2;
						System.out.println("You have $"+sm_money+"!");
					}
					else{
						System.out.println("You lost. Better luck next time!");
						sm_money = sm_money-sm_wager;
						System.out.println("You have $"+sm_money+"!");
					}
					System.out.print("Are you ready to play again? (Yes/No): ");
				}
				else if (sm_confirm.equals("No")||sm_confirm.equals("no")||sm_confirm.equals("N")||sm_confirm.equals("n")||sm_money==0){
					break;
				}
				else{
					System.out.println("Unknown entry. Please answer (Yes/No)");
				}
				sm_confirm = sc.nextLine();
			}
			System.out.print("See you again soon! You ended with $"+sm_money+" left.");
		}
		else if (game.equals("Black Jack")||game.equals("black jack")||game.equals("bj")||game.equals("BJ")||game.equals("Bj")||game.equals("bJ")){
			gametype = 2;
			System.out.println("You have selected: Black Jack");
			System.out.println("Black Jack Rules:\n"+"1. Player will start with $100.\n"+"2. Wager an amount less than your total.\n"+"3. Each player will be dealt 2 cards.\n"+"	a. Royals all count as 10, except for Aces, which can be worth either 1 or 11.\n"+"If you get 3 of the same number, you triple your money.\n"+"If none match, you lose the money you bet.\n"+"____________________________________________________________________\n"+"Are you ready to play? (Yes/No): ");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
