package com.daiigr;
import java.io.*;
import java.util.ArrayList;

public class ScheduleHandler {
    private String FileName;

    String Output = "";
    String Day[];
    String TimedEvents[];
    String RawTimedEventData[];
    int TimedEventData[];

    public ArrayList<ArrayList<TimedEvent>> TimedEventArray;
    ArrayList<TimedEvent> Temp;


    public ScheduleHandler(String FileName) throws Exception{

        TimedEventArray = new ArrayList<ArrayList<TimedEvent>>();


        this.FileName = FileName;
        File f = new File( FileName);
        if(!f.exists()){
            f.createNewFile();
        }
        FileReader fr = new FileReader(FileName);
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
