package ch.grafst.ml.game;


import java.util.ArrayList;


/**
 * A Match results in a Win, a Lose, a Draw or it goes on forever
 * After finishing every player of the match gets a score.
 */
public class Match {
    private TurnMaster turnMaster;

    public Match(ArrayList<Player> players) {
        turnMaster=new TurnMaster(players);
    }


    public void play() {

    }
}