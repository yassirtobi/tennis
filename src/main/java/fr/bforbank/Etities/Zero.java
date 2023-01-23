package fr.bforbank.Etities;

public class Zero implements Point {
    @Override
    public void next(Player scoredPlayer, Player concededPlayer) {
        scoredPlayer.setPoint(new Fifteen());
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
        return "0";
    }
}
