package com.stackroute.practice;

public class Question1 {
    public boolean checkPalindrome(String s)
    {
        String original=s, reverse = ""; // Objects of String class

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
             return true;
        else
             return false;
    }
    }

