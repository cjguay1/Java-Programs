/**
	File name: AtmSimulator.java
	Short description: This program will simulate a basic ATM interaction for four operations
	IST 140 Assignment: AtmSimulator
	@author Christopher Guay
	@version 1.01 2019-10-4
	date of last revision: 10-4-2019
	details of the revision: none
*/

import java.util.Scanner;

public class AtmSimulator
{
    public static void main (String[] args)
    {
      // Program description
        System.out.println("This program will simulate a basic ATM interaction for four operations");
        
        // Declaring the variables: types and names
        int choice = 0;
        boolean check1 = true, check2 = true, check3 = true;
        double balance = 100000;
        double deposit = 0, withdrawal = 0;
        Scanner input = new Scanner(System.in);
        
        // Getting user input
        System.out.println("Select one of the following options.");
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
                break;
                
            case 4:
                System.out.println("Good-bye.");
                break;
                
            default:
        }
    }
}

/*
TEST RUNS:
run:
This program will simulate a basic ATM interaction for four operations
Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
0
Please choose an option from 1-4.
5
Please choose an option from 1-4.
1
Your current balance is $100000.00
BUILD SUCCESSFUL (total time: 10 seconds)

run:
This program will simulate a basic ATM interaction for four operations
Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
2
Deposit amount: -1
Your deposit cannot be negative.
5000
Your current balance is $105000.00
BUILD SUCCESSFUL (total time: 16 seconds)

run:
This program will simulate a basic ATM interaction for four operations
Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
3
Withdrawal amount: 120000
Insufficient funds.
-1
Withdrawal cannot be negative.
5000
Your current balance is $95000.00
BUILD SUCCESSFUL (total time: 10 seconds)

run:
This program will simulate a basic ATM interaction for four operations
Select one of the following options.
1. Balance
2. Deposit
3. Withdrawal
4. Quit
4
Good-bye.
BUILD SUCCESSFUL (total time: 2 seconds)
*/