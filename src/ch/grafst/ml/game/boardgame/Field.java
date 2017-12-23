package ch.grafst.ml.game.boardgame;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by Stephan Graf on 22.12.2017.
 * A Field in a Game
 */
public class Field {
    private final Point2D position;

    public Field(int x, int y) {
        this. position = new Point(x,y);
    }
}
