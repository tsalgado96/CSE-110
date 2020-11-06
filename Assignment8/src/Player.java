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

    public Player(String name, double attackStat, double blockStat){
        this.name = name;
        this.attackStat = attackStat;
        this.blockStat = blockStat;
    }

    public String getName(){
        return this.name;
    }

    public double getAttackStat(){
        return this.attackStat;
    }

    public void setAttackStat(double attackStat){
        this.attackStat = attackStat;
    }

    public double getBlockStat(){
        return this.blockStat;
    }

    public void setBlockStat(double blockStat){
        this.blockStat = blockStat;
    }

    public void printPlayerInfo(){
        //System.out.println(this.name + " (attack = " + this.attackStat + ", block = " + this.blockStat + ")");
        System.out.printf("%s (attack = %.2f, block = %.2f)\n", this.name, this.attackStat, this.blockStat);
    }
}
