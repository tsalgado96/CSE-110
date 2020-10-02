// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 4
// Author      : Teodoro Salgado 1220358243
// Description : A guessing game that provides feedback to the user on how accurate their guess is
import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfGuesses, amountMatched;
        String randomNumber, usersGuess, keepPlaying;
        boolean playAgain = true;

        numberOfGuesses = 0;
        usersGuess = "";

        while (playAgain) {
            System.out.println("----- MASTERMIND -----");
            System.out.println("Guess the 4 digit number!");
            System.out.println();
            randomNumber = String.valueOf((int)(Math.random() * 10000));
            System.out.println(randomNumber);

            while (!usersGuess.equals(randomNumber)){
                numberOfGuesses++;
                amountMatched = 0;
                System.out.printf("Guess %d: ", numberOfGuesses);
                usersGuess = input.nextLine();

                for (int i = 0; i < randomNumber.length(); i++){
                    if (usersGuess.charAt(i) == randomNumber.charAt(i)) {
                        amountMatched++;
                    }
                }
                System.out.printf("You matched %d\n\n", amountMatched);
            }

            System.out.printf("Congratulations! You guessed the right number in %d guesses.\n", numberOfGuesses);
            System.out.print("Would you like to play again (yes/no)? ");
            System.out.println();
            keepPlaying = input.nextLine();

            // Resets all variables for a new game
            usersGuess = "";
            numberOfGuesses = 0;

            if (keepPlaying.equals("no"))
                playAgain = false;
        }

    }
}