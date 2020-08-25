// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {

		// Declares variables for user inputs.
		double lengthOfRoad;
		int numOfLanes, depthOfAsphalt, daysToComplete;

		// Declares variables for outputs.
		double truckloadsOfAsphalt, numOfConduits, crewMembers, costOfAsphalt, costOfStoplights, costOfConduits, costOfLabor, totalCost;
		int numOfStoplights, numOfIntersections;

		Scanner input = new Scanner(System.in);

		System.out.print("Length of road project (miles) : ");
		lengthOfRoad = input.nextDouble();
		System.out.print("Number of lanes                : ");
		numOfLanes = input.nextInt();
		System.out.print("Depth of asphalt (inches)      : ");
		depthOfAsphalt = input.nextInt();
		System.out.print("Days to complete project       : ");
		daysToComplete = input.nextInt();

		// Calculates the truckloads of asphalt needed.
		//truckloadsOfAsphalt = Math.ceil(((numOfLanes * 12) * ((depthOfAsphalt/12.0) * 150) * (lengthOfRoad * 5280)) / 10000);
		truckloadsOfAsphalt = Math.ceil((numOfLanes * depthOfAsphalt * lengthOfRoad * 9504000) / 120000);

		// Calculates the number of stoplights needed.
		numOfIntersections = (int)lengthOfRoad;
		numOfStoplights = numOfIntersections * (2 + numOfLanes);

		// Calculates the number of conduit pipes needed.
		numOfConduits = Math.ceil((lengthOfRoad * 5280) / 24);

		// Calculates the number of crew members needed.
		crewMembers = Math.ceil((50 * lengthOfRoad * numOfLanes) / daysToComplete);

		// Calculates the cost of asphalt.
		costOfAsphalt = truckloadsOfAsphalt * 1000;

		// Calculates the cost of stoplights.
		costOfStoplights = numOfStoplights * 25000;

		// Calculates the cost of conduit pipes.
		costOfConduits = numOfConduits * 500;

		// Calculates the cost of labor.
		costOfLabor = crewMembers * 25 * 8 * daysToComplete;

		// Calculates the total cost of the project.
		totalCost = costOfAsphalt + costOfStoplights + costOfConduits + costOfLabor;

		// Prints out the amount of materials needed and related costs.
		System.out.println("=== Amount of materials needed ===");
		System.out.println("Truckloads of Asphalt : " + (int)truckloadsOfAsphalt);
		System.out.println("Stoplights            : " + numOfStoplights);
		System.out.println("Conduit pipes         : " + (int)numOfConduits);
		System.out.println("Crew members needed   : " + (int)crewMembers);
		System.out.println("=== Cost of Materials ============");
		System.out.printf("Cost of Asphalt       : $%.2f\n", costOfAsphalt);
		System.out.printf("Cost of Stoplights    : $%.2f\n", costOfStoplights);
		System.out.printf("Cost of Conduit pipes : $%.2f\n", costOfConduits);
		System.out.printf("Cost of Labor         : $%.2f\n", costOfLabor);
		System.out.println("=== Total Cost of Project ========");
		System.out.printf("Total cost of project : $%.2f\n", totalCost);

		input.close();
	}
}