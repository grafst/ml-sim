package ch.grafst.ml.game.boardgame.hexapawn;

import ch.grafst.ml.game.Player;

/**
 * A Piece in a HexapawnBoard Game
 */
public class Piece {
    private String name;
    private Player owner;

    public Piece(String name) {
        this.name = name;
    }

    public Piece() {

    }

    @Override
    public String toString() {
        if (name != "") {
            return name;
        } else return this.toString();
    }
}
