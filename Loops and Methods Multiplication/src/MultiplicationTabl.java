
/**
 * Create a Java program that asks the user to enter a number and uses a for loop to display
 * its multiplication table from 1 to 10.
 *
 *
 *Questions:
 * 1. What is the purpose of the for loop?
 * 2. Change the program to display the table from 1 to 12.
 * 3. What happens if the user enters a negative number?
 */
import java.util.Scanner;

public class MultiplicationTabl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int number = input.nextInt();

        System.out.print("\nMultiplication for: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(number + " x " + i + " = " + (number * 1));
        }

        input.close();
    }
}