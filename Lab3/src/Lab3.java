/*-------------------------------------------------------------
// AUTHOR: Teodoro Salgado
// FILENAME: Lab3.java
// SPECIFICATION: Computes the users weighted average.
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
		int i = 0, chanceCounter = 2;

		// Main while loop for user inputs.
		while (i < 3) {

			// Asks the user for the HOMEWORK grade.
			if (i == 0) {
				if (chanceCounter == 2) {
					System.out.print("Enter your HOMEWORK grade: ");
					homeworkGrade = input.nextDouble();
				}
				// Input validation.
				if ((homeworkGrade < 0 || homeworkGrade > 100) && chanceCounter > -1){
					System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100]");
					System.out.printf("Enter your HOMEWORK grade (%d chances left): ",chanceCounter);
					homeworkGrade = input.nextDouble();
					chanceCounter--;
				}
				else if ((homeworkGrade < 0 || homeworkGrade > 100) && chanceCounter == -1) {
					System.out.println("[ERR] You have retried 3 times. Please restart your program.");
					i = 3;
				}
				// Updates the loop variable if input is valid.
				else {
					chanceCounter = 2;
					i++;
				}
			}

			// Asks the user for the MIDTERM grade.
			else if (i == 1) {
				if (chanceCounter == 2) {
					System.out.print("Enter your MIDTERM grade: ");
					midtermGrade = input.nextDouble();
				}
				// Input validation.
				if ((midtermGrade < 0 || midtermGrade > 100) && chanceCounter > -1){
					System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100]");
					System.out.printf("Enter your MIDTERM grade (%d chances left): ",chanceCounter);
					midtermGrade = input.nextDouble();
					chanceCounter--;
				}
				else if ((midtermGrade < 0 || midtermGrade > 100) && chanceCounter == -1) {
					System.out.println("[ERR] You have retried 3 times. Please restart your program.");
					i = 3;
				}
				// Updates the loop variable if input is valid.
				else {
					chanceCounter = 2;
					i++;
				}
			}

			// Asks the user for the FINAL EXAM grade.
			else if (i == 2) {
				if (chanceCounter == 2) {
					System.out.print("Enter your FINAL EXAM grade: ");
					finalExamGrade = input.nextDouble();
				}
				// Input validation.
				if ((finalExamGrade < 0 || finalExamGrade > 200) && chanceCounter > -1){
					System.out.println("[ERR] Invalid input. A final grade should be in [0, 200]");
					System.out.printf("Enter your FINAL EXAM grade (%d chances left): ",chanceCounter);
					finalExamGrade = input.nextDouble();
					chanceCounter--;
				}
				else if ((finalExamGrade < 0 || finalExamGrade > 200) && chanceCounter == -1) {
					System.out.println("[ERR] You have retried 3 times. Please restart your program.");
					i = 3;
				}
				// Updates the loop variable if input is valid.
				else {
					chanceCounter = 2;
					i++;
				}
			}

			else {
				break;
			}
		} // End while loop.

		// Calculates the weighted total.
		weightedTotal = (homeworkGrade * 0.25) + (midtermGrade * 0.25) + ((finalExamGrade / 200) * 50);

		if (chanceCounter == 2) {
			// Prints users weighted total to 2 decimal points.
			System.out.printf("[INFO] Student's Weighted Total is %.2f\n", weightedTotal);

			// Checks to see if the user passed the class.
			if (weightedTotal >= 50)
				System.out.println("[INFO] Student PASSED the class.");
			else
				System.out.println("[INFO] Student FAILED the class.");
		}

		input.close();
	} // End of main.
} // End of class.
