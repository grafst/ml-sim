package ch.grafst.ml.game.boardgame.hexapawn;

/**
 * The legendary Pawn of chess
 */
public class Pawn extends Piece {
    private PawnColor pawnColor;
    public Pawn(String name, PawnColor pawnColor) {
        super(name);
        this.pawnColor=pawnColor;
    }

    @Override
    public String toString() {
        return super.toString()+" (Pawn)";
    }
}
