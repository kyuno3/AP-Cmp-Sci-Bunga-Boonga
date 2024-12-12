import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
        /* implementation not shown */
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        average = ((count*average)+newVal)/(count+1);
        count++;
        /* to be implemented in part (a) */
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        if (num>0){
            int c = 0;
            int r = 0;
            while(c<num){
                double newRate = RunningAverage.getNewRating();
                if (newRate >= 0){
                    RunningAverage.updateAverage(newRate);
                }
                else {
                    r++;
                }
                c++
            }
        }
        return r;
        /* to be implemented in part (b) */
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        /* implementation not shown */
    }
}
