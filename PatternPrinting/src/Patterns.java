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
    public static void main(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of asterisk rows: ");
        int n = input.nextLine();

        int num = 1;

        for(char i = 1; i <= n; i++){         // rows
            for(char k = 1; k <= n; k++){     // columns
                System.out.print(num + "");
                num ++;
            }
            System.out.print();
        }
    }
}
