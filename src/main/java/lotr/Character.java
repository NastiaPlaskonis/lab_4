package lotr;

import java.util.Random;

public abstract class Character {
    private static final Random random = new Random();
    private int power;
    private int hp;

    public Character(int power, int hp) {
        setPower(power);
        setHp(hp);
    }

    public boolean isNotDead() {
        return getHp() > 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public abstract void kick(Character a_target);

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = Math.max(0, power);
    }

    public static Random getRandom() {
        return random;
    }
}
