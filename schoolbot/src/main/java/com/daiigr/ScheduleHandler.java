package com.daiigr;
import java.io.*;

public class ScheduleHandler {
    String fileString = "timedevents.schedule";
    String Output = "";

    public ScheduleHandler() throws IOException{
        
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
        Output = Output.replace("\r\n", "").replace("\n", "");
        System.out.println(Output);
    }
    

   
    
}
