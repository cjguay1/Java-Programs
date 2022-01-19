/*
 *  File Name: StringLength.java
 *  Short description: This program finds and prints the length of a string variable.
 *  IST 140 Assignment:  PA StrintLength
 *  Author: Christopher Guay
 *  Date of last revision: 9/20/2019
 *  Revision Details: 
 */
package stringlength;
import java.util.Scanner;
import java.lang.*;

/**
 * @author Christopher Guay
 */
public class StringLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROGRAM DESCRIPTION
        System.out.println("This program will find and print the length of a string");
        System.out.println("on a single line, defined by you.");
        
        // DECLARATION OF VARIABLES
        String userInput;
        int length;
        Scanner input = new Scanner(System.in);
        
        // GETTING USER INPUT
        System.out.print("Type some words for the string: ");
        userInput = input.nextLine();
        
        // CALCULATIONS
        length = userInput.length();
        
        // PRINTING RESULTS
        System.out.println("Your string is " + length + " characters long.");
    }
}

/*
run:
This program will find and print the length of a string
on a single line, defined by you.
Type some words for the string: this is a string
Your string is 16 characters long.
BUILD SUCCESSFUL (total time: 6 seconds)

run:
This program will find and print the length of a string
on a single line, defined by you.
Type some words for the string: this is a much longer string
Your string is 28 characters long.
BUILD SUCCESSFUL (total time: 7 seconds)

run:
This program will find and print the length of a string
on a single line, defined by you.
Type some words for the string: short one
Your string is 9 characters long.
BUILD SUCCESSFUL (total time: 3 seconds)
*/
