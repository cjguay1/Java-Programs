/**
	File name: AtmSimDoLoop.java
	Short description: This program will simulate a basic ATM until asked to quit.
	IST 140 Assignment: AtmSimDoLoop
	@author Christopher Guay
	@version 1.01 2019-10-18
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;

public class AtmSimDoLoop
{
    public static void main (String[] args)
    {
        // program description
        System.out.println("This program will simulate a basic ATM.");
        
        // Declaring the variables: types and names
        int choice = 0;
        boolean check1 = true, check2 = true, check3 = true, loopbreak = false; // loopbreak variable added to flag if need to quit program
        double balance = 100000;
        double deposit = 0, withdrawal = 0;
        Scanner input = new Scanner(System.in);
        
        do // start of loop to keep in AtmSimulator
        {
            // Getting user input
            System.out.println("\nSelect one of the following options.");
            System.out.println("1. Balance\n2. Deposit\n3. Withdrawal\n4. Quit");

            // validating option choice
            while (check1)
            {
                choice = input.nextInt();
                if (choice < 1 || choice > 4)
                {
                    System.out.println("Please choose an option from 1-4.");
                } else
                {
                    check1 = false;
                }
            }
            switch(choice)
            {
                case 1:
                    String balanceS = String.format("%.2f", balance);
                    System.out.println("Your current balance is $" + balanceS);
                    check1 = true; // resetting flags for next menu iteration
                    check2 = true;
                    check3 = true;
                    break;

                case 2:
                    System.out.print("Deposit amount: ");
                    while (check2) // validating deposit amount
                    {
                        deposit = input.nextDouble();
                        if (deposit < 0)
                        {
                            System.out.println("Your deposit cannot be negative.");
                        } else
                        {
                            check2 = false;
                        }
                    }
                    // displaying results/calculations
                    balance = balance + deposit;
                    balanceS = String.format("%.2f", balance);
                    System.out.println("Your current balance is $" + balanceS);
                    check1 = true; // resetting flags for next menu iteration
                    check2 = true;
                    check3 = true;
                    break;

                case 3:
                    System.out.print("Withdrawal amount: ");
                    while (check3) // validating withdrawal amount
                    {
                        withdrawal = input.nextDouble();
                        if (withdrawal > balance)
                        {
                            System.out.println("Insufficient funds.");
                        } else if (withdrawal < 0)
                        {
                            System.out.println("Withdrawal cannot be negative.");
                        } else
                        {
                            check3 = false;
                        }
                    }
                    // displaying results/calculations
                    balance = balance - withdrawal;
                    balanceS = String.format("%.2f", balance);
                    System.out.println("Your current balance is $" + balanceS);
                    check1 = true; // resetting flags for next menu iteration
                    check2 = true;
                    check3 = true;
                    break;

                case 4:
                    System.out.println("Good-bye.");
                    loopbreak = true; // set flag for breaking loop and ending program
                    break;

                default:
            }
        }while(!loopbreak); // end of Do-While loop
    }
}

/*
TEST RUNS:
run:
This program will simulate a basic ATM.

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
1
Your current balance is $100000.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
2
Deposit amount: -1
Your deposit cannot be negative.
500
Your current balance is $100500.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
2
Deposit amount: 500
Your current balance is $101000.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
3
Withdrawal amount: 1000
Your current balance is $100000.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
3
Withdrawal amount: 1100000
Insufficient funds.
50000
Your current balance is $50000.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
2
Deposit amount: 500
Your current balance is $50500.00
Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
4
Good-bye.
BUILD SUCCESSFUL (total time: 43 seconds)

run:
This program will simulate a basic ATM.

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
1
Your current balance is $100000.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
3
Withdrawal amount: 90000
Your current balance is $10000.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
2
Deposit amount: 500
Your current balance is $10500.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
3
Withdrawal amount: 10000
Your current balance is $500.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
2
Deposit amount: 500
Your current balance is $1000.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
3
Withdrawal amount: 1100
Insufficient funds.
1000
Your current balance is $0.00

Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
4
Good-bye.
BUILD SUCCESSFUL (total time: 4 minutes 22 seconds)
*/