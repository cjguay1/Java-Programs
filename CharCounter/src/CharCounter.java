/**
	File name: CharCounter.java
	Short description: This program counts how many occurrences of a character are in a string
	IST 140 Assignment:  EPA CharCounter
	@author Christopher Guay
	@version 1.01 2019-10-11
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;
import java.lang.*;

public class CharCounter
{
    public static void main (String[] args)
    {
        // Program description
        System.out.println("This program will take any number of words of your choosing,");
        System.out.println("and tell you how many times a specific character is present in them.");
        
        // declaring variables, initializing where necessary
        Scanner input = new Scanner(System.in);
        String inputEntry, inputCharacter;
        char inputChar;
        boolean charcheck = false;
        int charcount = 0, i = 0;
        
        // getting input from user
        System.out.println("On the next line, enter whatever you like.");
        inputEntry = input.nextLine();
        
        // getting filtered input from user
        while(!charcheck)
        {
            System.out.print("Character to check for: ");
            inputCharacter = input.nextLine();
            if (inputCharacter.length() > 1) // error checking
            {
                System.out.println("You must enter only one character.");
            }
            else
            {
                charcheck = true;
            }
        }
        inputChar = inputCharacter.charAt(0); // converting from string to char
        // could have used char variable type to start, but would have crashed program if string was given instead of char
        
        while (inputEntry.length() > i) // checking element by element with WHILE loop
        {
            if (inputEntry.charAt(i)==(inputChar))
            {
                charcount +=1;
            }
            i +=1;
        }
        
        // displaying results
        System.out.println("\nThere is " + charcount + " occurrence(s) of '" + inputChar + " in '" + inputEntry + "'.");
        
    }
}

/*
TEST RUNS
run:
This program will take any number of words of your choosing,
and tell you how many times a specific character is present in them.
On the next line, enter whatever you like.
TEst
Character to check for: e

There is 0 occurrence(s) of 'e in 'TEst'.
BUILD SUCCESSFUL (total time: 4 seconds)

run:
This program will take any number of words of your choosing,
and tell you how many times a specific character is present in them.
On the next line, enter whatever you like.
Testing
Character to check for: G

There is 0 occurrence(s) of 'G in 'Testing'.
BUILD SUCCESSFUL (total time: 5 seconds)

run:
This program will take any number of words of your choosing,
and tell you how many times a specific character is present in them.
On the next line, enter whatever you like.
This Program is working!
Character to check for: ew
You must enter only one character.
Character to check for: i

There is 3 occurrence(s) of 'i in 'This Program is working!'.
BUILD SUCCESSFUL (total time: 28 seconds)

*/