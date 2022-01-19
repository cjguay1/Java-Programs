/**
	File name: Scorer.java
	Short description: This program will find the average of each row of 3 scores.
	IST 140 Assignment:  Scorer
	@author Christopher Guay
	@version 1.01 2019-11-23
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;

public class Scorer
{
    public static void main (String[] args)
    {
        // Program description
        System.out.println("This program will find the average of each row of 3 scores.");
        
        // variable declaration
        double[][] scores = new double[3][3];
        double[] averages = new double[3];
        
        // calling functions
        scores = getScores();
        averages = findAve(scores);
        printAve(averages);
    }
    
    // populating 3x3 matrix of scores
    public static double[][] getScores()
    {
        // local variable declaration
        Scanner input = new Scanner(System.in);
        double[][] scores = new double[3][3];
        
        for (int i = 0; i < 3; i++) // rows
        {
            for (int j = 0; j < 3; j++) // columns
            {
                System.out.print("Score for row " + (i + 1) + " column " + (j + 1) + ": ");
                scores[i][j] = input.nextDouble();
            }
        }
        
        return scores;
    }
    
    // calculating average of each row of scores
    public static double[] findAve(double[][] scores)
    {
        // local variable declaration
        double[] averages = new double[3];
        double total = 0;
        
        for (int i = 0; i < 3; i++)// rows
        {
            for (int j = 0; j < 3; j++) // columns
            {
                total += scores[i][j]; // add all elements in row {I}
            }
            averages[i] = total/3; // compute average of row {I}
            total = 0; // reset total for next row
        }
        
        return averages;
    }
    
    // printing results
    public static void printAve(double[] averages)
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Average of row " + (i+1) + ": " + averages[i]);
        }
    }
}

/*
TEST RUNS:
run:
This program will find the average of each row of 3 scores.
Score for row 1 column 1: 4
Score for row 1 column 2: 4
Score for row 1 column 3: 4
Score for row 2 column 1: 5
Score for row 2 column 2: 56
Score for row 2 column 3: 5
Score for row 3 column 1: 6
Score for row 3 column 2: 6
Score for row 3 column 3: 6
Average of row 1: 4.0
Average of row 2: 22.0
Average of row 3: 6.0
BUILD SUCCESSFUL (total time: 9 seconds)

This program will find the average of each row of 3 scores.
Score for row 1 column 1: 12
Score for row 1 column 2: 14
Score for row 1 column 3: 16
Score for row 2 column 1: 18
Score for row 2 column 2: 20
Score for row 2 column 3: 22
Score for row 3 column 1: 24
Score for row 3 column 2: 26
Score for row 3 column 3: 28
Average of row 1: 14.0
Average of row 2: 20.0
Average of row 3: 26.0
BUILD SUCCESSFUL (total time: 29 seconds)
*/