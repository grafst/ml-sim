package ch.grafst.ml.game.boardgame.hexapawn;
import ch.grafst.ml.game.boardgame.Board;
import java.awt.geom.Point2D;
/**
 * The Hexapawn-board looks like this:
 *
 *     1 2 3
 *  0 |p|p|p|
 *  1 | | | |
 *  2 |p|p|p|
 *
 */
public class HexapawnBoard extends Board {
    private Piece[][] board;
    private Piece[][] startState;
    public HexapawnBoard(){
        for (int i = 0; i < ; i++) {

        }
    }
    public void initialize(){
        board=startState;
    }
    public HexapawnBoard(Piece piece, Point2D position){
        board[]
        board[position.getX()][position.getY()]=piece;
    }
}
