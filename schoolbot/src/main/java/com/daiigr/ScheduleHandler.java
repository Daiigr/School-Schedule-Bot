package com.daiigr;
import java.io.*;
import java.util.ArrayList;

public class ScheduleHandler {
    String fileString = "timedevents.schedule";
    String Output = "";
    String Day[];
    String TimedEvents[];
    String RawTimedEventData[];
    int TimedEventData[];

    ArrayList<TimedEvent> Temp;
    ArrayList<ArrayList<TimedEvent>> TimedEventList;
    
    

    public ScheduleHandler() throws IOException{

        TimedEventList = new ArrayList<ArrayList<TimedEvent>>();
        
        File f = new File( fileString);
        if(!f.exists()){
            f.createNewFile();
        }

        FileReader fr = new FileReader(fileString);
        int i;    
        while((i=fr.read())!=-1){
            Output += (char)i;  
        }
        fr.close();

        //removes all line breaks
        Output = Output.replace("\r\n", "").replace("\n", "");
        //splits string into a array splitting from & representing individual timedEvent Arrays
        Day = Output.split("&");

        for(int j = 0; j < Day.length; j++ ){
                    //splits string into a array splitting from % representing individual timedEvents

            TimedEvents = Day[j].split("%");

            for(int x = 1; x < TimedEvents.length; x++){

                //splits string into a array splitting from : representing individual elements of timedEvents
                RawTimedEventData = TimedEvents[x].split(":");

                TimedEventData = new int[RawTimedEventData.length];

                for(int p = 0; p < RawTimedEventData.length; p++){
                    //TimedEventData[p] = Integer.parseInt(RawTimedEventData[p]);
                
                }
                System.out.println("Set: "+ j + " ID: " + RawTimedEventData[0] + " Hour: " + RawTimedEventData[1] + " minute: "  + RawTimedEventData[2]);
                Temp = new ArrayList<TimedEvent>();
               Temp.add(new TimedEvent(TimedEventData[0],TimedEventData[1],TimedEventData[2]));

            }

            TimedEventList.add(Temp);

        }

    
    }
    

   
    
}
