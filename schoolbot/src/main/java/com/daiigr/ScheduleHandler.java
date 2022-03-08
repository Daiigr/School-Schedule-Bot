package com.daiigr;
import java.io.*;
import java.util.ArrayList;

public class ScheduleHandler {
    private String FileNameTimedEvent;
    private String FileNameEventData;

    String Output = "";
    String Day[];
    String TimedEvents[];
    String RawTimedEventData[];
    int TimedEventData[];

    public ArrayList<ArrayList<TimedEvent>> TimedEventArray;
    public ArrayList<ArrayList<EventData>> EventDataArray;
    ArrayList<Object> Temp;

 //


    public ScheduleHandler(String FileNameTimedEvent, String FileNameEventData) throws Exception{

        this.FileNameTimedEvent = FileNameTimedEvent;
        this.FileNameEventData = FileNameEventData;

        TimedEventArray = new ArrayList<ArrayList<TimedEvent>>();

        File f = new File( FileNameTimedEvent);
        if(!f.exists()){
            f.createNewFile();
        }
        FileReader fr = new FileReader(FileNameTimedEvent);
        int i;    
        while((i=fr.read())!=-1){
            Output += (char)i;  
        }
        fr.close();

        Output = Output.replace("\r\n", "").replace("\n", "");

        //splits string into a array splitting from & representing individual timedEvent Arrays
        Day = Output.split("&");

        for(int j = 0; j < Day.length; j++ ){

                    //splits string into a array splitting from % representing individual timedEvents

            TimedEvents = Day[j].split("%");
            Temp = new ArrayList<TimedEvent>();

            for(int x = 1; x < TimedEvents.length; x++){

                

                //splits string into a array splitting from : representing individual elements of timedEvents
                RawTimedEventData = TimedEvents[x].split(":");

                TimedEventData = new int[RawTimedEventData.length];

                for(int p = 0; p < RawTimedEventData.length; p++){

                    TimedEventData[p] = Integer.parseInt(RawTimedEventData[p]);
                
                }
               Temp.add(new TimedEvent(TimedEventData[0], TimedEventData[1], TimedEventData[2]));
               
            
               //  System.out.println("Set: "+ j + " ID: " + RawTimedEventData[0] + " Hour: " + RawTimedEventData[1] + " minute: "  + RawTimedEventData[2]);

            }

            TimedEventArray.add(Temp);


        }




  
    }

    



    

   
    
}
