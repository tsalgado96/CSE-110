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

    public Roster(String fileName){
        players = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File(fileName));

            while (input.hasNext()){
                String name = input.next();
                name += " " + input.next();
                double attackStat = input.nextDouble();
                double blockStat = input.nextDouble();
                players.add(new Player(name, attackStat, blockStat));
            }
        }
        catch (IOException e) {
            System.out.println("IO Exception " + e);
        }

    }

    public void addPlayer(String name, double attackStat, double blockStat){
        players.add(new Player(name, attackStat, blockStat));
    }

    public int countPlayers(){
        return players.size();
    }

    public Player getPlayerByName(String name){
        for (Player player : players){
            if (name.equals(player.getName())){
                return player;
            }
        }
        return null;
    }

    public void printTopAttackers(){
        Player topAttacker1 = players.get(0);
        Player topAttacker2 = players.get(0);
        for (Player player : players){
            if (player.getAttackStat() > topAttacker1.getAttackStat()){
                topAttacker1 = player;
            }
        }

        if (topAttacker1 == players.get(0)){
            topAttacker2 = players.get(1);
        }
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
        Player topBlocker1 = players.get(0);
        Player topBlocker2 = players.get(0);
        for (Player player : players){
            if (player.getBlockStat() > topBlocker1.getBlockStat()){
                topBlocker1 = player;
            }
        }

        if (topBlocker1 == players.get(0)){
            topBlocker2 = players.get(1);
        }
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

    public void printAllPlayers(){
        for (Player player : players){
            player.printPlayerInfo();
        }
    }
}
