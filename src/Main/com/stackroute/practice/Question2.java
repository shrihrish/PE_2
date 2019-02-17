package com.stackroute.practice;

public class Question2 {
    public  boolean isPower(int num)
    {

        int base = 2, exponent = 4;

        int result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        if(num==result)
        {
            return true;
        }
        return false;

    }
}
