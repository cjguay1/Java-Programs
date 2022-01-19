/**
	File name: Rooter.java
	Short description: This program will display the square root of every integer below a defined value
	IST 140 Assignment: Rooter
	@author Christopher Guay
	@version 1.01 2019-10-18
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;
import java.lang.*;

public class Rooter
{
    public static void main (String[] args)
    {
        // program description
        System.out.println("This program will display the square root of every integer");
        System.out.println("from an integer of your definition to 0");
        
        // declaring variables
        boolean check1 = true;
        int start = 0;
        double root;
        String rootS;
        Scanner input = new Scanner(System.in);
        
        // error checking and getting appropriate input
        while (check1)
        {
            System.out.print("Enter an positive integer upper bound: ");
            start = input.nextInt();
            if (start < 1)
            {
                System.out.println("You must enter a positive integer. Try again.");
            } else
            {
                check1 = false;
            }
        }
        
        // calculations and displaying output
        for (int i = start; i > 0; --i)
        {
            root = Math.sqrt(i);
            rootS = String.format("%.4f",root); // formatting square root to 4 decimal places
            System.out.println("The square root of " + i + " is: " + rootS + ".");
        }
    }
}

/*
TEST RUNS:
run:
This program will display the square root of every integer
from an integer of your definition to 0
Enter an positive integer upper bound: -1
You must enter a positive integer. Try again.
Enter an positive integer upper bound: 0
You must enter a positive integer. Try again.
Enter an positive integer upper bound: 5
The square root of 5 is: 2.2361.
The square root of 4 is: 2.0000.
The square root of 3 is: 1.7321.
The square root of 2 is: 1.4142.
The square root of 1 is: 1.0000.
BUILD SUCCESSFUL (total time: 8 seconds)

run:
This program will display the square root of every integer
from an integer of your definition to 0
Enter an positive integer upper bound: 50
The square root of 50 is: 7.0711.
The square root of 49 is: 7.0000.
The square root of 48 is: 6.9282.
The square root of 47 is: 6.8557.
The square root of 46 is: 6.7823.
The square root of 45 is: 6.7082.
The square root of 44 is: 6.6332.
The square root of 43 is: 6.5574.
The square root of 42 is: 6.4807.
The square root of 41 is: 6.4031.
The square root of 40 is: 6.3246.
The square root of 39 is: 6.2450.
The square root of 38 is: 6.1644.
The square root of 37 is: 6.0828.
The square root of 36 is: 6.0000.
The square root of 35 is: 5.9161.
The square root of 34 is: 5.8310.
The square root of 33 is: 5.7446.
The square root of 32 is: 5.6569.
The square root of 31 is: 5.5678.
The square root of 30 is: 5.4772.
The square root of 29 is: 5.3852.
The square root of 28 is: 5.2915.
The square root of 27 is: 5.1962.
The square root of 26 is: 5.0990.
The square root of 25 is: 5.0000.
The square root of 24 is: 4.8990.
The square root of 23 is: 4.7958.
The square root of 22 is: 4.6904.
The square root of 21 is: 4.5826.
The square root of 20 is: 4.4721.
The square root of 19 is: 4.3589.
The square root of 18 is: 4.2426.
The square root of 17 is: 4.1231.
The square root of 16 is: 4.0000.
The square root of 15 is: 3.8730.
The square root of 14 is: 3.7417.
The square root of 13 is: 3.6056.
The square root of 12 is: 3.4641.
The square root of 11 is: 3.3166.
The square root of 10 is: 3.1623.
The square root of 9 is: 3.0000.
The square root of 8 is: 2.8284.
The square root of 7 is: 2.6458.
The square root of 6 is: 2.4495.
The square root of 5 is: 2.2361.
The square root of 4 is: 2.0000.
The square root of 3 is: 1.7321.
The square root of 2 is: 1.4142.
The square root of 1 is: 1.0000.
BUILD SUCCESSFUL (total time: 4 seconds)
*/