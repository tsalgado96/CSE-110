/*-------------------------------------------------------------
// AUTHOR: Teodoro Salgado
// FILENAME: Lab3.java
// SPECIFICATION: your own description of the program.
// FOR: CSE 110 - Lab #3
// TIME SPENT: 3 Hours
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab3_1 {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	// Declares variables for grades.
    	double homeworkGrade = 0, midtermGrade = 0, finalExamGrade = 0, weightedTotal;
    	// Declares variables for counters.
    	int i = 0, chanceCounter = 2;

    	// Main while loop for user inputs.
    	while (i < 3) {
    		// Asks user for the homework grade.
    		if (i == 0) {
    			// Stores the users input into corresponding variable.
				System.out.print("Enter your HOMEWORK grade: ");
				homeworkGrade = input.nextInt();

				// Enters loop if user input is out of range and checks how many chances the user has left.
				while (homeworkGrade < 0 || homeworkGrade > 100 && chanceCounter >= -1) {
					// If the user still has chances left then ask to enter grade again.
					if (chanceCounter >= 0) {
						System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100]\n");
						System.out.printf("Enter your HOMEWORK grade (%d chances left): ", chanceCounter);
						homeworkGrade = input.nextInt();
						// Decreases the chance counter by 1.
						chanceCounter--;
						// If the user inputs a valid grade then the chance counter resets back to 2.
						if (homeworkGrade >= 0 && homeworkGrade <= 100)
							chanceCounter = 2;
					}
					// If user has no chances left, notify them and ask them to restart the program.
					else {
						System.out.println("[ERR] You have retried 3 times. Please restart your program.");
						// Makes the chance counter zero so that the rest of the outputs don't execute.
						chanceCounter = 0;
						break;
					}
				}
				i++;
			}

    		// Asks for the midterm grade.
    		else if (i == 1 && chanceCounter != 0) {
    			// Stores the users input into corresponding variable.
				System.out.print("Enter your MIDTERM EXAM grade: ");
				midtermGrade = input.nextInt();

				// Enters loop if user input is out of range and checks how many chances the user has left.
				while (midtermGrade < 0 || midtermGrade > 100 && chanceCounter >= -1){
					// If the user still has chances left then ask to enter grade again.
					if (chanceCounter >= 0) {
						System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100]\n");
						System.out.printf("Enter your MIDTERM EXAM grade (%d chances left): ", chanceCounter);
						midtermGrade = input.nextInt();
						// Decreases the chance counter by 1.
						chanceCounter--;
						// If the user inputs a valid grade then the chance counter resets back to 2.
						if (midtermGrade >= 0 && midtermGrade <= 100)
							chanceCounter = 2;
					}
					// If user has no chances left, notify them and ask them to restart the program.
					else {
						System.out.println("[ERR] You have retried 3 times. Please restart your program.");
						// Makes the chance counter zero so that the rest of the outputs don't execute.
						chanceCounter = 0;
						break;
					}
				}
				i++;
			}

    		// Asks for the final exam grade.
    		else if (i == 2 && chanceCounter != 0) {
    			// Stores the users input into corresponding variable.
				System.out.print("Enter your FINAL EXAM grade: ");
				finalExamGrade = input.nextInt();

				// Enters loop if user input is out of range and checks how many chances the user has left.
				while (finalExamGrade < 0 || finalExamGrade > 200 && chanceCounter >= -1) {
					// If the user still has chances left then ask to enter the grade again.
					if (chanceCounter >= 0) {
						System.out.println("[ERR] Invalid input. A final grade should be in [0, 200]\n");
						System.out.printf("Enter your FINAL EXAM grade (%d chances left): ", chanceCounter);
						finalExamGrade = input.nextInt();
						// Decrease the chance counter by 1.
						chanceCounter--;
						// If the user inputs a valid grade then the chance counter resets back to 2.
						if (finalExamGrade >= 0 && finalExamGrade <= 200)
							chanceCounter = 2;
					}
					// If user has no chances left, notify them and ask them to restart the program.
					else {
						System.out.println("[ERR] You have retried 3 times. Please restart your program.");
						// Makes the chance counter zero so that the rest of the outputs don't execute.
						chanceCounter = 0;
						break;
					}
				}
				i++;
			}
		}

    	// Calculates the weighted total.
		weightedTotal = (homeworkGrade * 0.25) + (midtermGrade * 0.25) + ((finalExamGrade / 200) * 50);

    	// Checks to see if the user has used all of the chances.
		// If user has no chances left then these outputs will not execute.
    	if (chanceCounter != 0) {
    		// Prints users weighted total to 2 decimal points.
			System.out.printf("[INFO] Student's Weighted Total is %.2f\n", weightedTotal);

			// Checks to see if the user passed the class.
			if (weightedTotal >= 50)
				System.out.println("[INFO] Student PASSED the class.");
			else
				System.out.println("[INFO] Student FAILED the class.");
		}


    	input.close();

	}  // End of main.
}  // End of class.