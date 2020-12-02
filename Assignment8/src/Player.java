// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 8
// Author      : Teodoro Salgado 1220358243
// Description : Instantiates a Player object with a name, an attack stat, and a block stat

public class Player {
    private String name;
    private double attackStat;
    private double blockStat;

    public Player(){

    }

    // Overloaded constructor initializes the objects name, attackStat, and blockStat
    public Player(String name, double attackStat, double blockStat){
        this.name = name;
        this.attackStat = attackStat;
        this.blockStat = blockStat;
    }

    // Returns the value stored in the objects name variable
    public String getName(){
        return this.name;
    }

    // Returns the value currently stored in the objects attackStat variable
    public double getAttackStat(){
        return this.attackStat;
    }

    // Stores the value passed in as the objects attackStat
    public void setAttackStat(double attackStat){
        this.attackStat = attackStat;
    }

    // Returns the value currently stored in the objects blockStat variable
    public double getBlockStat(){
        return this.blockStat;
    }

    // Stores the value passed in as the objects blockStat
    public void setBlockStat(double blockStat){
        this.blockStat = blockStat;
    }

    // Prints the objects name, attackStat, and blockStat variables
    public void printPlayerInfo(){
        System.out.printf("%s (attack = %.2f, block = %.2f)\n", this.name, this.attackStat, this.blockStat);
    }
}
