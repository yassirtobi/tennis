package fr.bforbank.controller;

import fr.bforbank.Etities.Player;
import fr.bforbank.Exceptions.InsufficientInputException;
import fr.bforbank.dto.GameScore;
import fr.bforbank.services.ScoringService;

import java.util.List;

public class ScoringController {


    public static void processScore(String ballsWinners) {
        Player playerA = new Player();
        Player playerB = new Player();

        try {
            List<GameScore> gameScoreHistory = ScoringService.processScore(ballsWinners.toCharArray(), playerA, playerB);
            announceScore(gameScoreHistory);
        } catch (InsufficientInputException e) {
            System.out.println("insufficient input");
        }
    }

    public static void announceScore(List<GameScore> gameScoreHistory) {

        gameScoreHistory.forEach(
                gameScore -> {
                    if ("GAME".equals(gameScore.getPointPlayerA())) {
                        System.out.println("Player A wins the game");
                    } else if ("GAME".equals(gameScore.getPointPlayerB())) {
                        System.out.println("Player B wins the game");
                    } else {
                        System.out.printf("Player A : %s / Player B : %s%n", gameScore.getPointPlayerA(), gameScore.getPointPlayerB());

                    }
                }
        );

    }
}
