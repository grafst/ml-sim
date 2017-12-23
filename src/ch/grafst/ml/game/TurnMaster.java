package ch.grafst.ml.game;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


/**
 * Manages whose turn it is in the Game
 */
public class TurnMaster {
    private Player current;
    private HashMap<Player, Player> turnRules=new HashMap<>();


    public TurnMaster(ArrayList<Player> players) {
        Player first;
        Iterator<Player> iterator = players.iterator();
        current=iterator.next();
        first=current;
        this.current=first;
        Player next;
        while (iterator.hasNext()) {
            next=iterator.next();
            turnRules.put(current, next);
            current=next;
        }
        turnRules.put(current, first);
    }

    public Player next() {
        return turnRules.get(current);
    }
}