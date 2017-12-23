package ch.grafst.ml.game.boardgame.hexapawn;

import java.awt.*;

/**
 * Like in Chess the pawns come in two different Colors
 */
public enum PawnColor {
    BLACK(Color.black),
    WHITE(Color.white);
    private final Color color;
    PawnColor(Color color){
        this.color=color;
    }
}
