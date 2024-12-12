/*
 *	Author: Isaac No
 *  Date: 9/30/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class blackjack {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//Blackjack Code
		//else if (game.equals("Black Jack")||game.equals("black jack")||game.equals("bj")||game.equals("BJ")||game.equals("Bj")||game.equals("bJ")){
			//gametype = 2;
		System.out.println("You have selected: Black Jack");
		int bj_money = 100;
		System.out.println("Black Jack Rules:\n"+"1. Player will start with $100.\n"+"2. Wager an amount less than your total.\n"+"3. Each player will be dealt 2 cards, including the dealer. One of the dealer's cards will be facing up, the other facing down.\n"+"	a. Royals all count as 10, except for Aces, which can be worth either 1 or 11.\n"+"	b. Your goal is to get as close to 21 as possible.\n"+"	c. If you go over 21, you lose automatically.\n"+"4. After every player has drawn, the dealer will flip their card, and will keep drawing until the reach 17 or more, or they go over 21.\n"+"4. Each player closer to 21 than the dealer doubles their money.\n"+"5. If they go over 21 or are further away from 21 than the dealer, they lose their wager.\n"+"6. You may draw up to 3 additional cards.\n"+"__________________________________________________________________________\n"+"Are you ready to play? (Yes/No): ");
		String bj_confirm = sc.nextLine();

		while (true){
			if (bj_confirm.equals("Yes")||bj_confirm.equals("yes")||bj_confirm.equals("Y")||bj_confirm.equals("y")){
				//starter
				System.out.println("How many players are playing? (1-1)");
				int bj_playernum = sc.nextInt();
				System.out.println("You have $"+bj_money+". How much would you like to wager?");
				int bj_wager = sc.nextInt();
				//wager check
				while (true){
					if (bj_wager<=bj_money&&bj_wager>0){
						break;
					}
					else if (bj_wager>bj_money){
						System.out.println("Wager too high. Input another number.");
						bj_wager=sc.nextInt();
					}
					else{
						System.out.println("Wager too low. Input another number.");
						bj_wager = sc.nextInt();
					}
				}
				System.out.println("Okay! Wager: $"+bj_wager+"\n");
				//player start card creation
				int bj_pcard_val1 = (int)((Math.random()*13)+1);
				try {
					Thread.sleep(10);
				} catch (InterruptedException bj_pause){}
				int bj_pcard_sym1 = (int)(Math.random()*4);
				try {
					Thread.sleep(10);
				} catch (InterruptedException bj_pause){}
				int bj_pcard_val2 = (int)((Math.random()*13)+1);
				try {
					Thread.sleep(10);
				} catch (InterruptedException bj_pause){}
				int bj_pcard_sym2 = (int)(Math.random()*4);
				while (true){
					if (bj_pcard_val1 == bj_pcard_val2 && bj_pcard_sym1 == bj_pcard_sym2){
						bj_pcard_val2 = (int)((Math.random()*13)+1);
						try {
							Thread.sleep(20);
						} catch (InterruptedException bj_pause){}
						bj_pcard_sym2 = (int)(Math.random()*4);
					}
					else{
						break;
					}
				}
				//dealer start card creation
				int bj_dcard_val1 = (int)((Math.random()*13)+1);
				try {
					Thread.sleep(10);
				} catch (InterruptedException bj_pause){}
				int bj_dcard_sym1 = (int)(Math.random()*4);
				try {
					Thread.sleep(10);
				} catch (InterruptedException bj_pause){}
				int bj_dcard_val2 = (int)((Math.random()*13)+1);
				try {
					Thread.sleep(10);
				} catch (InterruptedException bj_pause){}
				int bj_dcard_sym2 = (int)(Math.random()*4);
				//dupe card fix
				while (true){
					if (bj_dcard_val1 == bj_dcard_val2 && bj_dcard_sym1 == bj_dcard_sym2){
						bj_dcard_val2 = (int)((Math.random()*13)+1);
						bj_dcard_sym2 = (int)(Math.random()*4);
					}
					else if (bj_dcard_val1 == bj_pcard_val1 && bj_dcard_sym1 == bj_pcard_sym1){
						bj_dcard_val1 = (int)((Math.random()*13)+1);
						bj_dcard_sym1 = (int)(Math.random()*4);
					}
					else if (bj_dcard_val1 == bj_pcard_val2 && bj_dcard_sym1 == bj_pcard_sym2){
						bj_dcard_val1 = (int)((Math.random()*13)+1);
						bj_dcard_sym1 = (int)(Math.random()*4);
					}
					else if (bj_dcard_val2 == bj_pcard_val1 && bj_dcard_sym2 == bj_pcard_sym1){
						bj_dcard_val2 = (int)((Math.random()*13)+1);
						bj_dcard_sym2 = (int)(Math.random()*4);
					}
					else if (bj_dcard_val2 == bj_pcard_val2 && bj_dcard_sym2 == bj_pcard_sym2){
						bj_dcard_val2 = (int)((Math.random()*13)+1);
						bj_dcard_sym2 = (int)(Math.random()*4);
					}
					else{
						break;
					}
				}
				//dealer card display start
				System.out.println("Dealer Cards: ");
				String bj_dcard_symt1 = "";
				String bj_dcard_symt2 = "";
				if (bj_dcard_sym1 == 0){
					if (bj_dcard_val1 == 1){
						bj_dcard_symt1 = "\033[0;31m"+" ♦ A"+"\033[0m";
						System.out.print(bj_dcard_symt1);
					}
					else if (bj_dcard_val1 == 11){
						bj_dcard_symt1 = "\033[0;31m"+" ♦ J"+"\033[0m";
						System.out.print(bj_dcard_symt1);
					}
					else if (bj_dcard_val1 == 12){
						bj_dcard_symt1 = "\033[0;31m"+" ♦ Q"+"\033[0m";
						System.out.print(bj_dcard_symt1);
					}
					else if (bj_dcard_val1 == 13){
						bj_dcard_symt1 = "\033[0;31m"+" ♦ K"+"\033[0m";
						System.out.print(bj_dcard_symt1);
					}
					else{
						bj_dcard_symt1 = "\033[0;31m"+" ♦ "+bj_dcard_val1+"\033[0m";
						System.out.print(bj_dcard_symt1);
					}
				}
				else if (bj_dcard_sym1 == 1){
					if (bj_dcard_val1 == 1){
						bj_dcard_symt1 = "\033[0;31m"+" ♥ A"+"\033[0m";
						System.out.print(bj_dcard_symt1);
					}
					else if (bj_dcard_val1 == 11){
						bj_dcard_symt1 = "\033[0;31m"+" ♥ J"+"\033[0m";
						System.out.print(bj_dcard_symt1);
					}
					else if (bj_dcard_val1 == 12){
						bj_dcard_symt1 = "\033[0;31m"+" ♥ Q"+"\033[0m";
						System.out.print(bj_dcard_symt1);
					} 
					else if (bj_dcard_val1 == 13){
						bj_dcard_symt1 = "\033[0;31m"+" ♥ K"+"\033[0m";
						System.out.print(bj_dcard_symt1);
					}
					else {
						bj_dcard_symt1 = "\033[0;31m"+" ♥ "+bj_dcard_val1+"\033[0m";
						System.out.print(bj_dcard_symt1);
					}
				}
				else if (bj_dcard_sym1 == 2){
					if (bj_dcard_val1 == 1){
						bj_dcard_symt1 = " ♠ A";
						System.out.print(bj_dcard_symt1);
					}
					else if (bj_dcard_val1 == 11){
						bj_dcard_symt1 = " ♠ J";
						System.out.print(bj_dcard_symt1);
					} 
					else if (bj_dcard_val1 == 12){
						bj_dcard_symt1 = " ♠ Q";
						System.out.print(bj_dcard_symt1);
					}
					else if (bj_dcard_val1 == 13){
						bj_dcard_symt1 = " ♠ K";
						System.out.print(bj_dcard_symt1);
					} 
					else{
						bj_dcard_symt1 = " ♠ "+bj_dcard_val1;
						System.out.print(bj_dcard_symt1);
					}
				}				
				else if (bj_dcard_sym1 == 3){
					if (bj_dcard_val1 == 1){
						bj_dcard_symt1 = " ♣ A";
						System.out.print(bj_dcard_symt1);
					}
					else if (bj_dcard_val1 == 11){
						bj_dcard_symt1 = " ♣ J";
						System.out.print(bj_dcard_symt1);
					}
					else if (bj_dcard_val1 == 12){
						bj_dcard_symt1 = " ♣ Q";
						System.out.print(bj_dcard_symt1);
					} 
					else if (bj_dcard_val1 == 13){
						bj_dcard_symt1 = " ♣ K";
						System.out.print(bj_dcard_symt1);
					}
					else{
						bj_dcard_symt1 = " ♣ "+bj_dcard_val1;
						System.out.print(bj_dcard_symt1);	
					}
				}
				
				if (bj_dcard_sym2 == 0){
					if (bj_dcard_val2 == 1){
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♦ A"+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
					else if (bj_dcard_val2 == 11){
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♦ J"+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
					else if (bj_dcard_val2 == 12){
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♦ Q"+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
					else if (bj_dcard_val2 == 13){
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♦ K"+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
					else{
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♦ "+bj_dcard_val2+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
				}
				else if (bj_dcard_sym2 == 1){
					if (bj_dcard_val2 == 1){
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♥ A"+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
					else if (bj_dcard_val2 == 11){
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♥ J"+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
					else if (bj_dcard_val2 == 12){
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♥ Q"+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
					else if (bj_dcard_val2 == 13){
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♥ K"+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
					else{
						bj_dcard_symt2 = " |"+"\033[0;31m"+" ♥ "+bj_dcard_val2+"\033[0m";
						System.out.println(bj_dcard_symt2);
					}
				}
				else if (bj_dcard_sym2 == 2){
					if (bj_dcard_val2 == 1){
						bj_dcard_symt2 = " |"+" ♠ A";
						System.out.println(bj_dcard_symt2);
					}
					else if (bj_dcard_val2 == 11){
						bj_dcard_symt2 = " |"+" ♠ J";
						System.out.println(bj_dcard_symt2);
					}
					else if (bj_dcard_val2 == 12){
						bj_dcard_symt2 = " |"+" ♠ Q";
						System.out.println(bj_dcard_symt2);
					}
					else if (bj_dcard_val2 == 13){
						bj_dcard_symt2 = " |"+" ♠ K";
						System.out.println(bj_dcard_symt2);
					}
					else{
						bj_dcard_symt2 = " |"+" ♠ "+bj_dcard_val2;
						System.out.println(bj_dcard_symt2);
					}
				}				
				else if (bj_dcard_sym2 == 3){
					if (bj_dcard_val2 == 1){
						bj_dcard_symt2 = "|"+" ♣ A";
						System.out.println(bj_dcard_symt2);	
					}
					else if (bj_dcard_val2 == 11){
						bj_dcard_symt2 = "|"+" ♣ J";
						System.out.println(bj_dcard_symt2);	
					}
					else if (bj_dcard_val2 == 12){
						bj_dcard_symt2 = "|"+" ♣ A";
						System.out.println(bj_dcard_symt2);	
					}
					else if (bj_dcard_val2 == 13){
						bj_dcard_symt2 = "|"+" ♣ K";
						System.out.println(bj_dcard_symt2);	
					}
					else{
						bj_dcard_symt2 = "|"+" ♣ "+bj_dcard_val2;
						System.out.println(bj_dcard_symt2);	
					}
					
				}
				System.out.println("___________________");
				//player card display start
				String bj_pcard_symt1 = "1";
				String bj_pcard_symt2 = "";
				System.out.println("\nHere are your cards: ");
				if (bj_pcard_sym1 == 0){
					if (bj_pcard_val1 == 1){
						bj_pcard_symt1 = "\033[0;31m"+" ♦ A"+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 11){
						bj_pcard_symt1 = "\033[0;31m"+" ♦ A"+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 12){
						bj_pcard_symt1 = "\033[0;31m"+" ♦ Q"+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 13){
						bj_pcard_symt1 = "\033[0;31m"+" ♦ K"+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
					else{
						bj_pcard_symt1 ="\033[0;31m"+" ♦ "+bj_pcard_val1+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
				}
				else if (bj_pcard_sym1 == 1){
					if (bj_pcard_val1 == 1){
						bj_pcard_symt1 = "\033[0;31m"+" ♥ A"+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 11){
						bj_pcard_symt1 = "\033[0;31m"+" ♥ J"+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 12){
						bj_pcard_symt1 = "\033[0;31m"+" ♥ Q"+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 13){
						bj_pcard_symt1 = "\033[0;31m"+" ♥ K"+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
					else{
						bj_pcard_symt1 ="\033[0;31m"+" ♥ "+bj_pcard_val1+"\033[0m";
						System.out.print(bj_pcard_symt1);
					}
				}
				else if (bj_pcard_sym1 == 2){
					if (bj_pcard_val1 == 1){
						bj_pcard_symt1 = " ♠ A";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 11){
						bj_pcard_symt1 = " ♠ J";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 12){
						bj_pcard_symt1 = " ♠ Q";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 13){
						bj_pcard_symt1 = " ♠ K";
						System.out.print(bj_pcard_symt1);
					}
					else{
						bj_pcard_symt1 =" ♠ "+bj_pcard_val1;
						System.out.print(bj_pcard_symt1);
					}
				}	
				else if (bj_pcard_sym1 == 3){
					if (bj_pcard_val1 == 1){
						bj_pcard_symt1 = " ♣ A";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 11){
						bj_pcard_symt1 = " ♣ J";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 12){
						bj_pcard_symt1 = " ♣ Q";
						System.out.print(bj_pcard_symt1);
					}
					else if (bj_pcard_val1 == 13){
						bj_pcard_symt1 = " ♣ K";
						System.out.print(bj_pcard_symt1);
					}
					else{
						bj_pcard_symt1 =" ♣ "+bj_pcard_val1;
						System.out.print(bj_pcard_symt1);
					}
				}
				if (bj_pcard_sym2 == 0){
					if (bj_pcard_val2 == 1){
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♦ A"+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 11){
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♦ J"+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 12){
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♦ Q"+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 13){
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♦ K"+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
					else{
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♦ "+bj_pcard_val2+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
				}
				else if (bj_pcard_sym2 == 1){
					if (bj_pcard_val2 == 1){
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♥ A"+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 11){
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♥ J"+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 12){
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♥ Q"+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 13){
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♥ K"+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
					else{
						bj_pcard_symt2 = " |"+"\033[0;31m"+" ♥ "+bj_pcard_val2+"\033[0m";
						System.out.println(bj_pcard_symt2);
					}
				}
				else if (bj_pcard_sym2 == 2){
					if (bj_pcard_val2 == 1){
						bj_pcard_symt2 = " |"+" ♠ A";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 11){
						bj_pcard_symt2 = " |"+" ♠ J";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 12){
						bj_pcard_symt2 = " |"+" ♠ Q";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 13){
						bj_pcard_symt2 = " |"+" ♠ K";
						System.out.println(bj_pcard_symt2);
					}
					else{
						bj_pcard_symt2 = " |"+" ♠ "+bj_pcard_val2;
						System.out.println(bj_pcard_symt2);
					}
				}				
				else if (bj_pcard_sym2 == 3){
					if (bj_pcard_val2 == 1){
						bj_pcard_symt2 = " |"+" ♣ A";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 11){
						bj_pcard_symt2 = " |"+" ♣ J";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 12){
						bj_pcard_symt2 = " |"+" ♣ Q";
						System.out.println(bj_pcard_symt2);
					}
					else if (bj_pcard_val2 == 13){
						bj_pcard_symt2 = " |"+" ♣ K";
						System.out.println(bj_pcard_symt2);
					}
					else{
						bj_pcard_symt2 = " |"+" ♣ "+bj_pcard_val2;
						System.out.println(bj_pcard_symt2);
					}
				}
				//player drawable cards
				int bj_pcard_val3 = (int)((Math.random()*13)+1);
				int bj_pcard_sym3 = (int)(Math.random()*4);
				while (true){
					if ((bj_pcard_val3 == bj_pcard_val1 && bj_pcard_sym3 == bj_pcard_sym1)||(bj_pcard_val3 == bj_pcard_val2 && bj_pcard_sym3 == bj_pcard_sym2)){
						bj_pcard_val3 = (int)((Math.random()*13)+1);
						bj_pcard_sym3 = (int)(Math.random()*4);
					}
					else{
						break;
					}
				}
				String bj_pcard_symt3 = "";
				if (bj_pcard_sym3 == 0){
					if (bj_pcard_val3 == 1){
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♦ A"+"\033[0m";
					}
					else if (bj_pcard_val3 == 11){
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♦ J"+"\033[0m";
					}
					else if (bj_pcard_val3 == 12){
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♦ Q"+"\033[0m";
					}
					else if (bj_pcard_val3 == 13){
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♦ K"+"\033[0m";
					}
					else{
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♦ "+bj_pcard_val3+"\033[0m";
					}
				}
				else if (bj_pcard_sym3 == 1){
					if (bj_pcard_val3 == 1){
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♥ A"+"\033[0m";
					}
					else if (bj_pcard_val3 == 11){
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♥ J"+"\033[0m";
					}
					else if (bj_pcard_val3 == 12){
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♥ Q"+"\033[0m";
					}
					else if (bj_pcard_val3 == 13){
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♥ K"+"\033[0m";
					}
					else{
						bj_pcard_symt3 = " |"+"\033[0;31m"+" ♥ "+bj_pcard_val3+"\033[0m";
					}
				}
				else if (bj_pcard_sym3 == 2){
					if (bj_pcard_val3 == 1){
						bj_pcard_symt3 = " |"+" ♠ A";
					}
					else if (bj_pcard_val3 == 11){
						bj_pcard_symt3 = " |"+" ♠ J";
					}
					else if (bj_pcard_val3 == 12){
						bj_pcard_symt3 = " |"+" ♠ Q";
					}
					else if (bj_pcard_val3 == 13){
						bj_pcard_symt3 = " |"+" ♠ K";
					}
					else{
						bj_pcard_symt3 = " |"+" ♠ "+bj_pcard_val3;
					}
				}				
				else if (bj_pcard_sym3 == 3){
					if (bj_pcard_val3 == 1){
						bj_pcard_symt3 = " |"+" ♣ A";
					}
					else if (bj_pcard_val3 == 11){
						bj_pcard_symt3 = " |"+" ♣ J";
					}
					else if (bj_pcard_val3 == 12){
						bj_pcard_symt3 = " |"+" ♣ Q";
					}
					else if (bj_pcard_val3 == 13){
						bj_pcard_symt3 = " |"+" ♣ K";
					}
					else{
						bj_pcard_symt3 = " |"+" ♣ "+bj_pcard_val3;
					}
				}
				int bj_pcard_val4 = (int)((Math.random()*13)+1);
				int bj_pcard_sym4 = (int)(Math.random()*4);
				while (true){
					if ((bj_pcard_val4 == bj_pcard_val1 && bj_pcard_sym4 == bj_pcard_sym1)||(bj_pcard_val4 == bj_pcard_val2 && bj_pcard_sym4 == bj_pcard_sym2)||(bj_pcard_val4 == bj_pcard_val3 && bj_pcard_sym4 == bj_pcard_sym3)){
						bj_pcard_val4 = (int)((Math.random()*13)+1);
						bj_pcard_sym4 = (int)(Math.random()*4);
					}
					else{
						break;
					}
				}
				String bj_pcard_symt4 = "";
				if (bj_pcard_sym4 == 0){
					if (bj_pcard_val4 == 1){
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♦ A"+"\033[0m";
					}
					else if (bj_pcard_val4 == 11){
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♦ J"+"\033[0m";
					}
					else if (bj_pcard_val4 == 12){
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♦ Q"+"\033[0m";
					}
					else if (bj_pcard_val4 == 13){
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♦ K"+"\033[0m";
					}
					else{
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♦ "+bj_pcard_val4+"\033[0m";
					}
				}
				else if (bj_pcard_sym4 == 1){
					if (bj_pcard_val4 == 1){
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♥ A"+"\033[0m";
					}
					else if (bj_pcard_val4 == 11){
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♥ J"+"\033[0m";
					}
					else if (bj_pcard_val4 == 12){
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♥ Q"+"\033[0m";
					}
					else if (bj_pcard_val4 == 13){
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♥ K"+"\033[0m";
					}
					else{
						bj_pcard_symt4 = " |"+"\033[0;31m"+" ♥ "+bj_pcard_val4+"\033[0m";
					}
				}
				else if (bj_pcard_sym4 == 2){
					if (bj_pcard_val4 == 1){
						bj_pcard_symt4 = " |"+" ♠ A";
					}
					else if (bj_pcard_val4 == 11){
						bj_pcard_symt4 = " |"+" ♠ J";
					}
					else if (bj_pcard_val4 == 12){
						bj_pcard_symt4 = " |"+" ♠ Q";
					}
					else if (bj_pcard_val4 == 13){
						bj_pcard_symt4 = " |"+" ♠ K";
					}
					else{
						bj_pcard_symt4 = " |"+" ♠ "+bj_pcard_val4;
					}
				}				
				else if (bj_pcard_sym4 == 3){
					if (bj_pcard_val4 == 1){
						bj_pcard_symt4 = " |"+" ♣ A";
					}
					else if (bj_pcard_val4 == 11){
						bj_pcard_symt4 = " |"+" ♣ J";
					}
					else if (bj_pcard_val4 == 12){
						bj_pcard_symt4 = " |"+" ♣ Q";
					}
					else if (bj_pcard_val4 == 13){
						bj_pcard_symt4 = " |"+" ♣ K";
					}
					else{
						bj_pcard_symt4 = " |"+" ♣ "+bj_pcard_val4;
					}
				}
				int bj_pcard_val5 = (int)((Math.random()*13)+1);
				int bj_pcard_sym5 = (int)(Math.random()*4);
				while (true){
					if ((bj_pcard_val5 == bj_pcard_val1 && bj_pcard_sym5 == bj_pcard_sym1)||(bj_pcard_val5 == bj_pcard_val2 && bj_pcard_sym5 == bj_pcard_sym2)||(bj_pcard_val5 == bj_pcard_val3 && bj_pcard_sym5 == bj_pcard_sym3)||(bj_pcard_val5 == bj_pcard_val4 && bj_pcard_sym5 == bj_pcard_sym4)){
						bj_pcard_val5 = (int)((Math.random()*13)+1);
						bj_pcard_sym5 = (int)(Math.random()*4);
					}
					else{
						break;
					}
				}
				String bj_pcard_symt5 = "";
				if (bj_pcard_sym5 == 0){
					if (bj_pcard_val5 == 1){
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♦ A"+"\033[0m";
					}
					else if (bj_pcard_val5 == 11){
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♦ J"+"\033[0m";
					}
					else if (bj_pcard_val5 == 12){
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♦ Q"+"\033[0m";
					}
					else if (bj_pcard_val5 == 13){
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♦ K"+"\033[0m";
					}
					else{
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♦ "+bj_pcard_val5+"\033[0m";
					}
				}
				else if (bj_pcard_sym5 == 1){
					if (bj_pcard_val5 == 1){
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♥ A"+"\033[0m";
					}
					else if (bj_pcard_val5 == 11){
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♥ J"+"\033[0m";
					}
					else if (bj_pcard_val5 == 12){
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♥ Q"+"\033[0m";
					}
					else if (bj_pcard_val5 == 13){
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♥ K"+"\033[0m";
					}
					else{
						bj_pcard_symt5 = " |"+"\033[0;31m"+" ♥ "+bj_pcard_val5+"\033[0m";
					}
				}
				else if (bj_pcard_sym5 == 2){
					if (bj_pcard_val5 == 1){
						bj_pcard_symt5 = " |"+" ♠ A";
					}
					else if (bj_pcard_val5 == 11){
						bj_pcard_symt5 = " |"+" ♠ J";
					}
					else if (bj_pcard_val5 == 12){
						bj_pcard_symt5 = " |"+" ♠ Q";
					}
					else if (bj_pcard_val5 == 13){
						bj_pcard_symt5 = " |"+" ♠ K";
					}
					else{
						bj_pcard_symt5 = " |"+" ♠ "+bj_pcard_val5;
					}
				}				
				else if (bj_pcard_sym5 == 3){
					if (bj_pcard_val5 == 1){
						bj_pcard_symt5 = " |"+" ♣ A";
					}
					else if (bj_pcard_val5 == 11){
						bj_pcard_symt5 = " |"+" ♣ J";
					}
					else if (bj_pcard_val5 == 12){
						bj_pcard_symt5 = " |"+" ♣ Q";
					}
					else if (bj_pcard_val5 == 13){
						bj_pcard_symt5 = " |"+" ♣ K";
					}
					else{
						bj_pcard_symt5 = " |"+" ♣ "+bj_pcard_val5;
					}
				}
				//dealer drawable cards
				int bj_dcard_val3 = (int)((Math.random()*13)+1);
				int bj_dcard_sym3 = (int)(Math.random()*4);
				while (true){
					if ((bj_dcard_val3 == bj_dcard_val1 && bj_dcard_sym3 == bj_dcard_sym1)||(bj_dcard_val3 == bj_dcard_val2 && bj_dcard_sym3 == bj_dcard_sym2)){
						bj_dcard_val3 = (int)((Math.random()*13)+1);
						bj_dcard_sym3 = (int)(Math.random()*4);
					}
					else{
						break;
					}
				}
				String bj_dcard_symt3 = "";
				if (bj_dcard_sym3 == 0){
					if (bj_dcard_val3 == 1){
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♦ A"+"\033[0m";
					}
					else if (bj_dcard_val3 == 11){
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♦ J"+"\033[0m";
					}
					else if (bj_dcard_val3 == 12){
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♦ Q"+"\033[0m";
					}
					else if (bj_dcard_val3 == 13){
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♦ K"+"\033[0m";
					}
					else{
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♦ "+bj_dcard_val3+"\033[0m";
					}
				}
				else if (bj_dcard_sym3 == 1){
					if (bj_dcard_val3 == 1){
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♥ A"+"\033[0m";
					}
					else if (bj_dcard_val3 == 11){
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♥ J"+"\033[0m";
					}
					else if (bj_dcard_val3 == 12){
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♥ Q"+"\033[0m";
					}
					else if (bj_dcard_val3 == 13){
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♥ K"+"\033[0m";
					}
					else{
						bj_dcard_symt3 = " |"+"\033[0;31m"+" ♥ "+bj_dcard_val3+"\033[0m";
					}
				}
				else if (bj_dcard_sym3 == 2){
					if (bj_dcard_val3 == 1){
						bj_dcard_symt3 = " |"+" ♠ A";
					}
					else if (bj_dcard_val3 == 11){
						bj_dcard_symt3 = " |"+" ♠ J";
					}
					else if (bj_dcard_val3 == 12){
						bj_dcard_symt3 = " |"+" ♠ Q";
					}
					else if (bj_dcard_val3 == 13){
						bj_dcard_symt3 = " |"+" ♠ K";
					}
					else{
						bj_dcard_symt3 = " |"+" ♠ "+bj_dcard_val3;
					}
				}				
				else if (bj_dcard_sym3 == 3){
					if (bj_dcard_val3 == 1){
						bj_dcard_symt3 = " |"+" ♣ A";
					}
					else if (bj_dcard_val3 == 11){
						bj_dcard_symt3 = " |"+" ♣ J";
					}
					else if (bj_dcard_val3 == 12){
						bj_dcard_symt3 = " |"+" ♣ Q";
					}
					else if (bj_dcard_val3 == 13){
						bj_dcard_symt3 = " |"+" ♣ K";
					}
					else{
						bj_dcard_symt3 = " |"+" ♣ "+bj_dcard_val3;
					}
				}
				int bj_dcard_val4 = (int)((Math.random()*13)+1);
				int bj_dcard_sym4 = (int)(Math.random()*4);
				while (true){
					if ((bj_dcard_val4 == bj_dcard_val1 && bj_dcard_sym4 == bj_dcard_sym1)||(bj_dcard_val4 == bj_dcard_val2 && bj_dcard_sym4 == bj_dcard_sym2)||(bj_dcard_val4 == bj_dcard_val3 && bj_dcard_sym4 == bj_dcard_sym3)){
						bj_dcard_val4 = (int)((Math.random()*13)+1);
						bj_dcard_sym4 = (int)(Math.random()*4);
					}
					else{
						break;
					}
				}
				String bj_dcard_symt4 = "";
				if (bj_dcard_sym4 == 0){
					if (bj_dcard_val4 == 1){
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♦ A"+"\033[0m";
					}
					else if (bj_dcard_val4 == 11){
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♦ J"+"\033[0m";
					}
					else if (bj_dcard_val4 == 12){
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♦ Q"+"\033[0m";
					}
					else if (bj_dcard_val4 == 13){
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♦ K"+"\033[0m";
					}
					else{
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♦ "+bj_dcard_val4+"\033[0m";
					}
				}
				else if (bj_dcard_sym4 == 1){
					if (bj_dcard_val4 == 1){
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♥ A"+"\033[0m";
					}
					else if (bj_dcard_val4 == 11){
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♥ J"+"\033[0m";
					}
					else if (bj_dcard_val4 == 12){
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♥ Q"+"\033[0m";
					}
					else if (bj_dcard_val4 == 13){
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♥ K"+"\033[0m";
					}
					else{
						bj_dcard_symt4 = " |"+"\033[0;31m"+" ♥ "+bj_dcard_val4+"\033[0m";
					}
				}
				else if (bj_dcard_sym4 == 2){
					if (bj_dcard_val4 == 1){
						bj_dcard_symt4 = " |"+" ♠ A";
					}
					else if (bj_dcard_val4 == 11){
						bj_dcard_symt4 = " |"+" ♠ J";
					}
					else if (bj_dcard_val4 == 12){
						bj_dcard_symt4 = " |"+" ♠ Q";
					}
					else if (bj_dcard_val4 == 13){
						bj_dcard_symt4 = " |"+" ♠ K";
					}
					else{
						bj_dcard_symt4 = " |"+" ♠ "+bj_dcard_val4;
					}
				}				
				else if (bj_dcard_sym4 == 3){
					if (bj_dcard_val4 == 1){
						bj_dcard_symt4 = " |"+" ♣ A";
					}
					else if (bj_dcard_val4 == 11){
						bj_dcard_symt4 = " |"+" ♣ J";
					}
					else if (bj_dcard_val4 == 12){
						bj_dcard_symt4 = " |"+" ♣ Q";
					}
					else if (bj_dcard_val4 == 13){
						bj_dcard_symt4 = " |"+" ♣ K";
					}
					else{
						bj_dcard_symt4 = " |"+" ♣ "+bj_dcard_val4;
					}
				}
				
				int bj_dcard_val5 = (int)((Math.random()*13)+1);
				int bj_dcard_sym5 = (int)(Math.random()*4);
				while (true){
					if ((bj_dcard_val5 == bj_dcard_val1 && bj_dcard_sym5 == bj_dcard_sym1)||(bj_dcard_val5 == bj_dcard_val2 && bj_dcard_sym5 == bj_dcard_sym2)||(bj_dcard_val5 == bj_dcard_val3 && bj_dcard_sym5 == bj_dcard_sym3)||(bj_dcard_val5 == bj_dcard_val4 && bj_dcard_sym5 == bj_dcard_sym4)){
						bj_dcard_val5 = (int)((Math.random()*13)+1);
						bj_dcard_sym5 = (int)(Math.random()*4);
					}
					else{
						break;
					}
				}
				String bj_dcard_symt5 = "";
				if (bj_dcard_sym5 == 0){
					if (bj_dcard_val5 == 1){
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♦ A"+"\033[0m";
					}
					else if (bj_dcard_val5 == 11){
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♦ J"+"\033[0m";
					}
					else if (bj_dcard_val5 == 12){
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♦ Q"+"\033[0m";
					}
					else if (bj_dcard_val5 == 13){
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♦ K"+"\033[0m";
					}
					else{
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♦ "+bj_dcard_val5+"\033[0m";
					}
				}
				else if (bj_dcard_sym5 == 1){
					if (bj_dcard_val5 == 1){
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♥ A"+"\033[0m";
					}
					else if (bj_dcard_val5 == 11){
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♥ J"+"\033[0m";
					}
					else if (bj_dcard_val5 == 12){
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♥ Q"+"\033[0m";
					}
					else if (bj_dcard_val5 == 13){
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♥ K"+"\033[0m";
					}
					else{
						bj_dcard_symt5 = " |"+"\033[0;31m"+" ♥ "+bj_dcard_val5+"\033[0m";
					}
				}
				else if (bj_dcard_sym5 == 2){
					if (bj_dcard_val5 == 1){
						bj_dcard_symt5 = " |"+" ♠ A";
					}
					else if (bj_dcard_val5 == 11){
						bj_dcard_symt5 = " |"+" ♠ J";
					}
					else if (bj_dcard_val5 == 12){
						bj_dcard_symt5 = " |"+" ♠ Q";
					}
					else if (bj_dcard_val5 == 13){
						bj_dcard_symt5 = " |"+" ♠ K";
					}
					else{
						bj_dcard_symt5 = " |"+" ♠ "+bj_dcard_val5;
					}
				}				
				else if (bj_dcard_sym5 == 3){
					if (bj_dcard_val5 == 1){
						bj_dcard_symt5 = " |"+" ♣ A";
					}
					else if (bj_dcard_val5 == 11){
						bj_dcard_symt5 = " |"+" ♣ J";
					}
					else if (bj_dcard_val5 == 12){
						bj_dcard_symt5 = " |"+" ♣ Q";
					}
					else if (bj_dcard_val5 == 13){
						bj_dcard_symt5 = " |"+" ♣ K";
					}
					else{
						bj_dcard_symt5 = " |"+" ♣ "+bj_dcard_val5;
					}
				}
				
				//royal -> 10 conversion
				if (bj_pcard_val1 == 11||bj_pcard_val1 == 12||bj_pcard_val1 == 13){
					bj_pcard_val1 = 10;
				}
				if (bj_pcard_val2 == 11||bj_pcard_val2 == 12||bj_pcard_val2 == 13){
					bj_pcard_val2 = 10;
				}
				if (bj_pcard_val3 == 11||bj_pcard_val3 == 12||bj_pcard_val3 == 13){
					bj_pcard_val3 = 10;
				}
				if (bj_pcard_val4 == 11||bj_pcard_val4 == 12||bj_pcard_val4 == 13){
					bj_pcard_val4 = 10;
				}
				if (bj_pcard_val5 == 11||bj_pcard_val5 == 12||bj_pcard_val5 == 13){
					bj_pcard_val5 = 10;
				}
				if (bj_dcard_val1 == 11||bj_dcard_val1 == 12||bj_dcard_val1 == 13){
					bj_dcard_val1 = 10;
				}
				if (bj_dcard_val2 == 11||bj_dcard_val2 == 12||bj_dcard_val2 == 13){
					bj_dcard_val2 = 10;
				}
				if (bj_dcard_val3 == 11||bj_dcard_val3 == 12||bj_dcard_val3 == 13){
					bj_dcard_val3 = 10;
				}
				if (bj_dcard_val4 == 11||bj_dcard_val4 == 12||bj_dcard_val4 == 13){
					bj_dcard_val4 = 10;
				}
				if (bj_dcard_val5 == 11||bj_dcard_val5 == 12||bj_dcard_val5 == 13){
					bj_dcard_val5 = 10;
				}
				
				//ace -> 11 conversion
				if (bj_pcard_val1 == 0){
					bj_pcard_val1 = 11;
				}
				if (bj_pcard_val2 == 0){
					bj_pcard_val2 = 11;
				}
				if (bj_pcard_val3 == 0){
					bj_pcard_val3 = 11;
				}
				if (bj_pcard_val4 == 0){
					bj_pcard_val4 = 11;
				}
				if (bj_pcard_val5 == 0){
					bj_pcard_val5 = 11;
				}
				if (bj_dcard_val1 == 0){
					bj_dcard_val1 = 11;
				}
				if (bj_dcard_val2 == 0){
					bj_dcard_val2 = 11;
				}
				if (bj_dcard_val3 == 0){
					bj_dcard_val3 = 11;
				}
				if (bj_dcard_val4 == 0){
					bj_dcard_val4 = 11;
				}
				if (bj_dcard_val5 == 0){
					bj_dcard_val5 = 11;
				}
				
				//blackjack check
				if ((bj_pcard_val1+bj_pcard_val2==21)){
					System.out.println("You got Blackjack!");
					System.out.println(bj_dcard_symt1+bj_dcard_val1 + " | "+bj_dcard_sym2+bj_dcard_val2);
					if (bj_dcard_val1+bj_dcard_val2==21){
						System.out.println();
					}
					else if (bj_dcard_val1+bj_dcard_val2<21&&bj_dcard_val1+bj_dcard_val2>17){
						System.out.println("Dealer will draw.\n Dealer's Hand:\n" + bj_dcard_symt1+bj_dcard_val1+" | "+bj_dcard_symt2+bj_dcard_val2+" | "+bj_dcard_symt3+bj_dcard_val3);
						System.out.println("___________________");
						System.out.println("Your Hand:\n" + bj_pcard_symt1+bj_dcard_val1+" | "+bj_pcard_symt2+bj_pcard_val2);
						if (bj_dcard_val1+bj_dcard_val2+bj_dcard_val3<17){
							System.out.println("");
						}
					}
					else if (bj_dcard_val1+bj_dcard_val2>17){
						System.out.println("The dealer can't draw. You win!");
						
					}
					if (bj_dcard_val1+bj_dcard_val2+bj_dcard_val3+bj_dcard_val4==0);
				}
				else{
					System.out.println("Hit or Stand?");
					String bj_hitstand = sc.nextLine();
					if (bj_hitstand.equals("hit")||bj_hitstand.equals("h")||bj_hitstand.equals("H")||bj_hitstand.equals("Hit")){
						System.out.println("Hit!");
						int bj_pdrawn = 1;
						while(bj_pdrawn <5){
							if (bj_pdrawn == 1){
								System.out.print(bj_dcard_symt1+bj_dcard_val1+" | "+bj_dcard_sym2 +bj_dcard_val2+"\n___________________\n");
								System.out.println(bj_pcard_symt1+bj_pcard_val1+" | "+bj_pcard_symt2+bj_pcard_val2);
							}
							bj_pdrawn++;
						}
					}
					else if (bj_hitstand.equals("Stand")||bj_hitstand.equals("stand")||bj_hitstand.equals("s")||bj_hitstand.equals("s")){
						System.out.println("Stand!");
						if ((bj_pcard_val1 == 1||bj_pcard_val2 == 1||bj_pcard_val3 == 1||bj_pcard_val4 == 1||bj_pcard_val5 == 1)&&(bj_pcard_val1+bj_pcard_val2+bj_pcard_val3+bj_pcard_val4+bj_pcard_val5)<21){
							System.out.println("Should your ace be counted as 1 or 11?");
							int bj_aceconfirm = sc.nextInt();
							while (bj_pcard_val1 == 1 ||bj_pcard_val2 == 1 ||bj_pcard_val3 == 1 ||bj_pcard_val4 == 1 ||bj_pcard_val5 == 1){
								if (bj_aceconfirm == 1){
									if (bj_pcard_val1 == 1){
										bj_pcard_val1 = 11;	
									}
									else if (bj_pcard_val2 == 1){
										bj_pcard_val2 = 11;
									}
									else if (bj_pcard_val3 == 1){
										bj_pcard_val3 = 11;
									}
									else if (bj_pcard_val4 == 1){
										bj_pcard_val4 = 11;
									}
									else if (bj_pcard_val5 == 1){
										bj_pcard_val5 = 11;
									}
								}
								else if (bj_aceconfirm == 11){
									if (bj_pcard_val1 == 1){
										bj_pcard_val1 = 11;	
									}
									else if (bj_pcard_val2 == 1){
										bj_pcard_val2 = 11;
									}
									else if (bj_pcard_val3 == 1){
										bj_pcard_val3 = 11;
									}
									else if (bj_pcard_val4 == 1){
										bj_pcard_val4 = 11;
									}
									else if (bj_pcard_val5 == 1){
										bj_pcard_val5 = 11;
									}
								}
								else{
									System.out.println(bj_aceconfirm + " is not valid. Pick (1/11)");
									bj_aceconfirm = sc.nextInt();
								}
							}
							
					
						}
						if (bj_pcard_val2 == 1){
							bj_pcard_val2 = 11;
						}
					}
				}
				
				
				
				
				
				
				
				
				
				if (bj_money > 0){
					System.out.println("Do you want to play again?");
					bj_confirm = sc.nextLine();	
				}
				else{
					System.out.println("You ran out of money!");
				}
				
			}
			else if (bj_confirm.equals("No")||bj_confirm.equals("no")||bj_confirm.equals("N")||bj_confirm.equals("n")||bj_money==0){
				break;
			}
			else{
				System.out.println("Unknown entry. Please answer (Yes/No)");
				bj_confirm = sc.nextLine();	
			}
		}
		System.out.print("You ended with $"+bj_money);

//		}
	}
}
