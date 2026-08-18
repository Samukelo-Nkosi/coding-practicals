/*
creating an operations program to initialize three
global variables....
 */
import java.util.Scanner;


public class myOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Enter the 1st number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the 2nd number: ");
            int num2 = input.nextInt();

            int sum1, sum2, sum3;

            //Addition of data
            sum1 = num1 + num2;
            System.out.print("\nThe value of sum 1 is = " + sum1);
            System.out.print("\n----------------------------------------");


            //Multiplication.java of Data
            int myMulti1 = num1 * num2;
            System.out.print("\nThe value of product 1 is = " + myMulti1);
            System.out.print("\n----------------------------------------");

            if (num2 == 0) {
                System.out.print("\nInvalid. Input a non 0 divisor!");
            } else {
                double myDiv1 = (double) num1 / num2;
                System.out.print("\nPerfect divisor!");
            }

            //Division of Data
            double myDiv1 = (double) num1 / num2;
            System.out.print("\nThe value of quotient 1 is = " + myDiv1);
            System.out.print("\n----------------------------------------");

            //Subtraction of Data
            int myDifference1 = num1 - num2;
            System.out.print("\nThe value of difference 1 is = " + myDifference1);
            System.out.print("\n----------------------------------------");

            input.close();
    }
}
