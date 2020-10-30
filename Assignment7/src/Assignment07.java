// !!! MAKE NO CHANGES TO THIS FILE !!!
import java.util.Scanner;
public class Assignment07 {
    private static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        // instantiate 2 Weapon objects
        Weapon weapon1 = new Weapon("Atomic Fire Breath", 100);
        Weapon weapon2 = new Weapon("Thunderbolt", 50);
        // instantiate 2 Monster objects
        Monster monster1 = new Monster("Godzilla", 100, weapon1);
        Monster monster2 = new Monster("Pikachu", 200, weapon2);
        // we start with round 1 of the fight
        int round = 1;
        // battle continues in rounds until one (or both ) monster have a health the is <= 0
        while (monster1.getHealthScore() > 0 && monster2.getHealthScore() > 0) {
            int damage1 = monster1.attack(monster2); // first monster attacks second monster
            int damage2 = monster2.attack(monster1); // second monster attacks first monster
            // report the results for this round
            System.out.println("========================================");
            System.out.println("Round #" + round);
            System.out.println("----------------------------------------");

            System.out.println(monster1.getName() + " attacks " + monster2.getName() +
                    " with " + monster1.getWeaponName() +
                    ", doing " + damage1 + " points of damage.");

            System.out.println(monster2.getName() + " attacks " + monster1.getName() +
                    " with " + monster2.getWeaponName() +
                    ", doing " + damage2 + " points of damage.");
            System.out.println("----------------------------------------");
            System.out.println(monster1.getName() + " Health = " + monster1.getHealthScore());
            System.out.println(monster2.getName() + " Health = " + monster2.getHealthScore());
            // pause before advancing to the next round
            System.out.print("\nPress ENTER to continue...");
            scnr.nextLine();
            // advance to the next round
            round += 1;
        }
        // we made it out of the loop because one (or both ) monster have a health the is <= 0
        // now we must determine the winner (if there is one)
        String winner = "No Monster";

        if (monster1.getHealthScore() > 0) {
            winner = monster1.getName();
        }
        if (monster2.getHealthScore() > 0) {
            winner = monster2.getName();
        }
        // report the winner
        System.out.println("The winner is " + winner + "!");
    }
}