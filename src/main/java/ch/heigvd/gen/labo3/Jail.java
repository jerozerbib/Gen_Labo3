package ch.heigvd.gen.labo3;

public class Jail extends Square{

    Jail (String name){
        super(name);
    }

    @Override
    public boolean landedOn(Player p) {
        return p.getPiece().getLocation() == this;
    }
}
