/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here
        int [] arr = {5, 8, 7, 8, 4, 2, 9, 1};
        
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int x = 8;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==x){
                System.out.println(arr[i]);
            }
        }
        
        for (int = 0; i < arr.length; i++){
            if (arr[i]==arr[i+1]){
                System.out.println("Consect at " + i + " and " + (i+1));
            }
        }
	}
}