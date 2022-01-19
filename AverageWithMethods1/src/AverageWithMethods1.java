/**
	File name: AverageWithMethods1.java
	Short description: 
	IST 140 Assignment:  PA=AverageWithMethods
	@author Christopher Guay
	@version 1.01 2019-10-31
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;
import java.lang.*;

public class AverageWithMethods1
{
    public static void main (String[] args)
    {
        // PROGRAM DESCRIPTION
        System.out.println("This program will find the average of between 5 and 10 numbers.");
        
        // DECLARATION OF MAIN METHOD VARIABLES
        String numbers = ""; 
        double average;
        
        // CALLING METHODS
        numbers = getNumbers();
        average = stringToAverage(numbers);
        printResults(numbers, average);
        
    }
    // METHOD FOR GETTING USER INPUT
    public static String getNumbers()
    {
        // DECLARING METHOD VARIABLES
        String numbers = "";
        int numberCount = 0;
        Scanner input = new Scanner(System.in);
        boolean check1 = true;
        
        // GETTING USER INPUT, LOOPING UNTIL PROPER INPUT RECIEVED
        System.out.println("On the next line, type 5-10 numbers separated by spaces.");
        while (check1)
        {
            numbers = input.nextLine();
            if (Character.isDigit(numbers.charAt(numbers.length()-1))) // IF NO SPACE AFTER LAST NUMBER, APPEND SPACE TO STRING. NEEDED FOR NEXT LOOP
            {
                numbers += " ";
            }
            
            // LOOP FOR COUNTING NUMBERS IN STRING
            for (int i = 0; i < numbers.length(); ++i)
            {
                if (numbers.charAt(i) == ' ') // IF SPACE, ANOTHER NUMBER READ
                {
                    numberCount +=1;
                }
            }
            
            if (numberCount < 5 || numberCount > 10) // FILTERING INPUT. NEED BETWEEN 5 AND 10 NUMBERS IN STRING TO PROCEED
            {
                System.out.println("You must have between 5 and 10 numbers. Try again.");
                numberCount = 0;
            }
            else
            {
                check1 = false;
            }
        }
        return numbers;
    }
    
    // CONVERTING STRING OF NUMBERS TO INTEGERS IN ARRAY
    public static double stringToAverage(String numbers)
    {
        // DECLARING METHOD VARIABLES
        double average = 0, total = 0;
        int numberCount = 0, j = 0;
        int[] numArray;
        String tempnum = "";
            
        // FINDING HOW MANY NUMBERS IN STRING
        // WOULD BE MOST INTELLIGENT TO PASS THIS AS AN ARGUMENT, BUT NOT ALLOWED AS PER PROBLEM DEFINITION
        for (int i = 0; i < numbers.length(); ++i)
        {
            if (numbers.charAt(i) == ' ') // IF SPACE FOUND, NUMBER HAS ENDED
            {
                numberCount +=1;
            }
        }

        numArray = new int[numberCount]; // DECLARE ARRAY LENGTH
        
        // LOOP FOR DEFINING ARRAY ELEMENTS
        while (j < numberCount)
        {
            for (int i = 0; i < numbers.length(); ++i)
            {
                // IF SPACE BETWEEN DIGITS IN STRING FOUND, ADVANCE ARRAY ELEMENT
                if (Character.isDigit(numbers.charAt(i)))
                {
                    tempnum = tempnum + Character.toString(numbers.charAt(i)); // PARSE NUMBER FROM STRING, APPEND WHILE ELEMENTS OF STRING STILL DIGITS
                }
                else // IF SPACE FOUND WITHIN STRING
                {
                    numArray[j] = Integer.valueOf(tempnum);
                    j += 1; // ADVANCE ARRAY ELEMENT
                    tempnum = ""; // RESET tempnum FOR NEXT NUMBER IN STRING
                }
            }
        }
        
        // FOR LOOP FOR CALCULATING AVERAGE OF ALL ARRAY ELEMENTS IN NUMARRAY AND RETURNING THE RESULT
        for (int i = 0; i < j; i++)
        {
            total = total + numArray[i];
        }
        average = total/numberCount;
        
        return average;
    }
    
    // METHOD FOR DISPLAYING RESULTS
    public static void printResults(String numbers, double average)
    {
        // FORMATTING AND DISPLAYING RESULTS
        String averageS = String.format("%.2f",average);
        System.out.println("The average of the numbers " + numbers + "is " + averageS);
    }
}

/*
run:
This program will find the average of between 5 and 10 numbers.
On the next line, type 5-10 numbers separated by spaces.
1 2 3 4 
You must have between 5 and 10 numbers. Try again.
1 2 3 4 5 6 7 8 9 10 11 
You must have between 5 and 10 numbers. Try again.
1 2 3 4 5 6 7 
The average of the numbers 1 2 3 4 5 6 7 is 4.00
BUILD SUCCESSFUL (total time: 21 seconds)

run:
This program will find the average of between 5 and 10 numbers.
On the next line, type 5-10 numbers separated by spaces.
23 45 765 23 87 56 78
The average of the numbers 23 45 765 23 87 56 78 is 153.86
BUILD SUCCESSFUL (total time: 8 seconds)
*/