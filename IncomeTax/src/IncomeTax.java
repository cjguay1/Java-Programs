/**
	File name: IncomeTax.java
	Short description: This program will calculate a user's income tax
	IST 140 Assignment: PA IncomeTax
	@author Christopher Guay
	@version 1.01 2019-10-4
	date of last revision:10-4-2019
	details of the revision: none
*/

import java.util.Scanner;
import java.lang.*;

public class IncomeTax
{
    public static void main (String[] args)
    {
        // Program description
        System.out.println("This program will calculate a user's income tax.");

        // Declaring the variables: types and names
        String status = "";
        double income = 0, incomeTax, tax;
        Scanner input = new Scanner(System.in);
        boolean check1 = true, check2 = true;
        
        // getting VALID user input
        System.out.print("Enter your marital status (Single or Married):  ");
        while (check1)
        {
            status = input.nextLine();
            status = status.toLowerCase();
            if (status.equals("single") || status.equals("married"))
            {
                check1 = false;
            }
            else
            {
                System.out.println("You can either be married or single. Try again.");
            }
        }
        
        // getting VALID user input
        System.out.print("Annual income: $");
        while (check2) {
            income = input.nextDouble();
            if (income >= 0)
            {
                check2 = false;
            }
            else
            {
                System.out.println("Your income cannot be negative. Try again.");
            }
        }
        
        // nested IF statements for determining tax percentages
        if (income > 30000)
        {
            if (status.equals("single"))
            {
                tax = 20.0;
                incomeTax = income * (tax/100);
            }
            else
            {
                tax = 25.0;
                incomeTax = income * (tax/100);
            }
        }
        else
        {
            if (status == "single")
            {
                tax = 15.0;
                incomeTax = income * (tax/100);
            }
            else
            {
                tax = 12.0;
                incomeTax = income * (tax/100);
            }
        }
        
        // formatting results to two decimal places
        String incomeS = String.format("%.2f", income);
        String taxS = String.format("%.2f", tax);
        String incomeTaxS = String.format("%.2f", incomeTax);
        
        // Displaying results
        System.out.println("Based on a status of \"" + status + "\" and an annual income of $" + incomeS + ",");
        System.out.println("the income tax is " + taxS + "% of $" + incomeS + ", which equals $" + incomeTaxS + ".");
    }
}

/*
TEST RUNS:
run:
This program will calculate and display
the average of any 3 numbers

Enter your marital status (Single or Married):  s
You can either be married or single. Try again.
g
You can either be married or single. Try again.
single
Annual income: $5000
Based on a status of "single" and an annual income of $5000.00,
the income tax is 12.00% of $5000.00, which equals $600.00.
BUILD SUCCESSFUL (total time: 8 seconds)

run:
This program will calculate and display
the average of any 3 numbers

Enter your marital status (Single or Married):  m
You can either be married or single. Try again.
married
Annual income: $40000
Based on a status of "married" and an annual income of $40000.00,
the income tax is 25.00% of $40000.00, which equals $10000.00.
BUILD SUCCESSFUL (total time: 12 seconds)

run:
This program will calculate and display
the average of any 3 numbers

Enter your marital status (Single or Married):  M
You can either be married or single. Try again.
MARRIED
Annual income: $50000
Based on a status of "married" and an annual income of $50000.00,
the income tax is 25.00% of $50000.00, which equals $12500.00.
BUILD SUCCESSFUL (total time: 10 seconds)

run:
This program will calculate and display
the average of any 3 numbers

Enter your marital status (Single or Married):  s
You can either be married or single. Try again.
SINGLE
Annual income: $25000
Based on a status of "single" and an annual income of $25000.00,
the income tax is 12.00% of $25000.00, which equals $3000.00.
BUILD SUCCESSFUL (total time: 8 seconds)

*/