/**
	File name: StringSlicer.java
	Short description: This program will read a string of your input, and print each character on its own line.
	IST 140 Assignment:  StringSlicer
	@author Christopher Guay
	@version 1.01 2019-11-23
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class StringSlicer
{
    public static void main (String[] args)
    {
        // Program Description
        System.out.println("This program will read a string of your input, and print each character on its own line.");
        
        // Variable Declaration
        String inString = "";
        int length = 0; // for indexing in arraylist and string
        List<Character> charString = new ArrayList<Character>();
        
        // calling functions
        inString = getString();
        length = inString.length();
        charString = stringToList(inString, length);
        printList(charString, length);
    }
    
    // getting user input
    public static String getString()
    {
        // local variable declaration
        Scanner input = new Scanner(System.in);
        String inString = "";
       
        // prompting for input
        System.out.print("Enter a string of characters: ");
        inString = input.nextLine();
        
        return inString;
    }
    
    // slicing string into characters
    public static List stringToList(String inString, int length)
    {
        // local variable declaration
        List<Character> charString = new ArrayList<Character>(); 
        
        // converting string to character wrapper array list
        for (int i = 0; i < length; i++) 
        {
            charString.add(inString.charAt(i));
        }
        
        return charString;
    }
    
    // printing arraylist
    public static void printList(List charString, int length)
    {
        // printing each element of array list on its own line
        for (int i = 0; i < length; i++) 
        {
           System.out.println(charString.get(i));
        }
    }
}

/*
TEST RUNS:
run:
This program will read a string of your input, and print each character on its own line.
Enter a string of characters: christopher
c
h
r
i
s
t
o
p
h
e
r
BUILD SUCCESSFUL (total time: 6 seconds)

run:
This program will read a string of your input, and print each character on its own line.
Enter a string of characters: StringSlicer
S
t
r
i
n
g
S
l
i
c
e
r
BUILD SUCCESSFUL (total time: 6 seconds)
*/