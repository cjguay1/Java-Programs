/**
	File name: RecursiveTriangle.java
	Short description: This program will print an upside-down right triangle
	IST 140 Assignment:  PA-RecursiveTriangle
	@author Christopher Guay
	@version 1.01 2019-11-7
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;
import java.lang.*;

public class RecursiveTriangle
{
    public static void main (String[] args)
    {
        // Program description
        System.out.println("This program will print an upside-down right triangle using");
        System.out.println("a string of your specification, and will be of side length 1-10.");
        
        // DECLARATION OF MAIN VARIABLES
        int side;
        String userS;
        
        // CALLING FUNCTIONS 
        side = getInt();
        userS = getString();
        printTriangle(side, userS);
        
    }
    
    // GETTING TRIANGLE SIDE LENGTH
    public static int getInt()
    {
        int side = 0;
        boolean check1 = true;
        Scanner input = new Scanner(System.in);
        
        // INPUT FILTERING, GETTING ACCEPTABLE VALUES
        System.out.print("Number of lines for triangle: ");
        while (check1)
        {
            side = input.nextInt();
            if (side > 10 || side < 1)
            {
                System.out.println("There must be between 1 and 10 lines inclusive.");
            }
            else
            {
                check1 = false;
            }
        }
        return side;
    }
    
    // GETTING STRING TO POPULATE TRIANGLE BODY
    public static String getString()
    {
        String userS = "";
        Scanner inputS = new Scanner(System.in);
        
        // ACTUAL INPUT LINE. NO FILTERING NECESSARY
        System.out.print("String for triangle population: ");
        
        userS = inputS.nextLine();

        return userS;
    }
    
    // PRINTING RESULTS
    public static void printTriangle(int side, String userS)
    {
        int j;
        for (j = side; j > 0; j--) // FOR LOOP FOR ROWS
        {
            for (int i = j; i > 0; i--) // FOR LOOP FOR COLUMNS
            {
                System.out.print(userS);
                if (i == 1)
                {
                    System.out.println(); // LINE BREAK AFTER LINE END
                }
            }
        }
    }
}

/*
TEST RUNS:
run:
This program will print an upside-down right triangle using
a string of your specification, and will be of side length 1-10.
Number of lines for triangle: 5
String for triangle population: []
[][][][][]
[][][][]
[][][]
[][]
[]

run:
This program will print an upside-down right triangle using
a string of your specification, and will be of side length 1-10.
Number of lines for triangle: 0
There must be between 1 and 10 lines inclusive.
11
There must be between 1 and 10 lines inclusive.
10
String for triangle population: BIGTRI
BIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRI
BIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRI
BIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRI
BIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRI
BIGTRIBIGTRIBIGTRIBIGTRIBIGTRIBIGTRI
BIGTRIBIGTRIBIGTRIBIGTRIBIGTRI
BIGTRIBIGTRIBIGTRIBIGTRI
BIGTRIBIGTRIBIGTRI
BIGTRIBIGTRI
BIGTRI
*/

