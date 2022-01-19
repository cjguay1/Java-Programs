/**
	File name: WeightedAvgDataAnalyzer.java
	Short description: This program will read from a file, calculate the weighted average, and write the results to a new file
	IST 140 Assignment:  WeightedAvgDataAnalyzer
	@author Christopher Guay
	@version 1.01 2019-12-14
	date of last revision:
	details of the revision: none
*/

// all imports necessary to run code
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.PrintWriter;
import java.util.Arrays;

public class WeightedAvgDataAnalyzer
{
    public static void main(String[] args) throws IOException
    {
        // variable declarations
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in); // believe this was needed so as to not read from file in other places, used for manual input
        double sum = 0;
        double weightedAvg = 0, weight = 0;
        int skip1st = 0;
        boolean check1 = true, check2 = true;
        double[] data = new double[7]; // 7 variables because not within problem scope to be any set of numbers
        double[] data2 = new double[5]; // holds exclusively numbers whose average will be calculated
        
        System.out.println("This program will read from a file,\ncalculate the weighted average of the scores in there,\nand print everything to an output file.");
       
        while (check1)
        {
            try
            {
                // getting user input
                System.out.println("Please enter the file to be read's name.");
                String filename = input.next();

                // calling functions: initiating reading from file
                data = readFile(filename);

                weight = data[0];
                skip1st = (int)Math.round(data[1]);
                
                for (int i = 2; i < 7; i++)
                {
                    data2[i - 2] = data[i]; // copying values to average to second array since holds weight and number to skip as well
                }
                Arrays.sort(data2); // sort array holding values to average for simpler indexing
                for (int i = 0; i < 5; i++)
                {
                    if (i >= skip1st) // if element is past range to skip
                    {
                        sum = sum + data2[i];
                    }
                }
                weightedAvg = (sum * weight)/(5-skip1st);
                
                check1 = false; // changing while loop flag
            }
            
            // if file not found
            catch (FileNotFoundException exception)
            {
               System.out.println("File not found.");
            }

            // if file name is not valid
            catch (NoSuchElementException exception)
            {
               System.out.println("File contents invalid.");
            }   
        }
        
        // getting user input: output file name
        while (check2)
        {
            System.out.println("Please enter the output file name.");
            String outputfile = input2.nextLine();
            if (outputfile.equals("data"))
            {
                System.out.println("That's the file to be read. Try another name.");
            }
            else
            {
                // calling functions: writing to file
                fileWrite(outputfile, data, weightedAvg, weight, skip1st);
                check2 = false;
            }
        }
    }
 
    // checking if file is present
    public static double[] readFile(String filename) throws IOException
    {
        File inFile = new File(filename);

        // necessary to TRY before reading from it, will be caught by CATCH statements in main method
        try(Scanner in = new Scanner(inFile)) 
        {
          return readData(in);
        }
    }
     
    // called from readFile, getting data from file
    public static double[] readData(Scanner input) throws IOException
    {   
        double[] numbers = new double[7]; // hard coding 7 numbers, only 5 numbers in average calculation at maximum

        for (int i = 0; i < 7; i++)
        {
            numbers[i] = input.nextDouble(); // taking input from file into array
        }

        return numbers;
    }
    
    // creating and writing to a file
    public static void fileWrite(String filename, double[] data, double weightedAvg, double weight, int skip1st) throws IOException
    {
        // adding .txt in case not added already
        filename = filename + ".txt"; 
        
        // using PrintWriter to write to output file, create if not already present
        PrintWriter printWriter = new PrintWriter(filename, "UTF-8");
        
        // displaying results
        printWriter.printf("The average of the numbers is %s, when using the data\n", String.valueOf(weightedAvg));
        for (int i = 2; i < 7; i++)
        {
            printWriter.printf("%s, ", String.valueOf(data[i]));
        }
        printWriter.printf("where %s is the weight used, and\n", String.valueOf(weight));
        printWriter.printf("the average is computed after dropping the lowest %s values.", String.valueOf(skip1st));
        printWriter.close(); // closing writing
    }
}

/*
TEST RUNS: 
run:
This program will read from a file,
calculate the weighted average of the scores in there,
and print everything to an output file.
Please enter the file to be read's name.
data
File not found.
Please enter the file to be read's name.
data.txt
Please enter the output file name.
data
That's the file to be read. Try another name.
Please enter the output file name.
output
BUILD SUCCESSFUL (total time: 10 seconds)

OUTPUT FILE: (name: output)
The average of the numbers is 42.5, when using the data
10.0, 70.0, 80.0, 90.0, 20.0, where 0.5 is the weight used, and
the average is computed after dropping the lowest 3 values.


run:
This program will read from a file,
calculate the weighted average of the scores in there,
and print everything to an output file.
Please enter the file to be read's name.
data.txt
Please enter the output file name.
output2
BUILD SUCCESSFUL (total time: 8 seconds)

OUTPUT FILE: (name: output2)
The average of the numbers is 97.5, when using the data
50.0, 60.0, 180.0, 90.0, 120.0, where 0.75 is the weight used, and
the average is computed after dropping the lowest 2 values.
*/