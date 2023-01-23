package fr.bforbank.Etities;

public class Forty implements Point {
    @Override
    public void next(Player scoredPlayer, Player concededPlayer) {

        scoredPlayer.setPoint(new Game());
    }

    @Override
    public boolean isGame() {
        return false;
    }

    @Override
    public boolean isForty() {
        return true;
    }

    @Override
    public boolean isAdvantage() {
        return false;
    }

    public String toString(){
        return "40";
    }
}
