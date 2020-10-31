// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 7
// Author      : Teodoro Salgado 1220358243
// Description :

public class Monster {
    private String name;
    private int healthScore;
    private Weapon weapon;

    public Monster(){

    }

    public Monster(String name, int healthScore, Weapon weapon){
        this.name = name;
        this.healthScore = healthScore;
        this.weapon = weapon;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthScore(){
        return this.healthScore;
    }

    public String getWeaponName(){
        return this.weapon.getName();
    }

    public int attack(Monster monster){
        int damage = (int)(Math.random()*this.weapon.getMaxDamage());
        monster.healthScore = monster.getHealthScore() - damage;
        return damage;
    }
}
