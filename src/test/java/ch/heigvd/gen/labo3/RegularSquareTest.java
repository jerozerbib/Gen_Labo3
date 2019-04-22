package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegularSquareTest {
    @Test
    void regularSquareShouldHaveAName() {
        String name = "RegularSquare";

        Square square = new RegularSquare(name);

        assertEquals(square.getName(), name);
    }

    @Test
    void regularSquareIsLandedOn(){
        Board board = new Board();
        Die[] dices = new Die[2];
        Player player = new Player("Player", board, dices);

        String name = "IncomeTax";
        Square square = new IncomeTaxSquare(name);
        player.getPiece().setLocation(square);
        assertTrue(square.landedOn(player));
    }

}
