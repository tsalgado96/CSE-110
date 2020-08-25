/*------------------------------------------------------------
// AUTHOR: Teodoro Salgado
// FILENAME: Lab2.java
// SPECIFICATION: DESCRIPTION OF THIS FILE
// FOR: CSE 110 - Lab #2
// TIME SPENT: 45 Minutes
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        // Declares variables of different types
        String firstName, lastName, fullName;
        int nameLength;

        Scanner input = new Scanner(System.in);

        // Use Scanner to ask the user for first name
        System.out.print("Please enter first name: ");
        firstName = input.nextLine();
        // Use Scanner to ask user for last name
        System.out.print("Please enter last name: ");
        lastName = input.nextLine();

        // Adds first name to last name and coverts to upper case
        fullName = (firstName + " " + lastName).toUpperCase();
        // Finds the length of the full name and stores it
        nameLength = fullName.length();

        // Prints the full name in upper case
        System.out.println("Full name (in capitals): " + fullName);
        // Prints the length of the name
        System.out.println("Length of full name: " + nameLength);

        // Define two String variables, title1 and title2 using String constructor to initialize them
        String title1 = new String("cse110");
        String title2 = "cse110";

        // Compare the two strings and print which one of the two ways works
        if (title1 == title2){
            System.out.println("String comparison using \"==\" sign works");
        } else {
            System.out.println("String comparison using \"==\" sign does NOT work");
        }

        if (title1.equals(title2)){
            System.out.println("String comparison using \"equals\" method works");
        } else {
            System.out.println("String comparison using \"equals\" method does NOT work");
        }

        input.close();
    } // End main method
} // End Lab2 class