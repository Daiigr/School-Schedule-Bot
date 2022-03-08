package com.daiigr;

import java.util.ArrayList;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
           private static JDA jda;
           static ArrayList<ArrayList<TimedEvent>> TimedEventList;
           private int i;
           private int j;


        public static void main(String[] args) throws Exception{
               Config config = new Config("bot.properties");
          // setJda(JDABuilder.createDefault(config.getToken()).build());
            ScheduleHandler sh = new ScheduleHandler("timedevents.schedule", "EventData.data");


            
           
           TimedEventList = sh.TimedEventArray;
    
            for(int i = 0; i < TimedEventList.size(); i++ ){
                
                for(int j = 0; j < TimedEventList.get(i).size(); j++){


                    System.out.println("Array: " + i + " ID: " + 
                    TimedEventList.get(i).get(j).getID() + " Time: " +
                    TimedEventList.get(i).get(j).getHour() + ":" +
                    TimedEventList.get(i).get(j).getMinute());
                  
                }
              
                

            }

       
    }

        

        public static JDA getJda() {
            return jda;
        }

        public static void setJda(JDA jda) {
            Main.jda = jda;
        }
}
