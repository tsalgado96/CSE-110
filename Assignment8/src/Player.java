// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>

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

    }
}
