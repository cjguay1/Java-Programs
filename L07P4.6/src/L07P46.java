/**
	File name: L07P46.java
	Short description: This program will find the minimum of a set of user defined values
	IST 140 Assignment: L07 P4.6
	@author Christopher Guay
	@version 1.01 2019-10-11
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;
import java.util.ArrayList;

public class L07P46
{
    public static void main (String[] args)
    {
        boolean first;
        Scanner input = new Scanner(System.in); 
        int i = 0, j = 0, minimum = 900000000;
        int[] setArray = new int[10];
              
        // PROGRAM ASSIGNMENT UNCLEAR WHERE USER INPUT COMES FROM, USED USER DEFINED ARRAY OF 10 ELEMENTS
        System.out.println("This program will find the minumum of a set of values from a user defined array.");
        System.out.println("Enter positive integers to your liking:");
                
        // GETTING USER INPUT
        while (j < 10)
        {
            setArray[j] = input.nextInt();
            if ( setArray[j] < 0)
            {
                System.out.println("The array elements must be positive.");
            }
            else
            {
                j = j + 1;
            }
        }
        
// CALCULATIONS
        first = true;
        while (i < 10)// looping while next input read successfully
        {
            if (first)
            {
                minimum = setArray[i];
                first = false;
            }
            if (setArray[i] < minimum)
            {
                minimum = setArray[i];
            }
            i += 1;
        }
        
        // DISPLAYING RESULTS
        System.out.println("The minimum is " + minimum);
    }
}


/*
TEST RUNS
run:
This program will find the minumum of a set of values from a user defined array.
Enter positive integers to your liking: 
5
8
3
5
8
5
2
9
1
7
The minimum is 1
BUILD SUCCESSFUL (total time: 10 seconds)

run:
This program will find the minumum of a set of values from a user defined array.
Enter positive integers to your liking:
-1
The array elements must be positive.
9
8
7
5
4
6
7
8
9
1
The minimum is 1
BUILD SUCCESSFUL (total time: 12 seconds)
*/