package lotr;

public class King extends Character {

    public King() {
        super(generateRandomValue(5, 15), generateRandomValue(5, 15));
    }

    private static int generateRandomValue(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void kick(Character target) {
        
    }
}
