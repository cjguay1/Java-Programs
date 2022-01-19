/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalweight;

/**
 * FILENAME: TotalWeight.java
 * PROGRAM PURPOSE: To display the number of loaves of bread, weight per loaf, and total weight
 * AUTHOR: Christopher Guay
 * DATE CREATED: 9/6/2019
 * DATE REVISED: 9/6/2019
 */
public class TotalWeight {

    /**
     * @param args the command line arguments
     * DECLARATION OF MAIN METHOD
     */
    public static void main(String[] args) {
        // DELCARATION OF VARIABLES
        int weightOfLoaf = 16;
        int numberOfLoaves = 4;
        int totalWeight = weightOfLoaf * numberOfLoaves;
        
        // DISPLAYING OUTPUT
        System.out.print("With a weight of " + weightOfLoaf + " ounces in each loaf, ");
        System.out.println("and a total of " + numberOfLoaves + " loaves ");
        System.out.println("the total weight of all " + numberOfLoaves + " loaves is "+ totalWeight + " ounces.\n");
    }
    
}
/*
TEST RUN 1:
run:
With a weight of 16 ounces in each loaf, and a total of 4 loaves 
the total weight of all 4 loaves is 20ounces.

BUILD SUCCESSFUL (total time: 5 seconds)

TEST RUN 2: ADDED A SEMICOLON TO THE END OF LINE 26
run:
With a weight of 16 ounces in each loaf, and a total of 4 loaves 
the total weight of all 4 loaves is 20ounces.

BUILD SUCCESSFUL (total time: 0 seconds)

TEST RUN 3: 
ADDED SPACE BEFORE "ounces" IN LAST LINE, 
CHANGED + TO * OPERATOR FOR THE CALCULATION OF TOTALWEIGHT,
MOVED DECLARATION OF TOTALWEIGHT TO OTHER VARIABLE DECLARATION AREA

run:
With a weight of 16 ounces in each loaf, and a total of 4 loaves 
the total weight of all 4 loaves is 64 ounces.

BUILD SUCCESSFUL (total time: 0 seconds)
*/
