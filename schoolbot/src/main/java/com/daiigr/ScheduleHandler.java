package com.daiigr;
import java.io.*;

public class ScheduleHandler {
    String fileString = "timedevents.schedule";

    public ScheduleHandler() throws IOException{
        
        File f = new File( fileString);
        if(!f.exists()){
            f.createNewFile();
        }

        FileReader fr = new FileReader(fileString);
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
        

    }

   
    
}
