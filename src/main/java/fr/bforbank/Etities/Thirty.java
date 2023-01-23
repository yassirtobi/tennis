package fr.bforbank.Etities;

public class Thirty implements Point {
    @Override
    public void next(Player scoredPlayer, Player concededPlayer) {

        if (concededPlayer.getPoint().isForty()) {
            scoredPlayer.setPoint(new Deuce());
            concededPlayer.setPoint(new Deuce());
        } else {
            scoredPlayer.setPoint(new Forty());

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
        return "30";
    }
}
