package lotr;

public class Knight extends Character {

    public Knight() {
        super(generateRandomValue(2, 12), generateRandomValue(2, 12));
    }

    private static int generateRandomValue(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void kick(Character target) {
        
    }
}