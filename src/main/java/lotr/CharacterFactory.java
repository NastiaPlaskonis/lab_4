package lotr;

import java.util.Random;

public class CharacterFactory {

    public static Character createCharacter() {
        Random random = new Random();
        int someRandomNumber = random.nextInt(4);

        switch (someRandomNumber) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                throw new IllegalStateException("Unexpected value: " + someRandomNumber);
        }
    }
}