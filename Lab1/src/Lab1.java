/*------------------------------------------------------------
// AUTHOR: Teodoro Salgado
// FILENAME: Lab1.java
// SPECIFICATION: Submission file for lab 1 of CSE 110
// FOR: CSE 110 - Lab #1
// TIME SPENT: 30 Minutes
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab1 {
    public static void main (String[] args) {

        // Declares variables for grade inputs.
        double test1, test2, test3;
        // Declares the number of tests as a constant variable.
        final double NUM_TESTS = 3;
        // Creates the scanner.
        Scanner input = new Scanner(System.in);

        // Asks user to input grades for all 3 tests.
        // Assigns user inputs to corresponding test grade variables.
        System.out.print("Enter the score on the first test: ");
        test1 = input.nextDouble();

        System.out.print("Enter the score on the second test: ");
        test2 = input.nextDouble();

        System.out.print("Enter the score on the third test: ");
        test3 = input.nextDouble();
        //Declares and calculates the average of test scores.
        double average = (test1 + test2 + test3) / NUM_TESTS;
        // Outputs the test score average to 2 decimal places.
        System.out.printf("Your average score is: %.2f", average);

        input.close();
    }
}