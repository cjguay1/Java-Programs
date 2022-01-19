/**
	File name: WeightedAveDropSmallest.java
	Short description: This program will calculate a weighted average of 5-10 numbers.
	IST 140 Assignment:  PA- WeightedAvgDropSmallest
	@author Christopher Guay
	@version 1.01 2019-12-8
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;
import java.util.List; // Needed this one to use Arrays.asList() method in solution
import java.util.ArrayList;
import java.util.Arrays; // Needed this one to use Arrays.asList() method in solution
import java.util.Collections; // for sorting arraylist

public class WeightedAveDropSmallest
{
    public static void main (String[] args) // main method, all function calls here
    {
        // program description
        System.out.println("This program will calculate a weighted average of 5-10 numbers.");
        
        // main method variables
        List<Double> scores = new ArrayList<Double>();
        double weight, weightedAvg; 
        int lowCount;
        
        // calling all functions
        scores = getNumbers();
        lowCount = getNumberLowest();
        weight = getWeight();
        weightedAvg = calcWeightedAvg(scores, lowCount, weight);
        displayResults(scores, lowCount, weight, weightedAvg);
    }
    
    public static List<Double> getNumbers() // gets input from user, populates list of scores // WORKS
    {
        // local variable declaration
        List<String> scoreListString = new ArrayList<String>(); // needed two arrayLists to convert from string to double
        List<Double> scores = new ArrayList<Double>();
        String scoreString = "";
        Scanner input = new Scanner(System.in);
        Boolean check1 = true;
        double temp; // temporary place for moving numbers from string list to double list
        
        // getting user input
        System.out.println("\nType 5-10 numbers, each separated by a single space on the next line, and hit enter.");
        while(check1) // while loop checking for proper input, need list of 5-10 numbers
        {
            scoreString = input.nextLine();
            scoreListString =  Arrays.asList(scoreString.split(" ")); // splitting input string into string wrapper list

            for (String s : scoreListString) // converting string wrapper to double
            {
               temp = Double.valueOf(s);
               scores.add(temp);
            }
            
            if (scores.size() > 10 || scores.size() < 5) // checking if length of list of doubles is acceptable
            {
                System.out.println("You must enter 5-10 numbers, each separated by a single space.");
                scores.clear(); // if improper input found, must remove previous elements/input and start over
                scoreString = ""; // see ^
            }
            else // accept input, set check flag to false, move on to rest of program
            {
                check1 = false;
            }
        }
        
        Collections.sort(scores); // sorts list of numbers into ascending order
        
        return scores;
    }
    
    public static int getNumberLowest() // gets amount of lowest numbers to remove from list // SHOULD WORK
    {
        int lowCount = 0;
        Scanner input = new Scanner(System.in);
        Boolean check1 = true;
        
        System.out.print("Number of smallest values to drop from list of numbers: ");
        while(check1)
        {
            lowCount = input.nextInt();
            if(lowCount < 0 || lowCount > 4)
            {
                System.out.println("You can only drop 0-4 numbers, no more or less.");
                System.out.print("Number of values to drop: ");
            }
            else
            {
                check1 = false;
            }
        }
        
        return lowCount;
    }
    
    public static double getWeight() // gets weight for averaging from user // SHOULD WORK
    {
        // local variable declaration
        double weight = 1;
        Scanner input = new Scanner(System.in);
        Boolean check1 = true;
        
        // getting user input
        System.out.print("Enter the weight percentage you'll use for calculating the average: ");
        while(check1) // looping while trying to get acceptable input
        {
            weight = input.nextDouble();
            if(weight < 0) // negative values unacceptable
            {
                System.out.println("You cannot weight these values negatively.");
                System.out.print("Weighting for average: ");
            }
            else
            {
                check1 = false;
            }
        }
        weight = weight / 100; // convert from percentage to scalar 
        
        return weight;
    }
            
    public static double calcWeightedAvg(List<Double> scores, int lowCount, double weight) // calculates weighted average // SHOULD WORK
    {
        // local variable declaration
        double weightedAvg = 0;
        int size = 0;
        double total = 0;
        
        size = scores.size(); // get size once, so don't have to do so again
        
        // looping through list
        for (int i = 0; i < size; i++)
        {
            if (i < (lowCount)) // if index is less than the number of lowest numbers to be removed, do not add to total for calculation
            {
            }
            else
            {
                total = total + scores.get(i); // calculations      
            }
        }
        weightedAvg = (total * weight)/(size - lowCount); // calculates weighted average
        
        return weightedAvg;
    }
    
    public static void displayResults(List<Double> scores, int lowCount, double weight, double weightedAvg) // displays final results // SHOULD WORK
    {
        // displaying all results
        System.out.println("\nThe weighted average of the numbers is " + weightedAvg + ", when using the");
        System.out.print("data "); 
        for (double num : scores)
        {
            System.out.print(num + ", ");
        }
        System.out.println(" where " + weight + " is the weight used,");
        System.out.println("and the average is computed after dropping the lowest " + lowCount + " values.");
    }
}

/*
run:
This program will calculate a weighted average of 5-10 numbers.

Type 5-10 numbers, each separated by a single space on the next line, and hit enter.
40 60 80 100 20 30 10
Number of smallest values to drop from list of numbers: 4
Enter the weight percentage you'll use for calculating the average: 50

The weighted average of the numbers is 40.0, when using the
data 10.0, 20.0, 30.0, 40.0, 60.0, 80.0, 100.0,  where 0.5 is the weight used,
and the average is computed after dropping the lowest 4 values.
BUILD SUCCESSFUL (total time: 21 seconds)

run:
This program will calculate a weighted average of 5-10 numbers.

Type 5-10 numbers, each separated by a single space on the next line, and hit enter.
1 2 3 4 
You must enter 5-10 numbers, each separated by a single space.
1 2 3 4 5 6 7 8 9 10 11
You must enter 5-10 numbers, each separated by a single space.
1 2 3 4 5 6 
Number of smallest values to drop from list of numbers: 3
Enter the weight percentage you'll use for calculating the average: 100

The weighted average of the numbers is 5.0, when using the
data 1.0, 2.0, 3.0, 4.0, 5.0, 6.0,  where 1.0 is the weight used,
and the average is computed after dropping the lowest 3 values.
BUILD SUCCESSFUL (total time: 33 seconds)

run:
This program will calculate a weighted average of 5-10 numbers.

Type 5-10 numbers, each separated by a single space on the next line, and hit enter.
40 60 80 100 20
Number of smallest values to drop from list of numbers: 0
Enter the weight percentage you'll use for calculating the average: 100

The weighted average of the numbers is 60.0, when using the
data 20.0, 40.0, 60.0, 80.0, 100.0,  where 1.0 is the weight used,
and the average is computed after dropping the lowest 0 values.
BUILD SUCCESSFUL (total time: 20 seconds)


run:
This program will calculate a weighted average of 5-10 numbers.

Type 5-10 numbers, each separated by a single space on the next line, and hit enter.
40 60 80 100 20
Number of smallest values to drop from list of numbers: -1
You can only drop 0-4 numbers, no more or less.
Number of values to drop: 2
Enter the weight percentage you'll use for calculating the average: 50

The weighted average of the numbers is 40.0, when using the
data 20.0, 40.0, 60.0, 80.0, 100.0,  where 0.5 is the weight used,
and the average is computed after dropping the lowest 2 values.
BUILD SUCCESSFUL (total time: 2 minutes 51 seconds)
*/