/*-------------------------------------------------------------
// AUTHOR: Teodoro Salgado
// FILENAME: Lab3.java
// SPECIFICATION: your own description of the program.
// FOR: CSE 110 - Lab #3
// TIME SPENT: 3 Hours
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declares variables for grades.
		double homeworkGrade = 0, midtermGrade = 0, finalExamGrade = 0, weightedTotal;
		// Declares variables for counters.
		int i = 0;

		// Main while loop for user inputs.
		while (i < 3) {

			// Asks the user for the homework grade.
			if (i == 0) {
				System.out.print("Enter your HOMEWORK grade: ");
				homeworkGrade = input.nextDouble();
				// Input validation.
				if (homeworkGrade < 0 || homeworkGrade > 100){
					System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100]");
				}
				// Updates the loop variable if input is valid.
				else {
					i++;
				}
			}

			// Asks the user for the midterm grade.
			if (i == 1) {
				System.out.print("Enter your MIDTERM EXAM grade: ");
				midtermGrade = input.nextDouble();
				// Input validation.
				if (midtermGrade < 0 || midtermGrade > 100){
					System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100]");
				}
				// Updates the loop variable if input is valid.
				else {
					i++;
				}
			}

			// Asks the user for the final exam grade.
			if (i == 2) {
				System.out.print("Enter your FINAL EXAM grade: ");
				finalExamGrade = input.nextDouble();
				// Input validation.
				if (finalExamGrade < 0 || finalExamGrade > 200){
					System.out.println("[ERR] Invalid input. A final grade should be in [0, 200]");
				}
				// Updates the loop variable if input is valid.
				else {
					i++;
				}
			}
		} // End while loop.

		// Calculates the weighted total.
		weightedTotal = (homeworkGrade * 0.25) + (midtermGrade * 0.25) + ((finalExamGrade / 200) * 50);

		// Prints users weighted total to 2 decimal points.
		System.out.printf("[INFO] Student's Weighted Total is %.2f\n", weightedTotal);

		// Checks to see if the user passed the class.
		if (weightedTotal >= 50)
			System.out.println("[INFO] Student PASSED the class.");
		else
			System.out.println("[INFO] Student FAILED the class.");


		input.close();
	} // End of main.
} // End of class.
