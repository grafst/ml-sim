package ch.grafst.ml.game.boardgame.hexapawn;


import ch.grafst.ml.game.Match;
import ch.grafst.ml.game.Player;
import ch.grafst.ml.game.boardgame.BoardGame;
import ch.grafst.ml.game.playable;
import ch.grafst.ml.machine.GameState;

import java.awt.geom.Point2D;


/**
 * Created by Stephan Graf on 22.12.2017.
 * Mini Chess
 * The board is 3x3. There are two Players, white starts whit thre pawns at the bottom row and black with thre pawns at
 * the top row. White begins. The pawns can move straight and kill diagonally. The winner is who ever reaches
 * the oposite end first with one of his pawns. There is now draw. Blacks wins every time when played optimally.
 * http://www.chessvariants.com/small.dir/hexapawn.html
 */
public class Hexapawn extends BoardGame implements playable {

    public Hexapawn() {
        HexapawnBoard board = new HexapawnBoard();
        Player player1=new Player();
        Player player2=new Player();
        Pawn white1 = new Pawn("white1", player1);
        Pawn white2 = new Pawn("white2", player1);
        Pawn white3 = new Pawn("white3", player1);
        Pawn black1 = new Pawn("black1", player2);
        Pawn black2 = new Pawn("black2", player2);
        Pawn black3 = new Pawn("black3", player2);
        board.place(white1, new Point2D(0, 0));
        board.place(white2, new Point2D(0, 0));
        board.place(white3, new Point2D(0, 0));
        board.place(black1, new Point2D(0, 0));
        board.place(black2, new Point2D(0, 0));
        board.place(black3, new Point2D(0, 0));
    }
    public Match start(){
        return new Match();
    }


    @Override
    public GameState getState() {
        return null;
    }


    @Override
    public ArrayList<Moves> getAllPossibleMoves() {
        return null;
    }
}