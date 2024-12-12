import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		for(int c=0; c<passwords.length; c++){
		    boolean level1 = false;
	    	boolean level2 = false;
	    	boolean level3 = false;
		    if(passwords[c].length()>8){
		        level1 = true;
		    }
		    if(passwords[c].contains("!")||passwords[c].contains("@")||passwords[c].contains("#")||passwords[c].contains("$")||passwords[c].contains("%")||passwords[c].contains("^")||passwords[c].contains("&")||passwords[c].contains("*")){
		        level2 = true;
		    }
		    if(level1&&level2){
		        level3 = true;
		        num3++;
		    }
		    else if(level1){
		        num1++;
		    }
		    else if(level2){
		        num2++;
		    }
		}
		System.out.println("L1: "+ num1);
		System.out.println("L2: "+ num2);
		System.out.println("L3: "+ num3);
		
		
/*		System.out.println(passwords[14489]);
        if(passwords[14489].length()>8){
            level1 = true;
        }
        if(level1){
            System.out.print("test");
        }
        if(passwords[14489].contains("!")||passwords[14489].contains("@")||passwords[14489].contains("#")||passwords[14489].contains("$")||passwords[14489].contains("%")||passwords[14489].contains("^")||passwords[14489].contains("&")||passwords[14489].contains("*")){
            level2 = true;
        }
        if(level2){
            System.out.print("test");
        }
        
	*/	
	}
}
