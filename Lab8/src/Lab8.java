/*-------------------------------------------------------------
//AUTHOR: Teodoro Salgado
//FILENAME: Lab8.java
//SPECIFICATION: Program prints out a calendar of the specified month and year that the user inputs
//FOR: CSE 110 - Lab #8
//TIME SPENT: 30 Minutes
//-----------------------------------------------------------*/

import java.time.LocalDate;
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /* Ask the user for month/year */
        System.out.println("Which month/year would you like to look up the calendar?\n(ex. 11 2020)");
        int month = scan.nextInt(), day = 1, year = scan.nextInt();

        /* Get the weekday and # of months of the given month/year */
        int numOfDays = getNumOfDays(month, year);
        int weekDay = getWeekDayOf(month, day, year);

        /* Create a 2D array with enough space for at least 30 days */
        String[][] calendar = null;

        // >>>>> YOUR CODE HERE <<<<<
        int dashes, row;

        // Determines the number of dashes needed to initialize the calendar based on
        // what week day the month starts on
        switch (weekDay){
            case 1:
                dashes = 0;
                break;
            case 2:
                dashes = 1;
                break;
            case 3:
                dashes = 2;
                break;
            case 4:
                dashes = 3;
                break;
            case 5:
                dashes = 4;
                break;
            case 6:
                dashes = 5;
                break;
            case 7:
                dashes = 6;
                break;
            default:
                dashes = 0;
                break;
        }

        // If the number of days plus the number of dashes is greater than 35
        // then initialize the array with 6 rows
        if (dashes + numOfDays > 35){
            calendar = new String[6][7];
            row = 6;
        }

        // Otherwise initialize the array with 5 rows
        else {
            calendar = new String[5][7];
            row = 5;
        }

        /* Initialize the content of calendar by "-" */

        // >>>>> YOUR CODE HERE <<<<<
        for (int i = 0; i < dashes; i++){
            calendar[0][i] = "-";
        }

        /*
         * Fill in the 2D array by the calendar in November 2020 You need to align
         * weekdays with indices in your 2D array. The first index of a row of week is
         * Sunday and the last is Saturday.
         */

        // >>>>> YOUR CODE HERE <<<<<
        // Keeps track of the day number
        int dayNumber = 1;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < 7; j++){
                // Since part of the array may already be initialized by "-"
                // Start initializing the array at the point where it has not yet been initialized
                if (calendar[i][j] == null){
                    // Will only fill in day numbers up until the number of days in that month
                    if (dayNumber <= numOfDays){
                        calendar[i][j] = Integer.toString(dayNumber);
                        dayNumber++;
                    }
                    // Will fill remaining array slots with "-"
                    else {
                        calendar[i][j] = "-";
                    }
                }
            }
        }

        /**
         * Print out the calendar
         */
        System.out.println();
        System.out.printf("     The Calendar for %2d/%4d\n", month, year);
        System.out.printf("-----------------------------\n");
        System.out.printf("  Su  Mo  Tu  We  Th  Fr  Sa\n");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < 7; j++){
                System.out.printf("%4s", calendar[i][j]);
            }
            System.out.println();
        }

        scan.close();
    }

    /**
     * Get the weekday of a given date. This method follow the convention in the US
     * where the week begins with Sunday.
     *
     * @param date
     * @return the weekday of date in integer (1 is Sunday, 7 is Saturday)
     */
    private static int getWeekDayOf(int month, int day, int year){
        LocalDate date = LocalDate.of(year, month, day); // ISO
        int val = date.getDayOfWeek().getValue() + 1;
        return val == 8 ? val - 7 : val;
    }

    /**
     * Get the length of a given month in year.
     *
     * @param month
     * @param year
     * @return the length of month in year
     */
    private static int getNumOfDays(int month, int year){
        return LocalDate.of(year, month, 1).lengthOfMonth();
    }
}
