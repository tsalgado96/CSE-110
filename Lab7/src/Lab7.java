/*-------------------------------------------------------------
// AUTHOR: Teodoro Salgado
// FILENAME: Lab7.java
// SPECIFICATION: Lets user keep track of grade averages of different groups in the class
// FOR: CSE 110 - Lab #7
// TIME SPENT: 30 Minutes
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab7
{
    public static void main(String[] args)
    {
        /* Declare initial variables you need */
        Scanner scanner = new Scanner(System.in);

        /* Ask the user for the number of students */
        System.out.println("How many students do you have?");
        int numStudents = scanner.nextInt();

        /* Create two arrays: one for groups the other for grades */
        int[] studentGroups = null;
        double[] studentGrades = null;

        // >>>>> YOUR CODE HERE <<<<<
        studentGroups = new int[numStudents];
        studentGrades = new double[numStudents];


        /* A loop to fill up the array of */

        // >>>>> YOUR CODE HERE <<<<<
        for (int i = 0; i < numStudents; i++){
            System.out.println("[Group #] and [Grade] for Entry " + i);
            studentGroups[i] = scanner.nextInt();
            studentGrades[i] = scanner.nextDouble();
        }

        /* Print out the content of the two arrays as a list (from the back). */
        System.out.println("\n===== List of Student Records =====");

        // >>>>> YOUR CODE HERE <<<<<
        for (int i = numStudents - 1; i >= 0; i--) {
            System.out.printf("Group %d - %.2f Points\n", studentGroups[i], studentGrades[i]);
        }

        /* Print some statistics for each group. You must use the method "printStats" */
        System.out.println("\n===== Group Statistics =====");
        for (int i = 0; i < findTotalNumOfGroups(studentGroups); i++)
        {
            printStats(studentGroups, studentGrades, i + 1);
        }

        /* Clean up */
        scanner.close();
    }

    /**
     * Print out the count and average for targetGroup.
     *
     * @param groups      an array of all students' groups
     * @param grades      an array of all students' grades
     * @param targetGroup the target group
     */
    private static void printStats(int[] groups, double[] grades, int targetGroup)
    {
        int count = 0;
        double sum = 0;
        double average = 0;

        /* For each record in groups */
        for (int i = 0; i < groups.length; i++)
        {
            /* If we find a record matching targetGroup, update count and sum */

            // >>>>> YOUR CODE HERE <<<<<
            if (groups[i] == targetGroup) {
                count++;
                sum += grades[i];
            }
        }

        /* Update the average */

        // >>>>> YOUR CODE HERE <<<<<
        average = sum / count;

        /* Output */
        System.out.printf("Group #%d has %d student(s), the average is %.2f\n", targetGroup, count, average);
    }

    /**
     * Find out the total number of groups on record. Group numbers are assumed to
     * be a cumulative sequence starting from 1, e.g., [1, 2, 3, 4, 5]. Therefore,
     * the total number of groups is simply the maximum number on a record (array)
     * of group numbers.
     *
     * @param groups an array of group numbers
     * @return the total number of groups on the record
     */
    private static int findTotalNumOfGroups(int[] groups)
    {
        if (groups == null)
        {
            return 0;
        }

        int numGroups = 0;
        for (int i = 0; i < groups.length; i++)
        {
            if (groups[i] > numGroups)
            {
                numGroups = groups[i];
            }
        }
        return numGroups;
    }

}
