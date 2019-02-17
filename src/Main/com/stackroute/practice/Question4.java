package com.stackroute.practice;

import java.io.*;

public class Question4 {

     String getUpperCase(String inputFilepath) throws IOException {
         if(inputFilepath.equals(""))
         {
             return null;
         }
         File file = new File(inputFilepath);

         BufferedReader br = new BufferedReader(new FileReader(file));

         String s="";
         String st;
         while ((st = br.readLine()) != null){
             s+=st;
     }
         s=s.toLowerCase();

     return s;
    }
}
