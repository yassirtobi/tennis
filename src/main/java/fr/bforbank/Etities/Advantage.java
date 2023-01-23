package fr.bforbank.Etities;

public class Advantage implements Point {
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
        return false;
    }


    @Override
    public boolean isAdvantage() {
        return true;
    }

    public String toString(){
        return "ADVANTAGE";
    }
}
