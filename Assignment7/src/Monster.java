// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 7
// Author      : Teodoro Salgado 1220358243
// Description : Creates a Monster object with a name, a health score, and a weapon

public class Monster {
    // Declares instance variables
    private String name;
    private int healthScore;
    private Weapon weapon;

    public Monster(){

    }

    // Overloaded constructor initializes the objects name, healthScore and weapon
    public Monster(String name, int healthScore, Weapon weapon){
        this.name = name;
        this.healthScore = healthScore;
        this.weapon = weapon;
    }

    // Returns a copy of the value currently stored in the objects name variable
    public String getName(){
        return this.name;
    }

    // Returns a copy of the value currently stored in the objects healthScore variable
    public int getHealthScore(){
        return this.healthScore;
    }

    // Returns a copy of the value currently stored in the objects weapon variable
    // Calls the getName() method from the Weapon class
    public String getWeaponName(){
        return this.weapon.getName();
    }

    // Picks a random int between 0 and the attacking monsters maxDamage
    // Subtracts that damage from the attacked monster and sets a new healthScore
    // Returns how much damage was inflicted
    public int attack(Monster monster){
        int damage = (int)(Math.random() * this.weapon.getMaxDamage());
        monster.healthScore = monster.getHealthScore() - damage;
        return damage;
    }
}
