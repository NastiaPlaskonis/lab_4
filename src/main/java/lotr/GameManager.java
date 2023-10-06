package lotr;

public class GameManager {

    public static void fight(Character enemy, Character victim) {
        if (enemy.getPower() == victim.getPower()) {
            System.out.println("Those two are living in peace");
            return;
        }

        while (enemy.isNotDead() && victim.isNotDead()) {
            kickMethod(enemy, victim);
            if (victim.isNotDead()) {
                kickMethod(victim, enemy);
            }
        }

        winnerIs(enemy, victim);
    }

    private static void kickMethod(Character enemy, Character victim) {
        System.out.println(victim + " was kicked by " + enemy);
        enemy.kick(victim);
        System.out.println(victim + ": " + victim);
    }

    private static void winnerIs(Character character1, Character character2) {
        if (character1.isNotDead()) {
            System.out.println("Player " + character1 + " is the winner");
        } else if (character2.isNotDead()) {
            System.out.println("Player " + character2 + " is the winner");
        }
    }
}