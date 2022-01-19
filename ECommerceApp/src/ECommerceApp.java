/**
	File name: ECommerceApp.java
	Short description: 
	IST 140 Assignment:  PA-ECommerceApp
	@author Christopher Guay
	@version 1.01 2019-11-7
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class ECommerceApp
{
    public static void main (String[] args)
    {
        // PROGRAM DESCRIPTION
        System.out.println("This program will simulate an E-Commerce App\n\n");
        
        // VARIABLE DECLARATION
        String productsCatalog;
        boolean exists;
        double price, tax, totalSale;
        
        // CALLING FUNCTIONS
        bannerPrinter();
        productsCatalog = productsBuilder();
        exists = getOrder(productsCatalog);
        
        // IF PRODUCT IS FOUND
        if (exists)
        {
            price = getPrice();
            tax = getTax(price);
            totalSale = getTotal(price, tax);
            printTotal(totalSale);
        }
        else
        {
            System.out.println("The product was not found.");
        }
        
    }
     // 1 // PRINTING BANNER
    public static void bannerPrinter()
    {
        System.out.println("******************************************");
        System.out.println("====== Welcome to my eCommerce app! ======");
        System.out.println("******************************************\n");
    }
    
    // 2 // LIST OF PRODUCTS AVAILABLE
    public static String productsBuilder()
    {
        // LOCAL VARIABLE DECLARATION
        String productsCatalog = "Book______" + "Pencil_____" + "Eraser____"; // LIST OF PRODUCTS AVAILABLE
        
        return productsCatalog;
    }
    
    // 3 // GETTING INPUT FOR ITEM TO ORDER
    public static boolean getOrder(String productsCatalog)
    {
        // LOCAL VARIABLE DECLARATION
        String order;
        Scanner input = new Scanner(System.in);
        boolean exists = false;
        int length;
        
        // GETTING INPUT FOR ITEM TO ORDER
        System.out.print("Item to order: ");
        order = input.nextLine();
        
        // CHECKING IF STRING LONG ENOUGH
        length = order.length();
        if (length < 10)
        {
            for (int i = 10-length; i > 0; i--)
            {
                order += "_"; // ENSURE THAT ORDER STRING IS 10 CHARACTERS IN LENGTH, MATCHES SUBSTRINGS IN PRODUCTSCATALOG
            }
        }
        // CHECK IF PRODUCT LIST HAS ITEM REQUESTED
        if (productsCatalog.contains(order))
        {
            exists = true;
        }
        
        return exists;
    }
    
    // 4 // GET PRICE OF ITEM
    public static double getPrice()
    {
        // LOCAL VARIABLE DECLARATION
        Random rand = new Random();
        // CALCULATIONS
        double num = rand.nextInt(100) + 1;
        
        return num;
    }
    
    // 5 // CALCULATE TAX FOR ITEM
    public static double getTax(double price)
    {
        // LOCAL VARIABLE DECLARATION/CALCULATIONS
        double tax = price * 0.1;
        return tax;
    }
    
    // 6 // CALC TOTAL PRICE
    public static double getTotal(double price, double tax)
    {
        double totalSale = price + tax; // CALCULATIONS
        return totalSale;
    }
    
    // 7 // PRINTING RESULTS
    public static void printTotal(double totalSale)
    {
        String totalSaleS = String.format("%.2f", totalSale); // FORMATTING TO 2 DECIMAL PLACES
        System.out.println("Your sale total is: $" + totalSaleS);
    }
}

/*
TEST RUNS:
run:
This program will simulate an E-Commerce App


******************************************
====== Welcome to my eCommerce app! ======
******************************************

Item to order: Stuff
The product was not found.
BUILD SUCCESSFUL (total time: 8 seconds)

run:
This program will simulate an E-Commerce App


******************************************
====== Welcome to my eCommerce app! ======
******************************************

Item to order: Book
Your sale total is: $26.40
BUILD SUCCESSFUL (total time: 17 seconds)

run:
This program will simulate an E-Commerce App


******************************************
====== Welcome to my eCommerce app! ======
******************************************

Item to order: Pencil
Your sale total is: $49.50
BUILD SUCCESSFUL (total time: 8 seconds)

run:
This program will simulate an E-Commerce App


******************************************
====== Welcome to my eCommerce app! ======
******************************************

Item to order: Eraser
Your sale total is: $57.20
BUILD SUCCESSFUL (total time: 5 seconds)

run:
This program will simulate an E-Commerce App


******************************************
====== Welcome to my eCommerce app! ======
******************************************

Item to order: eraser
The product was not found.
BUILD SUCCESSFUL (total time: 2 seconds)
*/