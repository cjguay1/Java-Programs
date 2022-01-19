/*
 *  File Name: L02_p2.3
 *  Short description: Program will display the square, cube, and fourth power of a number
 *  IST 140 Assignment:  L02_p2.3
 *  Author: Christopher Guay
 *  Date of last revision: 9/13/2019
 *  Revision Details: 9/13/2019
 */
package l02_p2.pkg3;

import java.util.Scanner;

public class L02_p23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        
        // variable declaration
        Scanner input = new Scanner(System.in);
        double number;
        double square, cube, fourth;
        
        // initialize vars
        System.out.print("Please enter a number: ");
        number = input.nextDouble();
        
        // calculations
        square = number * number;
        cube = square * number;
        fourth = Math.pow(number,4);
        
        System.out.println("You entered: " + number);
        System.out.println("Its second power is: " + square);
        System.out.println("Its third power is: " + cube);
        System.out.println("Its fourth power is: " + fourth);

    }
    
}

/*
TEST RUNS:

run:
Please enter a number: 4
You entered: 4.0
Its second power is: 16.0
Its third power is: 64.0
Its fourth power is: 256.0
BUILD SUCCESSFUL (total time: 4 seconds)

run:
Please enter a number: 15
You entered: 15.0
Its second power is: 225.0
Its third power is: 3375.0
Its fourth power is: 50625.0
BUILD SUCCESSFUL (total time: 3 seconds)

*/
