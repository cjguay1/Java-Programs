/**
	File name: MinMax.java
	Short description: This program will find the minimum and maximum of all the numbers you enter.
	IST 140 Assignment:  MinMax
	@author Christopher Guay
	@version 1.01 2019-11-17
	date of last revision: 
	details of the revision: none
*/

import java.util.Scanner;

public class MinMax
{
    public static void main (String[] args)
    {
        // Program description
        System.out.println("This program will find the minimum and maximum of all the numbers you enter.");
        
        // Declaration of variables
        double max, min;
        double[] array1 = new double [5];
        
        // CALLING FUNCTIONS TO PERFORM ACTION
        array1 = makeArray();
        max = findMax(array1);
        min = findMin(array1);
        
        // DISPLAYING RESULTS
        System.out.print("Out of ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(array1[i] + " ");
        }
        System.out.println("");
        System.out.println("The highest value is: " + max);
        System.out.println("And the lowest value is: " + min);
    }
    
    // GETTING VALUES TO POPULATE ARRAY
    public static double[] makeArray()
    {
        // LOCAL VARIABLE DECLARATION
        double[] array1 = new double[5];
        Scanner input = new Scanner(System.in);
        
        // GETTING INPUT
        System.out.println("Let's define those numbers now.");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Number " + (i+1) + ": ");
            array1[i] = input.nextDouble();
        }
        return array1; // RETURN POPULATED ARRAY
    }    
    
    // FINDING MINIMUM
    public static double findMin(double[] array1)
    {
        // DECLARING LOCAL VARIABLE
        double minimum;
        
        minimum = array1[0]; // SET INITIAL MINIMUM TO FIRST ARRAY ELEMENT
        for (int i = 0; i < 5; i++)
        {
            if (array1[i] < minimum) // IF CURRENT ARRAY ELEMENT IS LESS THAN CURRENT MINIMUM,
            {
                minimum = array1[i]; // RE-DEFINE MINIMUM
            }
        }
        return minimum; // RETURN SMALLEST NUMBER IN ARRAY
    }
    
    // FINDING MAXIMUM
    public static double findMax(double[] array1)
    {
        // DECLARING LOCAL VARIABLE
        double maximum;
        
        maximum = array1[0]; // SET INITIAL MAXIMUM TO FIRST ARRAY ELEMENT
        for (int i = 0; i < 5; i++)
        {
            if (array1[i] > maximum) // IF CURRENT ARRAY ELEMENT IS GREATER THAN CURRENT MAXIMUM
            {
                maximum = array1[i]; // RE-DEFINE MAXIMUM
            }
        }
        return maximum; // RETURN LARGEST NUMBER IN ARRAY
    }
}

/*
TEST RUNS
run:
This program will find the minimum and maximum of all the numbers you enter.
Let's define those numbers now.
Number 1: 0
Number 2: -1
Number 3: 45
Number 4: 23
Number 5: 12
Out of 0.0 -1.0 45.0 23.0 12.0 
The highest value is: 45.0
And the lowest value is: -1.0
BUILD SUCCESSFUL (total time: 6 seconds)

run:
This program will find the minimum and maximum of all the numbers you enter.
Let's define those numbers now.
Number 1: 45
Number 2: 678
Number 3: -12
Number 4: 132454
Number 5: 23
Out of 45.0 678.0 -12.0 132454.0 23.0 
The highest value is: 132454.0
And the lowest value is: -12.0
BUILD SUCCESSFUL (total time: 10 seconds)
*/