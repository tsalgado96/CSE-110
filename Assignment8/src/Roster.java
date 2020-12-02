// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 8
// Author      : Teodoro Salgado 1220358243
// Description : Creates an ArrayList of Player objects to manage a roster of players

import java.io.*;
import java.util.*;

public class Roster {
    private ArrayList<Player> players;

    public Roster(){
        players = new ArrayList<>();
    }

    // Constructor initializes objects from a text file
    public Roster(String fileName){
        players = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File(fileName));

            // Loop will cycle through all the "words" in the text file
            while (input.hasNext()){
                // Concatenates the first and last names
                String name = input.next();
                name += " " + input.next();
                double attackStat = input.nextDouble();
                double blockStat = input.nextDouble();
                // Creates a new Player object and stores it in the players ArrayList
                players.add(new Player(name, attackStat, blockStat));
            }
        }
        catch (IOException e) {
            System.out.println("IO Exception " + e);
        }

    }

    // Instantiates a new Player object and adds it to the players ArrayList
    public void addPlayer(String name, double attackStat, double blockStat){
        players.add(new Player(name, attackStat, blockStat));
    }

    // Returns how many Player objects are in the ArrayList players
    public int countPlayers(){
        return players.size();
    }

    public Player getPlayerByName(String name){
        // Loops through the player ArrayList and returns true if there is a Player object that has the arguments name
        // Otherwise will return false
        for (Player player : players){
            if (name.equals(player.getName())){
                return player;
            }
        }
        return null;
    }

    public void printTopAttackers(){
        // Initializes the top attacker as the first item in the players ArrayList
        Player topAttacker1 = players.get(0);
        Player topAttacker2 = players.get(0);
        // Iterates through the players ArrayList and sets the stop attacker as topAttacker1
        for (Player player : players){
            if (player.getAttackStat() > topAttacker1.getAttackStat()){
                topAttacker1 = player;
            }
        }

        // If topAttacker1 is the first item in the players ArrayList then topAttacker2 will be
        // initialized with the second item
        if (topAttacker1 == players.get(0)){
            topAttacker2 = players.get(1);
        }
        // Iterates through the players ArrayList and sets the stop attacker as topAttacker2
        for (Player player : players){
            if (player != topAttacker1){
                if (player.getAttackStat() > topAttacker2.getAttackStat()){
                    topAttacker2 = player;
                }
            }
        }
        topAttacker1.printPlayerInfo();
        topAttacker2.printPlayerInfo();
    }

    public void printTopBlockers(){
        // Initializes the top blocker as the first item in the players ArrayList
        Player topBlocker1 = players.get(0);
        Player topBlocker2 = players.get(0);
        // Iterates through the players ArrayList and sets the stop blocker as topBlocker1
        for (Player player : players){
            if (player.getBlockStat() > topBlocker1.getBlockStat()){
                topBlocker1 = player;
            }
        }

        // If topBlocker1 is the first item in the players ArrayList then topBlocker2 will be
        // initialized with the second item
        if (topBlocker1 == players.get(0)){
            topBlocker2 = players.get(1);
        }
        // Iterates through the players ArrayList and sets the stop attacker as topBlocker2
        for (Player player : players){
            if (player != topBlocker1){
                if (player.getBlockStat() > topBlocker2.getBlockStat()){
                    topBlocker2 = player;
                }
            }
        }
        topBlocker1.printPlayerInfo();
        topBlocker2.printPlayerInfo();
    }

    // Iterates through the players ArrayList and prints each one
    public void printAllPlayers(){
        for (Player player : players){
            player.printPlayerInfo();
        }
    }
}
