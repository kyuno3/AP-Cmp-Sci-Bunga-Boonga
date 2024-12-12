/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What sentence would you like to translate into pig latin?");
		String input = sc.nextLine();
		int curSpace = -1;
		String output = "";
		while(true){
			System.out.println(input.substring(curSpace+1));
			int nextSpace = input.indexOf(" ", curSpace+1);
			if(nextSpace == -1){
				if(input.substring(curSpace+1,curSpace+2).equals("a")||input.substring(curSpace+1,curSpace+2).equals("e")||input.substring(curSpace+1,curSpace+2).equals("i")||input.substring(curSpace+1,curSpace+2).equals("o")||input.substring(curSpace+1,curSpace+2).equals("u")){
					output = output + input.substring(curSpace+1)+"-way.";
				}
				else if(input.substring(curSpace+2,curSpace+3).equals("a")||input.substring(curSpace+2,curSpace+3).equals("e")||input.substring(curSpace+2,curSpace+3).equals("i")||input.substring(curSpace+2,curSpace+3).equals("o")||input.substring(curSpace+2,curSpace+3).equals("u")){
					output = output + input.substring(curSpace+2)+"-"+input.substring(curSpace+1,curSpace+2)+"ay.";
				}
				else{
					output = output + input.substring(curSpace+3)+"-"+input.substring(curSpace+1,curSpace+3)+"ay.";
				}
				break;
			}
			if(input.substring(curSpace+1,curSpace+2).equals("a")||input.substring(curSpace+1,curSpace+2).equals("e")||input.substring(curSpace+1,curSpace+2).equals("i")||input.substring(curSpace+1,curSpace+2).equals("o")||input.substring(curSpace+1,curSpace+2).equals("u")){
					output = output + input.substring(curSpace+1,nextSpace)+"-way ";
			}
			else if(input.substring(curSpace+2,curSpace+3).equals("a")||input.substring(curSpace+2,curSpace+3).equals("e")||input.substring(curSpace+2,curSpace+3).equals("i")||input.substring(curSpace+2,curSpace+3).equals("o")||input.substring(curSpace+2,curSpace+3).equals("u")){
				output = output + input.substring(curSpace+2, nextSpace)+"-"+input.substring(curSpace+1,curSpace+2)+"ay ";
			}
			else {
				output = output + input.substring(curSpace+3, nextSpace)+"-"+input.substring(curSpace+1,curSpace+3)+"ay ";
			}
			curSpace = nextSpace;
		}
		
		System.out.print(output);
		
		
	}
}
