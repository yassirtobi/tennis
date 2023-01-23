package fr.bforbank.Etities;

public interface Point {

     void next(Player scoredPlayer, Player concededPlayer);
     boolean isGame();
     boolean isForty();
     boolean isAdvantage();

}
