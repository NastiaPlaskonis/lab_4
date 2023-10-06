package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        System.out.println("'cries'");
    }

    @Override
    public String toString() {
        return String.format("%s{hp=%d, power=%d}", getClass().getSimpleName(), getHp(), getPower());
    }
}