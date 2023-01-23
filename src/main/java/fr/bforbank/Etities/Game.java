package fr.bforbank.Etities;

public class Game implements Point {
    @Override
    public void next(Player scoredPlayer, Player concededPlayer) {


    }

    @Override
    public boolean isGame() {
        return true;
    }

    @Override
    public boolean isForty() {
        return false;
    }

    @Override
    public boolean isAdvantage() {
        return false;
    }

    public String toString(){
        return "GAME";
    }
}
