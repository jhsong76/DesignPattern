package Flywight;

public class Character {
    private char symbol;
    private int positionX;
    private int positionY;
    private CharacterStyle style;

    public Character(char symbol, int positionX, int positionY, CharacterStyle style) {
        this.symbol = symbol;
        this.positionX = positionX;
        this.positionY = positionY;
        this.style = style;
    }

    public void render() {
        System.out.println("Symbol: " + symbol + ", Position:(" + positionX + "," + positionY + ")" +
                " Font: " + style.getFont() + " Size: " + style.getSize() + ", Color: " + style.getColor());
    }
}
