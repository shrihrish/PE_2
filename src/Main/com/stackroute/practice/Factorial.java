package com.stackroute.practice;

public class Factorial {
    public static long longFactorial(long n)
    {
        long factorial = 1;
         int i;
        // show error if the user enters a negative integer
        if (n < 0) {
            return 0;
        }
        else
        {
            for(i=1; i<=n; ++i)
            {
                factorial *= i;              // factorial = factorial*i;
            }

        }

        return factorial;
    }
}
