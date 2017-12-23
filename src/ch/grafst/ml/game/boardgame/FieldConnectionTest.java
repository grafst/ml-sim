package ch.grafst.ml.game.boardgame;

import java.awt.geom.Point2D;
import java.util.Random;

/**
 * @author Stephan Graf
 * @since 2017-12-21
 */
class FieldConnectionTest {
    public void OneStepInEachDirectionShouldResultAtOrigin(){
        Random random = new Random();
        int x=random.nextInt(20);
        int y=random.nextInt(20);
        Point2D origin=new Point2D.Double(x,y);
        Point2D current=origin;
        //todo: finish

    }
}