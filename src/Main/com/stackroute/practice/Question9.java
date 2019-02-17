package com.stackroute.practice;


import java.io.*;

public class Question9 {

    int checkWordFrequency(String inputPath) throws IOException {
        File file = new File(inputPath);
        int countWord=0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null){
            if(!(st.equals("")))
            {


                // \\s+ is the space delimiter in java
                String[] wordList = st.split("\\s+");
                countWord += wordList.length;
                // [!?.:]+ is the sentence delimiter in java

            }
        }

        return countWord;
    }
}
