// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 4
// Author      : Teodoro Salgado 1220358243
// Description : A guessing game that provides feedback to the user on how accurate their guess is
import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declares counter variables
        int numberOfGuesses = 0, amountMatched;
        // Declares user inputs and the random number as a string
        String randomNumber, usersGuess = "", keepPlaying;
        // Boolean variable to check if user would like to keep playing
        boolean playAgain = true;

        // Main while loop that displays and plays the guessing game
        while (playAgain) {
            System.out.println("----- MASTERMIND -----");
            System.out.println("Guess the 4 digit number!");
            System.out.println();
            // Initializes a new random number for each new game
            randomNumber = String.valueOf((int)(Math.random() * 10000));

            // Loops while the users guess is not equal to the random number
            while (!usersGuess.equals(randomNumber)){
                // Increments the number of guesses the user has taken
                numberOfGuesses++;
                // Initializes/resets the amount of digits matched at the beginning of each loop pass through
                amountMatched = 0;
                // Asks the user to input a guess and displays what number guess they are on
                System.out.printf("Guess %d: ", numberOfGuesses);
                usersGuess = input.nextLine();

                // Compares the users guess and random number at each corresponding digit
                // and increments the amount of digits matched if they are equal
                for (int i = 0; i < randomNumber.length(); i++){
                    if (usersGuess.charAt(i) == randomNumber.charAt(i)) {
                        amountMatched++;
                    }
                }
                // Displays how many numbers the user matched to the random number
                System.out.printf("You matched %d\n\n", amountMatched);
            }

            // Displays to the user how many guesses it took them to guess the right number
            System.out.printf("Congratulations! You guessed the right number in %d guesses.\n", numberOfGuesses);

            // Asks the user if they would like to play again until a valid input of yes or no
            do {
                System.out.print("Would you like to play again (yes/no)? ");
                System.out.println();
                keepPlaying = input.nextLine().toLowerCase();
            } while (!keepPlaying.equals("yes") && !keepPlaying.equals("no"));

            // Resets all variables for a new game
            usersGuess = "";
            numberOfGuesses = 0;

            // Makes the main while loop conditional false if user inputs no and will break out of the loop
            if (keepPlaying.equals("no"))
                playAgain = false;
        }

    } // End main
} // End class