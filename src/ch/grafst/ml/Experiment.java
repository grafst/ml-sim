package ch.grafst.ml;

import ch.grafst.ml.game.Game;
import ch.grafst.ml.game.Player;
import ch.grafst.ml.game.TurnMaster;
import ch.grafst.ml.game.playable;
import ch.grafst.ml.machine.Machine;

import java.util.HashMap;

/**
 * Created by Stephan Graf on 22.12.2017.
 */
public class Experiment {
    private TurnMaster<Player> players;
    private playable game;
    private Machine machine;
    public Experiment(TurnMaster<Player> players, Game game, Machine machine){
        this.players=players;
        this.game=game;
        this.machine=machine;
        machine.programmStates(game.getStates);
        org.apache.commons.lang.time.StopWatch stopWatch= new stopWatch();
    }
    public HashMap<Player,Integer> run(int iterations){
        for (int i = 0; i < iterations; i++) {
            while(!match.finished()){

            }
        }
    }
}
