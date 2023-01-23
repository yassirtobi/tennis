package fr.bforbank.Etities;

public class Deuce implements Point {
    @Override
    public void next(Player scoredPlayer, Player concededPlayer) {
        if (concededPlayer.getPoint().isAdvantage()) {
            scoredPlayer.setPoint(new Deuce());
            concededPlayer.setPoint(new Deuce());
        } else {
            scoredPlayer.setPoint(new Advantage());
        }

    }

    @Override
    public boolean isGame() {
        return false;
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
        return "DEUCE";
    }
}
