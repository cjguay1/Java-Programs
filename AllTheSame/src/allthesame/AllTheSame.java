/*
 *  File Name: AllTheSame.java
 *  Short description: This program will determine if three numbers are identical, all different or neither
 *  IST 140 Assignment:  L04: P3.4
 *  Author: Christopher Guay
 *  Date of last revision: 9/20/2019
 *  Revision Details: 
 */
package allthesame;

import java.util.Scanner;

/**
 * @author Christopher Guay
 */
public class AllTheSame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROGRAM DESCRIPTION
        System.out.println("The purpose of this program is to compare three numbers,");
        System.out.print("and deterine if they are the same, different, or neither.");
        
        // DECLARE VARIABLES
        int i1, i2, i3;
        Scanner input = new Scanner(System.in);
        
        // GETTING USER INPUT
        System.out.print("\nPlease enter your first number: ");
        i1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        i2 = input.nextInt();
        System.out.print("Please enter your third number: ");
        i3 = input.nextInt();

        // CALCULATIONS + PRINTING RESULTS
        if (i1 != i2 && i3 != i1)
        {
            System.out.println("All your numbers are different!");
        } else if ( i1 == i2 && i3 == i1)
        {
            System.out.println("All your numbers are the same!");
        }else 
        {
            System.out.println("Your numbers are neither all the same nor all different.");
        }
    }
}

/*
TEST RUNS:
run:
The purpose of this program is to compare three numbers,
and deterine if they are the same, different, or neither.
Please enter your first number: 4
Please enter your second number: 5
Please enter your third number: 6
All your numbers are different!
BUILD SUCCESSFUL (total time: 5 seconds)

run:
The purpose of this program is to compare three numbers,
and deterine if they are the same, different, or neither.
Please enter your first number: 5
Please enter your second number: 5
Please enter your third number: 5
All your numbers are the same!
BUILD SUCCESSFUL (total time: 4 seconds)

run:
The purpose of this program is to compare three numbers,
and deterine if they are the same, different, or neither.
Please enter your first number: 3
Please enter your second number: 3
Please enter your third number: 4
Your numbers are neither all the same nor all different.
BUILD SUCCESSFUL (total time: 4 seconds)
*/
