/**
	File name: CheckString.java
	Short description: This program will create a file, fill it with three words you choose, then read from it and print to the command line.
	IST 140 Assignment:  CheckString
	@author Christopher Guay
	@version 1.01 2019-15-12
	date of last revision:
	details of the revision: none
*/

// necessary imports to make program work
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CheckString
{
    public static void main (String[] args)
    {
        // local variable declaration
        List<String> testData = new ArrayList<>();
        String[] testDataS = new String[3]; // hard coded to 3
        List<String> fileContents = new ArrayList<>();
        String word = "";
        String filename = "data.txt";
        int size;
        
        // clears lists from previous runs
        fileContents.clear();
        testData.clear();
        
        // program description
        System.out.println("This program will create a file, fill it with three words you choose, then read from it and print to the command line.");
        
        for (int i = 0; i < 3; i++)
        {
            // calling functions: checking if input is a word, storing in testdta array list
            word = getWord();
            testData.add(word);
            System.out.println("You entered: " + word + ".");
        }
        
        // converting list to standard array
        size = testData.size();
        for (int i = 0; i < size; i++)
        {
            testDataS[i] = testData.get(i);
        }
        
        // calling functions: writing to file
        writeFile(testDataS, filename);
        
        // see if possible to open reading from file
        try 
        {
            fileContents = readFile(filename);
        }
        
        // catch IOExeption
        catch (IOException ex)
        {
            System.out.println("The file could not be opened for some obscure reason.");
        } 
        
        // displaying results
        System.out.println();
        for (String s : fileContents)
        {
            System.out.println(s);
        }
    }
    
    // Function 1 in problem description
    //  called from getWord, throws custom exception notAWordException
    public static void checkWord(String word) throws notAWordException
    {
        // checking first character to tell if it is a letter
        if (!(Character.isLetter(word.charAt(0))))
        {
            throw new notAWordException(); // red line, indicates error but runs fine???
        }
    }
    
    // Function 2 in problem description
    // gets word from user, uses custom exception
    public static String getWord() 
    {
        // local variable declaration
        Scanner input = new Scanner(System.in);
        boolean check1 = true;
        String word = "";

        // loop, need to keep asking until proper input recieved
        while (check1)
        {
            System.out.print("\nEnter a word: "); 
            word = input.next();
            try
            {
                // calling checkWord after getting input from user
                checkWord(word);
                check1 = false; // after checking word, set flag to false to quit looping, if exception not thrown
            }
            
            // catching from checkWord
            catch(notAWordException ex) 
            {
               System.out.println("Not a word");    
            }
        }
        return word;
    }
    
    // Function 3 in problem statement
    // writing to file
    public static void writeFile(String[] arrayToWrite, String filename) 
    {
        try
        {   // declaring printWriter to write to file 
            PrintWriter printWriter = new PrintWriter(filename, "UTF-8");
            for (int i = 0; i < 3; i++)
            {
                printWriter.println(arrayToWrite[i]);
            }
            printWriter.close(); // closing writing
        }
        
        // catching exceptions from printWriter
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }
        
        catch (UnsupportedEncodingException ex)
        {
            System.out.println("Encoding unsupported.");
        }
    }
    
    // Function 4 in problem statement
    // reading from file, storing data
    public static List<String> readFile(String filename) throws IOException
    {
        List<String> fileContents = new ArrayList<>();
        File inFile = new File(filename);

        // necessary to TRY before reading from it, will be caught by CATCH statements in main method
        try(Scanner in = new Scanner(inFile)) 
        {
            // while data is still available, keep getting input
            while (in.hasNextLine())
            {
                String line = in.nextLine(); // read from file line by line
                fileContents.add(line);
            }
            in.close();
        }
        
        return fileContents;
    }
}

// custom exception
// Aware that it's name isn't "Exception" as declared in problem statement,
// however, NetBeans would not allow this, so I gave it my own name. 
class notAWordException extends Exception
{
    public notAWordException() {}
}

/*
run:
This program will create a file, fill it with three words you choose, then read from it and print to the command line.

Enter a word: 8iss
Not a word

Enter a word: -iss
Not a word

Enter a word: pencil
You entered: pencil.

Enter a word: pen
You entered: pen.

Enter a word: eraser
You entered: eraser.

pencil
pen
eraser
BUILD SUCCESSFUL (total time: 11 seconds)


run:
This program will create a file, fill it with three words you choose, then read from it and print to the command line.

Enter a word: These
You entered: These.

Enter a word: are
You entered: are.

Enter a word: words
You entered: words.

These
are
words
BUILD SUCCESSFUL (total time: 10 seconds)
*/