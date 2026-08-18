/**
 * Task:
 * Create a Java program that asks the user to enter two numbers and an arithmetic operator
 * (+, -, *, /).
 * The program must calculate and display the result.
 */

/**
 * Questions:
 * 1. What is the purpose of the Scanner class?
 * 2. Name the four arithmetic operators used in the program.
 * 3. What happens when the user enters an invalid operator?
 * -use case/switch statements
 *
 * 4. Modify the program to prevent division by zero
 */

package calculator;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){

        int num1, num2;
        int result;

        Scanner input = new Scanner(System.in);

        System.out.print("--------------My Calculator-------------");
        System.out.print("\nEnter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter Operator: ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("----------------------------------------");

        result = 0;

        //adding
        if (operator == '+') {
            result = num1 + num2;
        //subtracting
        } else if (operator == '-') {
            result = num1 - num2;
        //multiplication
        } else if (operator == '*') {
            result = num1 * num2;
        //division
        } else if (operator == '/') {
            result = num1 / num2;
        }

        switch(operator){
            case '+':
                result = num1 + num2;
                break;
                case '-':
                result = num1 - num2;
                break;
                case '*':
                result = num1 * num2;
                break;
                case '/':
                if (num2 == 0) {
                    System.out.print("division by zero is impossible!");
                }else{
                    result = num1 / num2;
                }
                result = num1 / num2;
                break;
                default:
                System.out.print("\nInvalid Operator!");
        }

        System.out.print("\nResult: " + result);

        input.close();
    }
}
