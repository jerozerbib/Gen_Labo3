package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {
    @Test
    void incomeTaxSquareShouldHaveAName() {
        String name = "IncomeTaxSquare";

        Square square = new IncomeTaxSquare(name);

        assertEquals(square.getName(), name);
    }

    @Test
    void incomeTaxSquareIsLandedOn() {
        Board board = new Board();
        Die[] dices = new Die[2];
        Player player = new Player("Player", board, dices);

        String name = "IncomeTax";
        Square square = new IncomeTaxSquare(name);
        player.getPiece().setLocation(square);
        assertTrue(square.landedOn(player));

    }


    @Test
    void cashIsReduced(){
        Board board = new Board();
        Die[] dices = new Die[2];
        Player player = new Player("Player", board, dices);
        int w = player.getNetWorth();

        String name = "IncomeTax";
        Square square = new IncomeTaxSquare(name);
        player.getPiece().setLocation(square);
        square.landedOn(player);

        assertTrue(w > player.getNetWorth());

    }

    @Test
    void cashIsReducedBy200(){
        Board board = new Board();
        Die[] dices = new Die[2];
        Player player = new Player("Player", board, dices);

        // Adds the cash of a player by 1500.
        // As the initial cash of a player is set at 1500, Income Tax should come at a price of 200
        player.addCash(1500);
        int w = player.getNetWorth();

        String name = "IncomeTax";
        Square square = new IncomeTaxSquare(name);
        player.getPiece().setLocation(square);
        square.landedOn(player);


        System.out.println(w / 10);
        assertEquals(player.getNetWorth() + 200, w);
    }

    @Test
    void cashIsReducedBy150(){
        Board board = new Board();
        Die[] dices = new Die[2];
        Player player = new Player("Player", board, dices);

        // As the initial cash of a player is set at 1500, Income Tax should come at a price of 150
        int w = player.getNetWorth();

        String name = "IncomeTax";
        Square square = new IncomeTaxSquare(name);
        player.getPiece().setLocation(square);
        square.landedOn(player);

        assertEquals(player.getNetWorth() + 150, w);
    }

}