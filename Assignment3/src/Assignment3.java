// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 3
// Author      : Teodoro Salgado 1220358243
// Description : Program takes user inputs of share prices and determines whether to sell, buy, or hold
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
		currentShares = input.nextDouble();
		System.out.print("Purchase Price  : ");
		purchasePrice = input.nextDouble();
		System.out.print("Market Price    : ");
		marketPrice = input.nextDouble();
		System.out.print("Available Funds : ");
		availableFunds = input.nextDouble();
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
			// Sell shares if transaction is profitable after transaction fee
			if (totalSellValue > 10){
				System.out.printf("Sell %d shares\n", (int)numberOfSharesToSell);
			}
			// Otherwise hold shares
			else {
				System.out.println("Hold shares");
			}
		}

		// Buy or hold shares if purchase price is greater than market price
		else if (purchasePrice > marketPrice) {
			// Buy shares if value of the transaction is greater than the transaction fee
			if (totalBuyValue > 10) {
				System.out.printf("Buy %d shares\n", (int)numberOfSharesToBuy);
			}
			// Otherwise hold shares
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

