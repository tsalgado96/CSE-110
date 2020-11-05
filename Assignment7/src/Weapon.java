// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 7
// Author      : Teodoro Salgado 1220358243
// Description : Creates a Weapon object with a name and a max damage, to be used by the Monster class

public class Weapon {
    // Declares instance variables
    private String name;
    private int maxDamage;

    // Default constructor initializes the objects name variable to "Pointy Stick" and maxDamage to 1
    public Weapon(){
        this.name = "Pointy Stick";
        this.maxDamage = 1;
    }

    // Overloaded constructor initializes the objects name and maxDamage variables with the variables
    // passed in as parameters
    public Weapon(String name, int maxDamage){
        this.name = name;
        this.maxDamage = maxDamage;
    }

    // Returns a copy of the value currently stored in the objects name variable
    public String getName(){
        return this.name;
    }

    // Assigns the value passed in as an argument to the objects name variable
    public void setName(String name){
        this.name = name;
    }

    // Returns a copy of the value currently stored in the objects maxDamage variable
    public int getMaxDamage(){
        return this.maxDamage;
    }

    // Assigns the value passed in as an argument to the objects maxDamage variable
    public void setMaxDamage(int maxDamage){
        this.maxDamage = maxDamage;
    }
}
