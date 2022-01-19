/*
 *  File Name: AverageCalculator
 *  Short description: This program asks for five values, 
 *  IST 140 Assignment:  
 *  Author: Christopher Guay
 *  Date of last revision: 
 *  Revision Details: 
 */
package averagecalculator;

import java.util.Scanner;

public class AverageCalculator {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program Description
        System.out.println("This program will ask for 5 values,");
        System.out.println("then calculate and return their average.");
        
        // declaring vars
        double num1, num2, num3, num4, num5, average;
        Scanner input = new Scanner(System.in);
        
        // getting input
        System.out.println("\nPlease enter 5 real numbers.");
        System.out.print("\nFirst number: ");
        num1 = input.nextDouble();
        System.out.print("\nSecond number: ");
        num2 = input.nextDouble();
        System.out.print("\nThird number: ");
        num3 = input.nextDouble();
        System.out.print("\nFourth number: ");
        num4 = input.nextDouble();
        System.out.print("\nFifth number: ");
        num5 = input.nextDouble();
              
        
        // calculations
        average = (num1+num2+num3+num4+num5)/5;
        
        // displaying results
        System.out.println("The average of " + num1 +  ", " + num2 + ", " + num3 + ", " + num4 + ", and " + num5);
        System.out.printf("is: %.2f\n" , average);
        
        
    }
    
}

/*
TEST RUNS:

run:
This program will ask for 5 values,
then calculate and return their average.

Please enter 5 real numbers.

First number: 23

Second number: 43

Third number: 12

Fourth number: 56

Fifth number: 32
The average of 23.0, 43.0, 12.0, 56.0, and 32.0
is: 33.20
BUILD SUCCESSFUL (total time: 11 seconds)


run:
This program will ask for 5 values,
then calculate and return their average.

Please enter 5 real numbers.

First number: 25

Second number: 31

Third number: 40

Fourth number: 38

Fifth number: 36
The average of 25.0, 31.0, 40.0, 38.0, and 36.0
is: 34.00
BUILD SUCCESSFUL (total time: 12 seconds)

*/
