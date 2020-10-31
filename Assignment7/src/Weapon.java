// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 7
// Author      : Teodoro Salgado 1220358243
// Description :

public class Weapon {
    private String name;
    private int maxDamage;

    public Weapon(){
        this.name = "Pointy Stick";
        this.maxDamage = 1;
    }

    public Weapon(String name, int maxDamage){
        this.name = name;
        this.maxDamage = maxDamage;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMaxDamage(){
        return this.maxDamage;
    }

    public void setMaxDamage(int maxDamage){
        this.maxDamage = maxDamage;
    }
}
