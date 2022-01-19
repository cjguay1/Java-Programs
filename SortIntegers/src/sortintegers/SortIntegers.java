/*
 *  File Name: SortIntegers.java
 *  Short description: This program sorts 3 user defined integers
 *  IST 140 Assignment: L04-SortIntegers 
 *  Author: Christopher Guay
 *  Date of last revision: 9/20/2019
 *  Revision Details: 
 */
package sortintegers;

import java.util.Scanner;

/**
 * @author Christopher Guay
 */
public class SortIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PROGRAM DESCRIPTION
        System.out.println("This program will sort any three integers you enter!");
       
        // DECLARATION OF VARIABLES
        int i1=0, i2=0, i3=0, same = 0, smallest=0, middle=0, biggest=0;
        Scanner input = new Scanner(System.in);
        
        // GETTING INPUT
        System.out.print("\nFirst integer: ");
        i1=input.nextInt();
        System.out.print("\nSecond integer: ");
        i2=input.nextInt();
        System.out.print("\nThird integer: ");
        i3=input.nextInt();
        
        // CALCULATION + PRINTING RESULTS
        if (i2 < i3 && i3 > i1) // testing if i3 is maximum
        {
            if (i1 < i2) // testing which of next two numbers is bigger
            {
                biggest = i3;
                middle = i2;
                smallest = i1;
            } 
            else if (i1 > i2)
            {
                biggest = i3;
                middle = i1;
                smallest = i2;
            } else
            {
                System.out.println("Two of your numbers are the same!"); // error message if two numbers are identical
                same = 1;
            }
        } else if (i1 < i2 && i2 > i3) // testing if i2 is maximum
        {
            if (i3 > i1) // testing which of next two numbers is bigger
            {
                biggest = i2;
                middle = i3;
                smallest = i1;
            }
            else if (i3 < i1)
            {
                biggest = i2;
                middle = i1;
                smallest = i3;
            } else
            {
                System.out.println("Two of your numbers are the same!"); // error message if two numbers are identical
                same = 1;
            }
        } else if (i2 < i1 && i1 > i3) // testing if i1 is maximum
        {
            if (i2 > i3)
            {
                biggest = i1;
                middle = i2;
                smallest = i3;
            } 
            else if (i2 < i3)
            {
                biggest = i1;
                middle = i3;
                smallest = i2;
            } else
            {
                System.out.println("Two of your numbers are the same!"); // error message if two numbers are identical
                same = 1;
            }
        } else
        {
            System.out.println("All your numbers are the same!"); // message if all numbers entered are the same
        }
        // DISPLAYING RESULTS
        if (same == 0)
        {
         System.out.println("Your numbers in order are: " + smallest + " " + middle + " " + biggest);
        } else
        {
            System.out.println("Please re-run the program and try again.");
        }
    }
    
}

/*
TEST RUNS:
run:
This program will sort any three integers you enter!

First integer: 4

Second integer: 7

Third integer: 18
Your numbers in order are: 4 7 18
BUILD SUCCESSFUL (total time: 6 seconds)

run:
This program will sort any three integers you enter!

First integer: 56

Second integer: 23

Third integer: 69
Your numbers in order are: 23 56 69
BUILD SUCCESSFUL (total time: 6 seconds)

run:
This program will sort any three integers you enter!

First integer: 4

Second integer: 4

Third integer: 9
Two of your numbers are the same!
Please re-run the program and try again.
BUILD SUCCESSFUL (total time: 5 seconds)

run:
This program will sort any three integers you enter!

First integer: 5

Second integer: 5

Third integer: 5
All your numbers are the same!
Your numbers in order are: 0 0 0
BUILD SUCCESSFUL (total time: 4 seconds)
*/
