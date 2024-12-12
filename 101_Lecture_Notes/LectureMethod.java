/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        
        greeting("Spike");
        greeting("Mortis");
        raise (2000000, 5);
	}
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	
	public static void greeting(String name){
	   System.out.println("Hello " + name);
	}
	
	public static void printAnimal(){
	    System.out.println("(o_ \n//\\ \nV_/_\n");
	}
}