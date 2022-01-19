/**
	File name: Backwards_Strings.java
	Short description: 
	IST 140 Assignment:  Enter Assignment # here
	@author Christopher Guay
	@version 1.01 2019-
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;
import java.lang.*;

public class Backwards_Strings
{
    public static void main (String[] args)
    {
        // Program description
        System.out.println("This program will flip around any two 3-character strings you enter!");
        System.out.println("Or any other length string, for that matter.");
        
        // variable declaration
        String userString1;
        String userString2;
        String flipstring = "";
        Scanner input = new Scanner(System.in);
        int string1length, string2length;
        
        // getting input from user
        System.out.print("First string: ");
        userString1 = input.nextLine();
        System.out.print("Second string: ");
        userString2 = input.nextLine();
        
        // calculations
        string1length = userString1.length() - 1;
        string2length = userString2.length() - 1;
        
        for (int i = string2length; i >= 0; --i) // actually flipping characters here
        {
            flipstring = flipstring + userString2.charAt(i);
        }
        
        flipstring = flipstring + " ";
        
        for (int i = string1length; i >= 0; --i) // actually flipping characters here
        {
            flipstring = flipstring + userString1.charAt(i);
        }
        
        // displaying results
        System.out.println("The two strings you entered are: " + userString1 + " " + userString2 + ".");
        System.out.println("The two strings in reverse are: " + flipstring + ".");
       
        
        
    }
}


/*
TEST RUNS

run:
This program will flip around any two 3-character strings you enter!
Or any other length string, for that matter.
First string: abc
Second string: def
The two strings you entered are: abc def.
The two strings in reverse are: fed cba.
BUILD SUCCESSFUL (total time: 5 seconds)

run:
This program will flip around any two 3-character strings you enter!
Or any other length string, for that matter.
First string: christopher
Second string: guay
The two strings you entered are: christopher guay.
The two strings in reverse are: yaug rehpotsirhc.
BUILD SUCCESSFUL (total time: 22 seconds)

run:
This program will flip around any two 3-character strings you enter!
Or any other length string, for that matter.
First string: Breanna
Second string: Wellheuser
The two strings you entered are: Breanna Wellheuser.
The two strings in reverse are: resuehlleW annaerB.
BUILD SUCCESSFUL (total time: 7 seconds)

run:
This program will flip around any two 3-character strings you enter!
Or any other length string, for that matter.
First string: abcdefghijklmnopqrstuvwxyz
Second string: the alphabet
The two strings you entered are: abcdefghijklmnopqrstuvwxyz the alphabet.
The two strings in reverse are: tebahpla eht zyxwvutsrqponmlkjihgfedcba.
BUILD SUCCESSFUL (total time: 25 seconds)
*/