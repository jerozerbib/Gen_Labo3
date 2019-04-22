package ch.heigvd.gen.labo3;

public class GoToJail extends Square{
    GoToJail(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        Jail jail = new Jail("jail");
        if (p.getPiece().getLocation() == this){
            p.getPiece().setLocation(jail);
        }
    }
}
