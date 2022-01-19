/*
 *  File Name: L02_p14
 *  Short description: This program shows the balance of an account after 3 years
 *  IST 140 Assignment:  Lo2_P1.4
 *  Author: Christopher Guay
 *  Date of last revision: 9/13/2019
 *  Revision Details: 9/13/2019
 */
package l02_p1.pkg4;

/**
 *
 * @author Christopher Guay
 */
public class L02_p14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program description
        System.out.println("This program shows the balance of an account");
        System.out.println("after 3 years.");
        
        
        // Variable declaration
        double balance;
        final double interest = 0.05;
        double interestEarned;
        
        // initialize vars
        balance = 1000; // starting balance in dollars
        
        // calculations and display
        // first year
        interestEarned = balance * interest;
        balance = balance + interestEarned;
        System.out.println("\nFirst year balance: " + balance + " dollars.");
        System.out.println("First year interest: " + interestEarned +" dollars.");
        
        // second year
        interestEarned = balance * interest;
        balance = balance + interestEarned;
        System.out.println("\nSecond year balance: " + balance + " dollars.");
        System.out.println("Second year interest: " + interestEarned +" dollars.");
        
        // third year
        interestEarned = balance * interest;
        balance = balance + interestEarned;
        System.out.println("\nThird year balance: " + balance + " dollars.");
        System.out.println("Third year interest: " + interestEarned +" dollars.\n");

    }
    
}

/*
TEST RUN:

run:
This program shows the balance of an account
after 3 years.

First year balance: 1050.0 dollars.
First year interest: 50.0 dollars.

Second year balance: 1102.5 dollars.
Second year interest: 52.5 dollars.

Third year balance: 1157.625 dollars.
Third year interest: 55.125 dollars.

BUILD SUCCESSFUL (total time: 0 seconds)

*/
