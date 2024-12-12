/* 
    Lecture note example - If Statements
*/

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("You've joined an Alien Exchange program!\n"+"Pick an Alien to take in: \n" + "1. Joe, a large alien who likes eating.\n"+"2. Bob, a blue alien who loves trees.\n"+"3. Barney, a purple tailed alien who eats butterflies.");
        
        int answer1 = sc.nextInt();
        if(answer1 == 1){
            System.out.print("You picked Joe.");
            new String alien = ("Joe");
            String alien = new String("Joe");
        }
        else if(answer1 == 2){
            System.out.print("You picked Bob.");
        }
        else if(answer1 ==3{
            System.out.print("You picked Barney.");
        }
        else{
            System.out.print("You got Jerry.");
        }
        System.out.print("You meet with " + alien+ ", and you show them around the school.");
        }
	
}