public class StepTracker{
    int steps;
    int numActive;
    double average;
    int reqSteps;
    int days;
    
    public StepTracker(int r){
        steps = 0;
        numActive = 0;
        average=0;
        required = r;
        days = 0;
    }
    
    public int activeDays(){
        return numActive;
    }
    public double averageSteps(){
        average = ((average*days)+steps)/(days);
        return average;
    }
    public void addDailySteps(int s){
        steps = s;
        if (steps>required){
            numActive++;
        }
        days++;
        StepTracker.averageSteps();
    }
    
}