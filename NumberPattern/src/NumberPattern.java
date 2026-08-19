/**
 * Activity 3: Number Pattern
 *
 * Task:
 * Create a Java program that prints the following number pattern:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 *
 * Challenge:
 * Ask the user how many rows they want to print.
 */

import java.util.Scanner;


public class NumberPattern {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many rows do you want to print? : ");
        int num = input.nextInt();

        System.out.print("\nYou entered: " +num+ "\n");

        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n){


        int i, j;
        for (i = 1; i <= n; i++){
            for(j = 1; j<= i; j++){
                System.out.print(j + "");
            }

            System.out.println();
        }
    }
}
