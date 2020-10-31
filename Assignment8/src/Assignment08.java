// !!! Make no changes to this .java file !!!
import java.io.*;
import java.util.Scanner;

class Assignment08 {
    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Roster roster = new Roster();

        int menuChoice = 0;

        while (menuChoice != 8) {
            displayMenu();
            menuChoice = getMenuChoice();

            if      (menuChoice == 1)
                roster = openRosterFile();
            else if (menuChoice == 2)
                listAllPlayers(roster);
            else if (menuChoice == 3)
                listTopAttackers(roster);
            else if (menuChoice == 4)
                listTopBlockers(roster);
            else if (menuChoice == 5)
                addPlayer(roster);
            else if (menuChoice == 6)
                changePlayerStats(roster);
            else if (menuChoice == 7)
                countPlayers(roster);
            else if (menuChoice == 8)
                System.out.println("===== Quitting Program =====");
            else
                System.out.println("  !!! Invalid Menu Choice !!!");
        }
    }

    static void displayMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Open a roster file");
        System.out.println("2. List all players");
        System.out.println("3. List top attackers");
        System.out.println("4. List top blockers");
        System.out.println("5. Add a player");
        System.out.println("6. Change a player's stats");
        System.out.println("7. Count players");
        System.out.println("8. Quit program");
    }

    static int getMenuChoice() {
        System.out.print("Enter your menu Choice --> ");
        return scnr.nextInt();
    }

    static Roster openRosterFile() throws IOException {
        System.out.print("Enter roster file name --> ");
        String fileName = scnr.next();

        return new Roster(fileName);
    }

    static void listAllPlayers(Roster roster) {
        System.out.println("===== All Players =====");
        roster.printAllPlayers();
    }

    static void listTopAttackers(Roster roster) {
        System.out.println("===== Top Attackers =====");
        roster.printTopAttackers();
    }

    static void listTopBlockers(Roster roster) {
        System.out.println("===== Top Blockers =====");
        roster.printTopBlockers();
    }

    static void addPlayer(Roster roster) {
        String fullName = getPlayerName();
        double attackStat = getAttackStat();
        double blockStat = getBlockStat();

        roster.addPlayer(fullName, attackStat, blockStat);
    }

    static void changePlayerStats(Roster roster) {
        String fullName = getPlayerName();

        Player playerToUpdate = roster.getPlayerByName(fullName);

        if (playerToUpdate != null) {
            double newAttackStat = getAttackStat();
            double newBlockStat = getBlockStat();

            playerToUpdate.setAttackStat(newAttackStat);
            playerToUpdate.setBlockStat(newBlockStat);
        } else {
            System.out.printf("  !!! No player with the name %s found !!!\n", fullName);
        }
    }

    static void countPlayers(Roster roster) {
        System.out.printf("There are %d players on this roster.\n", roster.countPlayers());
    }

    static String getPlayerName() {
        System.out.print("Enter new player first name  --> ");
        String firstName = scnr.next();
        System.out.print("Enter new player last name   --> ");
        String lastName = scnr.next();

        return firstName + " " + lastName;
    }

    static double getAttackStat() {
        System.out.print("Enter player's new attack stat --> ");
        return scnr.nextDouble();
    }

    static double getBlockStat() {
        System.out.print("Enter player's new block stat  --> ");
        return scnr.nextDouble();
    }
}