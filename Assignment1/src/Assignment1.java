// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 1
// Author      : Teodoro Salgado 1220358243
// Description : The user inputs values and the program outputs corresponding values based on a set of rules.
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declares variables for inputs.
		int numPizza, numSlices, numAdult, numChild;
		// Declares variables for outputs.
		int totalNumSlices, totalNumSlicesAdult, totalNumSlicesChild, totalGivenToChild, slicesLeftOver;

		// Asks user to input all necessary information.
		System.out.print("Number of pizzas purchased : ");
		numPizza = input.nextInt();

		System.out.print("Number of slices per pizza : ");
		numSlices = input.nextInt();

		System.out.print("Number of adults           : ");
		numAdult = input.nextInt();

		System.out.print("Number of children         : ");
		numChild = input.nextInt();

		// Calculates total number of slices.
		totalNumSlices = numPizza * numSlices;
		// Calculates total number of slices given to adults.
		totalNumSlicesAdult = numAdult * 2;
		// Calculates total number of slices available to children.
		totalNumSlicesChild = totalNumSlices - totalNumSlicesAdult;
		// Calculates number of slices each child will get.
		totalGivenToChild = totalNumSlicesChild / numChild;
		// Calculates number of slices left over.
		slicesLeftOver = totalNumSlicesChild % numChild;


		// Prints the results.
		System.out.println("Total number of slices of pizza               : " + totalNumSlices);
		System.out.println("Total number of slices given to adults        : " + totalNumSlicesAdult);
		System.out.println("Total number of slices available for children : " + totalNumSlicesChild);
		System.out.println("Number of slices each child will get          : " + totalGivenToChild);
		System.out.println("Number of slices left over                    : " + slicesLeftOver);

		input.close();
	}
}