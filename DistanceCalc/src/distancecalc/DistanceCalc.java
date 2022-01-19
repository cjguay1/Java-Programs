/*
 *  File Name: Distance Calc
 *  Short description: This program will calculate vehicle range and fuel cost to travel 100 miles.
 *  IST 140 Assignment:  
 *  Author: 
 *  Date of last revision: 
 *  Revision Details: 
 */
package distancecalc;

import java.util.Scanner;

public class DistanceCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program Description
        System.out.println("This program will calculate vehicle range");
        System.out.println("and fuel cost to travel 100 miles.");
        System.out.println("First, we need some information about your vehicle.");
        
        // var declaration
        Scanner input = new Scanner(System.in);
        double currentfuel, mpg, pricepgal, range, hundmilecost;
        
        // Getting user input
        System.out.print("\nGallons of fuel currently in tank: ");
        currentfuel = input.nextDouble();
        System.out.print("\nVehicle efficiency in miles per gallon: ");
        mpg = input.nextDouble();
        System.out.print("\nPrice per gallon of fuel: ");
        pricepgal = input.nextDouble();
        
        // calculations
        range = mpg * currentfuel; // range, given fuel levels
        hundmilecost = (100 / mpg) * pricepgal; // price for 100 miles at peak efficiency
        
        // display results
        System.out.printf("\n\nYou are able to travel %.2f miles on remaining fuel.\n", range);
        System.out.printf("It will cost $%.2f to travel 100 miles in the vehicle.\n", hundmilecost);
        
    }
    
}

/*
TEST RUNS:

run:
This program will calculate vehicle range
and fuel cost to travel 100 miles.
First, we need some information about your vehicle.

Gallons of fuel currently in tank: 10

Vehicle efficiency in miles per gallon: 30

Price per gallon of fuel: 3


You are able to travel 300.00 miles on remaining fuel.
It will cost $10.00 to travel 100 miles in the vehicle.
BUILD SUCCESSFUL (total time: 6 seconds)


run:
This program will calculate vehicle range
and fuel cost to travel 100 miles.
First, we need some information about your vehicle.

Gallons of fuel currently in tank: 14

Vehicle efficiency in miles per gallon: 23

Price per gallon of fuel: 3.62


You are able to travel 322.00 miles on remaining fuel.
It will cost $15.74 to travel 100 miles in the vehicle.
BUILD SUCCESSFUL (total time: 12 seconds)

*/
