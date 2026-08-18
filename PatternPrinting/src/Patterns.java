/**
 * Activity 2: Pattern Printing(Floyd's Triangle)
 *
 * Task:
 * Create a Java program that uses nested for loops to print the following pattern:
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 *
 * Questions:
 * 1. How many times does the outer loop run?
 * 2. What is the purpose of the inner loop?
 * 3. Modify the program to print 8 rows.
 */

import java.util.Scanner;


public class Patterns {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 8; i++) { // modified this program to print 8 rows

            for (int j = 1; j <= i; j++) {  // columns
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}