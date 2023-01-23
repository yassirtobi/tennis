package fr.bforbank.services;


import fr.bforbank.Etities.Player;
import fr.bforbank.Exceptions.InsufficientInputException;
import fr.bforbank.dto.GameScore;

import java.util.ArrayList;
import java.util.List;

public class ScoringService {
    public static List<GameScore> processScore(char[] ballsWinner, Player playerA, Player playerB) throws InsufficientInputException {

        List<GameScore> gameScoreHistory = new ArrayList<>();

        for (char ballWinner : ballsWinner) {

            switch (ballWinner) {
                case 'A' -> playerA.wonTheBall(playerB);
                case 'B' -> playerB.wonTheBall(playerA);
                default -> throw new RuntimeException("Unknown player");
            }

            gameScoreHistory.add(
                    GameScore.builder()
                            .pointPlayerA(playerA.getPoint().toString())
                            .pointPlayerB(playerB.getPoint().toString())
                            .build()
            );

            if (playerA.getPoint().isGame() || playerB.getPoint().isGame()) {
                return gameScoreHistory;
            }
        }

        throw new InsufficientInputException("unable to identify a winner");
    }


}