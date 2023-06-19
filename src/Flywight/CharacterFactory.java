package Flywight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, CharacterStyle> stylePool = new HashMap<>();

    public CharacterStyle getStyle(String font, int size, String color) {
        String key = font + size + color;

        if(stylePool.containsKey(key)) {
            System.out.println("Same key detected");
            return stylePool.get(key);
        } else {
            CharacterStyle style = new CharacterStyle(font, size, color);
            System.out.println("Key created: " + key);
            stylePool.put(key, style);
            return style;
        }
    }
}
