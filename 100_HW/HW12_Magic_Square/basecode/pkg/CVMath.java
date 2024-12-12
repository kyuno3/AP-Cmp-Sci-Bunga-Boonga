package pkg;

public class CVMath {
	public static boolean perfectSquare(int x){
		double squareRoot = (Math.sqrt(x));
		if(squareRoot==(int)squareRoot){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean sumConsecutive(int y){
		int sum = 0;
		for (int c = 1; sum < y; c++){
			sum = sum+c;
			if (sum == y){
				return true;
			}
		}
		return false;
	}
	
	/*public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void specialSquare(int a){
		int specialCount = 0;
		for (int count = 1; specialCount < a; count++){
			if(perfectSquare(count) && sumConsecutive(count)){
				System.out.println(count);
				specialCount++;
			}
		}
		
	}
	*/
}