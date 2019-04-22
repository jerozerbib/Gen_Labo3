package ch.heigvd.gen.labo3;

public class RegularSquare extends Square{


    RegularSquare(String name) {
        super(name);
    }

    @Override
    public boolean landedOn(Player p) {
        return p.getPiece().getLocation() == this;
    }


}
