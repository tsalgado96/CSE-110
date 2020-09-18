// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 1
// Author      : Teodoro Salgado 1220358243
// Description :
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		/* DECLARE AND INSTANTIATE A SCANNER */
		Scanner input = new Scanner(System.in);

		/* DECLARE AND INITIALIZE VARIABLES */
		double currentShares, purchasePrice, marketPrice, availableFunds,
				numberOfSharesToBuy, perShareBuyValue, totalBuyValue,
				numberOfSharesToSell, perShareSellValue, totalSellValue,
				transactionFee = 10;

		/* PROMPT FOR AND COLLECT INPUTS */
		System.out.print("Current Shares  : ");
		currentShares = input.nextInt();
		System.out.print("Purchase Price  : ");
		purchasePrice = input.nextInt();
		System.out.print("Market Price    : ");
		marketPrice = input.nextInt();
		System.out.print("Available Funds : ");
		availableFunds = input.nextInt();
		System.out.println();

		/* COMPUTE REQUIRED VALUES */
		// Buy values
		perShareBuyValue = purchasePrice - marketPrice;
		numberOfSharesToBuy = Math.floor((availableFunds - transactionFee) / marketPrice);
		totalBuyValue = perShareBuyValue * numberOfSharesToBuy;

		// Sell values
		perShareSellValue = marketPrice - purchasePrice;
		totalSellValue = perShareSellValue * currentShares;
		numberOfSharesToSell = Math.floor(totalSellValue / perShareSellValue);


		/* DISPLAY REQUIRED OUTPUTS */
		// Sell or hold shares if purchase price is less than market price
		if (purchasePrice < marketPrice){
			if (totalSellValue > 10){
				System.out.printf("Sell %d shares\n", (int)numberOfSharesToSell);
			}
			else {
				System.out.println("Hold shares");
			}
		}

		// Buy or hold shares if purchase price is greater than market price
		else if (purchasePrice > marketPrice) {
			if (totalBuyValue > 10) {
				System.out.printf("Buy %d shares\n", (int)numberOfSharesToBuy);
			}
			else {
				System.out.println("Hold shares");
			}
		}

		// Hold shares if purchase price and market price are equal
		else {
			System.out.println("Hold shares");
		}

	} // End of main
} // End of class
