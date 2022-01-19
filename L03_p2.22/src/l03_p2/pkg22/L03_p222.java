/*
 *  File Name: L03_P2.22
 *  Short description: This program will determine the cost of purchasing multiple copies of the same book.
 *  IST 140 Assignment:  L03_P2.22
 *  Author: Christopher Guay
 *  Date of last revision: 9/13/2019
 *  Revision Details:  
 */
package l03_p2.pkg22;

import java.util.Scanner;

public class L03_p222 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program Description
        System.out.println("This program will determine the cost of buying multiples of the same book.");
        // var declaration
        double bookPrice, totalPrice, taxPrice;
        int copies;
        final double tax = 0.075;
        final int shipcharge = 2;
        Scanner input = new Scanner(System.in);
               
        // getting user input
        System.out.print("\nNumber of books to be ordered: ");
        copies = input.nextInt();
        System.out.print("\nPrice per book: ");
        bookPrice = input.nextDouble();
        
        // calculations
        totalPrice = bookPrice * copies;
        taxPrice = tax * totalPrice;
        totalPrice = totalPrice + taxPrice;
        totalPrice = totalPrice + copies * shipcharge;
        
        // displaying the results
        System.out.printf("\n\nThe total order cost is %.2f dollars.\n" , totalPrice);
    }
    
}

/*
TEST RUNS: 

run:
This program will determine the cost of buying multiples of the same book.

Number of books to be ordered: 4

Price per book: 40


The total order cost is 180.00 dollars.
BUILD SUCCESSFUL (total time: 3 seconds)

run:
This program will determine the cost of buying multiples of the same book.

Number of books to be ordered: 12

Price per book: 47


The total order cost is 630.30 dollars.
BUILD SUCCESSFUL (total time: 6 seconds)
*/
