package Flywight;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        Character character1 = new Character('A', 10, 20, characterFactory.getStyle("Arial", 12, "Red"));
        Character character2 = new Character('B', 15, 30, characterFactory.getStyle("Arial", 12, "Red"));

        character1.render();
        character2.render();
    }
}
