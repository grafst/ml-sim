package ch.grafst.ml.game;

import ch.grafst.ml.machine.GameState;

import java.util.HashMap;

/**
 * Created by X201 on 22.12.2017.
 */
public interface playable {
    Boolean finished=false;
    public HashMap<Player,Integer> getResults();
    public GameState getState();
    public ArrayList<Moves> getAllPossibleMoves();
}
