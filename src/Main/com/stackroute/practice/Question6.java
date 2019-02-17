package com.stackroute.practice;

public class Question6 {

    public int average(int a[])
    {
        int sum=0;
        for(int i = 0; i < a.length ; i++)
        {
            sum = sum + a[i];
        }
          int average = sum / a.length;
        return average;
    }
    public int lowest(int inputArray[])
    {
        int minValue = inputArray[0];
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    public int highest(int inputArray[])
    {
        int maxValue = inputArray[0];
        for(int i=0;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
}
