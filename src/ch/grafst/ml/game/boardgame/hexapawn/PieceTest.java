package ch.grafst.ml.game.boardgame.hexapawn;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Stephan Graf on 22.12.2017.
 */
class PieceTest {
    @Test
    void toStringShouldReturnName() {
        String name="test1";
        Piece piece = new Piece("test1");
        assertEquals(name,piece.toString());
        assertNotEquals("",piece.toString());
    }
    void PieceWithoutNameShouldPrintObjectID(){
        Piece piece = new Piece("");
        assertEquals(piece.toString());
        assertNotEquals("",piece.toString());
    }

}