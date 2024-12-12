package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String n, double r, int a, int b){
        movieName = n;
        rating = r;
        numRatings = a;
        revenue = b;
    }
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double addRating(double r){
        rating = (rating*numRatings+r)/(numRatings+1);
        numRatings++;
        return rating;
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie mB){
        if (mB.getRating() > rating){
            return false;
        }
        else{
            return true;
        }
    }
    public String revenueToString(){
        int A = revenue/1000000;
        int tempRevA = revenue-(A*1000000);
        int B = tempRevA/1000;
        int tempRevB =tempRevA-(B*1000);
        int C = tempRevB;
        return A + "," + B + "," + C;
    }
    public void pirateMovie(){
        
    }
}
