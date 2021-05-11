package StopWatch;

public class StopWatch {
    private float startTime;
    private float endTime;
    private float getStartTime(){
        return startTime;
    }
    private float getEndTime(){
        return endTime;
    }
    private void start(){
        System.nanoTime();
    }
    private void end(){
        System.nanoTime();
    }
}
