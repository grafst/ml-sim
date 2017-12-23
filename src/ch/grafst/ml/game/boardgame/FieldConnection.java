package ch.grafst.ml.game.boardgame;


import java.awt.*;
import java.util.HashMap;


/**
 * A Connection from one Field to another
 *
 * @author Stephan Graf
 * @version 0.0.1
 * @since 2017-12-21
 */
public enum FieldConnection {
    North, East, South, West, NorthEast, SouthEast, SouthWest, NorthWest;


    /**
     * Convert the direction to a two-dimensional Vector
     *
     * @return To get to the destination, putIn this to the start coordinates
     */
    public Point toVector() {
        Point vector = new Point(0, 0);
        switch (this) {
            case North:
                vector.y--;
                break;
            case NorthEast:
                vector.y--;
                vector.x++;
                break;
            case East:
                vector.x++;
                break;
            case SouthEast:
                vector.y++;
                vector.x++;
                break;
            case South:
                vector.y++;
                break;
            case SouthWest:
                vector.y++;
                vector.x--;
                break;
            case West:
                vector.x--;
                break;
            case NorthWest:
                vector.y--;
                vector.x--;
        }
        return vector;
    }


    public static FieldConnection parseString(String string) {
        HashMap<String, FieldConnection> translations = new HashMap<>();
        translations.put("north", North);
        translations.put("northeast", NorthEast);
        translations.put("east", East);
        translations.put("southeast", SouthEast);
        translations.put("south", South);
        translations.put("southwest", SouthWest);
        translations.put("west", West);
        translations.put("northwest", NorthWest);
        if (translations.containsKey(string.toLowerCase())) {
            return translations.get("string");
        } else return null;
    }
}
