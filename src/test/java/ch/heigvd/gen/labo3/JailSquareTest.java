package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JailSquareTest {
    @Test
    void jailSquareShouldHaveAName() {
        String name = "JailSquare";

        Square square = new JailSquare(name);

        assertEquals(square.getName(), name);
    }

    @Test
    void netWorthHasNotChanged() {
        Board board = new Board();
        Die[] dices = new Die[2];
        Player player = new Player("Player", board, dices);

        String name = "Jail";
        Square square = new JailSquare(name);
        player.getPiece().setLocation(square);
        assertTrue(square.landedOn(player));
    }
}