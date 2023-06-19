package Flywight;

public class CharacterStyle {
    private String font;
    private int size;
    private String color;

    public CharacterStyle(String font, int size, String color){
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
