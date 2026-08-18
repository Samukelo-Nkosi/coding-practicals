/**
 * Task: Student Grading System
 * Create a Java program that asks the user to enter a student's name and mark. Use if-else
 * statements to determine the student's grade and results.
 *
 *
 * Questions:
 * 1. What is the purpose of an if-else statement?
 * 2. What is the difference between if and else if?
 * 3. Why should the program validate the mark?
 */


package Grade;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args){

        String grade;
        String result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("----------STUDENT REPORT----------");
        System.out.print("\nEnter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter mark: ");
        int mark = scanner.nextInt();
        //
        if (mark >= 80 && mark <= 100) {
            grade = "A";
            result = "Pass Distinction";
        }
        //
        else if (mark >= 60 && mark <= 74) {
            grade = "B";
            result = "Passed";
        }
        //
        else if (mark >= 50 && mark <= 59) {
            grade = "C";
            result = "Passed";
        }
        //
        else if (mark >= 40 && mark <= 49) {
            grade = "D";
            result = "Passed";
        }
        //
        else if (mark >= 0 && mark <= 39) {
            grade = "F";
            result = "Failed";
        }

        else {
            grade = "Invalid";
            result = "Invalid mark entered!";
        }

        System.out.print("----------------REPORT----------------");
        System.out.print("\nStudent: "+name+"\nwith a mark of: "+mark+"\nhas a grade of: "+grade+"\nhas a result of: "+result+".");
        System.out.print("\n-------------------END----------------");

        scanner.close();
    }
}
