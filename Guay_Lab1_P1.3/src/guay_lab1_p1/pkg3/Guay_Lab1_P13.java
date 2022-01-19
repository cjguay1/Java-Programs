/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Write a program that prints the product of the first ten positive integers
use * to indicate multiplication in java

 */
package guay_lab1_p1.pkg3;

/**
 * FILENAME: Guay_Lab1_P1.3.java
 * PROGRAM PURPOSE: Print the product of the first ten positive numbers
 * AUTHOR: Christopher Guay
 * DATE CREATED: 9/6/2019
 * DATE REVISED: 9/6/2019
 */
public class Guay_Lab1_P13 {

    /**
     * @param args the command line arguments
     * DECLARATION OF MAIN METHOD
     */
    public static void main(String[] args) {
        int product;
        product = 1*2*3*4*5*6*7*8*9*10;
        
        System.out.println("The sum of the first ten positive integers, ");
        System.out.println("or 10 factorial, is " + product);
    }
    
}
/*
TEST RUN:
run:
The sum of the first ten positive integers, 
or 10 factorial, is 3628800
BUILD SUCCESSFUL (total time: 0 seconds)
*/
