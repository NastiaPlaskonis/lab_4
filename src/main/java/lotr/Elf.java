package lotr;

public class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character target) {
        if (getPower() < target.getPower()) {
            minusPower();
        } else {
            target.setHp(0);
        }
    }

    private void minusPower() {
        setPower(Math.max(0, getPower() - 1));
    }

    @Override
    public String toString() {
        return String.format("%s{hp=%d, power=%d}", getClass().getSimpleName(), getHp(), getPower());
    }
}
