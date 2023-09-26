package baitap.bt3;

import java.util.Scanner;

public class StopWatch {
    private long startTime ;
    private long endTime ;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }


    public long getStartTime() {
        return startTime;
    }


    public long getEndTime() {
        return endTime;
    }


    public void start() {
        this.startTime = System.currentTimeMillis();
        System.out.println("START_TIME ----> " + startTime);
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
        System.out.println("END_TIME ----->" + endTime);
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime ;
    } ;

}
