package lotr;

public class Demo {
    public static void main(String[] args) {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();

        System.out.println("Character 1: " + character1);
        System.out.println("Character 2: " + character2);

        GameManager.fight(character1, character2);
    }
}