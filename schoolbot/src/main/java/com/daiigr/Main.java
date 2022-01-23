package com.daiigr;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
           private static JDA jda;

        public static void main(String[] args) throws Exception{
               Config config = new Config("bot.properties");
            setJda(JDABuilder.createDefault(config.getToken()).build());

       
    }

        public static JDA getJda() {
            return jda;
        }

        public static void setJda(JDA jda) {
            Main.jda = jda;
        }
}
