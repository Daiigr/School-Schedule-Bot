package com.daiigr;

public class TimedEvent {
    private int ID;
    private int Hour;
    private int Minute;


    public TimedEvent(){
        ID = 0;
        Hour = 0;
        Minute = 0;

    }

    public TimedEvent(int ID, int Hour,int Minute){
        this.ID = ID;
        this.Hour = Hour; 
        this.Minute = Minute;

    }
    public int getMinute() {
        return Minute;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    public int getHour() {
        return Hour;
    }
    public void setHour(int hour) {
        this.Hour = hour;
    }
    public void setMinute(int minute) {
        this.Minute = minute;
    }


    
}
