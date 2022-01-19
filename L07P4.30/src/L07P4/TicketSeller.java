/**
	File name: TicketSeller.java
	Short description: 
	IST 140 Assignment:  Enter Assignment # here
	@author Christopher Guay
	@version 1.01 2019-
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;

public class TicketSeller
{
    public static void main (String[] args)
    {
        // Program description
        System.out.println("This program will sell you tickets to a cinema!");
        System.out.println("There are only 100 in total, and you can buy a max of 4 each.");
        
        // variable declaration
        Scanner input = new Scanner(System.in);
        int ticketsLeft = 100, bought, buyers = 0;
        
        // selling tickets
        while (ticketsLeft > 0)
        {
            System.out.print("Tickets desired: ");
            bought = input.nextInt(); // user input
            if (bought > 4 || bought < 0) // error checking
            {
                System.out.println("Sorry, you can't have that many tickets!");
            } else if (bought == 0) // opting out of sale
            {
                System.out.println("OK! Next!");
            }
            else if (bought > ticketsLeft) // if not enough left for sale
            {
                System.out.println("Sorry, we only have " + ticketsLeft + " left!");
            } else // calculations/displaying results
            {
                ticketsLeft = ticketsLeft - bought;
                buyers += 1;
                System.out.println("There are " + ticketsLeft + " tickets left!");
            }
        }
        // displaying results
        System.out.println("The total number of buyers was " + buyers + "!");
    }
}

/*
TEST RUN:
run:
This program will sell you tickets to a cinema!
There are only 100 in total, and you can buy a max of 4 each.
Tickets desired: -1
Sorry, you can't have that many tickets!
Tickets desired: 5
Sorry, you can't have that many tickets!
Tickets desired: 1
There are 99 tickets left!
Tickets desired: 2
There are 97 tickets left!
Tickets desired: 3
There are 94 tickets left!
Tickets desired: 4
There are 90 tickets left!
Tickets desired: 1
There are 89 tickets left!
Tickets desired: 2
There are 87 tickets left!
Tickets desired: 3
There are 84 tickets left!
Tickets desired: 4
There are 80 tickets left!
Tickets desired: 1
There are 79 tickets left!
Tickets desired: 2
There are 77 tickets left!
Tickets desired: 3
There are 74 tickets left!
Tickets desired: 4
There are 70 tickets left!
Tickets desired: 1
There are 69 tickets left!
Tickets desired: 2
There are 67 tickets left!
Tickets desired: 3
There are 64 tickets left!
Tickets desired: 4
There are 60 tickets left!
Tickets desired: 1
There are 59 tickets left!
Tickets desired: 2
There are 57 tickets left!
Tickets desired: 3
There are 54 tickets left!
Tickets desired: 4
There are 50 tickets left!
Tickets desired: 1
There are 49 tickets left!
Tickets desired: 2
There are 47 tickets left!
Tickets desired: 3
There are 44 tickets left!
Tickets desired: 4
There are 40 tickets left!
Tickets desired: 2
There are 38 tickets left!
Tickets desired: 32
Sorry, you can't have that many tickets!
Tickets desired: 3
There are 35 tickets left!
Tickets desired: 4
There are 31 tickets left!
Tickets desired: 1
There are 30 tickets left!
Tickets desired: 2
There are 28 tickets left!
Tickets desired: 3
There are 25 tickets left!
Tickets desired: 4
There are 21 tickets left!
Tickets desired: 2
There are 19 tickets left!
Tickets desired: 2
There are 17 tickets left!
Tickets desired: 3
There are 14 tickets left!
Tickets desired: 4
There are 10 tickets left!
Tickets desired: 1
There are 9 tickets left!
Tickets desired: 4
There are 5 tickets left!
Tickets desired: 4
There are 1 tickets left!
Tickets desired: 4
Sorry, we only have 1 left!
Tickets desired: 3
Sorry, we only have 1 left!
Tickets desired: 2
Sorry, we only have 1 left!
Tickets desired: 1
There are 0 tickets left!
The total number of buyers was 39!
BUILD SUCCESSFUL (total time: 47 seconds)
*/