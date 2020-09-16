// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 1
// Author      : Teodoro Salgado 1220358243
// Description :
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		// Declare and instantiate a Scanner
		Scanner input = new Scanner(System.in);

		// Declare and initialize variables
		int currentShares, purchasePrice, marketPrice, availableFunds;
		double totalBuyCost;

		// Prompt for and collect inputs
		System.out.print("Current Shares  : ");
		currentShares = input.nextInt();
		System.out.print("Purchase Price  : ");
		purchasePrice = input.nextInt();
		System.out.print("Market Price    : ");
		marketPrice = input.nextInt();
		System.out.print("Available Funds : ");
		availableFunds = input.nextInt();

		// Compute required values
		totalBuyCost = 10 + marketPrice *

		// Display required outputs

	}
}
