package fr.bforbank;


import fr.bforbank.Etities.Player;
import fr.bforbank.Exceptions.InsufficientInputException;
import fr.bforbank.dto.GameScore;
import fr.bforbank.services.ScoringService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;



public class ScoringServiceTests {

    @Test
    public void playerAWins() throws InsufficientInputException {
        //GIVEN
        Player playerA = new Player();
        Player playerB = new Player();

        char[] ballsWinners = {'A', 'B', 'A', 'B', 'A', 'A'};


        //WHEN
        List<GameScore> result = ScoringService.processScore(ballsWinners, playerA, playerB);

        //THEN
        Assertions.assertNotNull(result);
        Assertions.assertEquals(6, result.size());
        Assertions.assertEquals("15", result.get(0).getPointPlayerA(), "15");
        Assertions.assertEquals("0", result.get(0).getPointPlayerB(), "0");
        Assertions.assertEquals("15", result.get(1).getPointPlayerA(), "15");
        Assertions.assertEquals("15", result.get(1).getPointPlayerB(), "15");
        Assertions.assertEquals("30", result.get(2).getPointPlayerA(), "30");
        Assertions.assertEquals("15", result.get(2).getPointPlayerB(), "15");
        Assertions.assertEquals("30", result.get(3).getPointPlayerA(), "30");
        Assertions.assertEquals("30", result.get(3).getPointPlayerB(), "30");
        Assertions.assertEquals("40", result.get(4).getPointPlayerA(), "40");
        Assertions.assertEquals("30", result.get(4).getPointPlayerB(), "30");
        Assertions.assertEquals("GAME", result.get(5).getPointPlayerA(), "GAME");
        Assertions.assertEquals("30", result.get(5).getPointPlayerB(), "30");

    }

    @Test
    public void playerBWins() throws InsufficientInputException {
        //GIVEN
        Player playerA = new Player();
        Player playerB = new Player();

        char[] ballsWinners = {'A', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B', 'B'};

        //WHEN
        List<GameScore> result = ScoringService.processScore(ballsWinners, playerA, playerB);

        //THEN
        Assertions.assertNotNull(result);
        Assertions.assertEquals(10, result.size());
        Assertions.assertEquals("15", result.get(0).getPointPlayerA());
        Assertions.assertEquals("0", result.get(0).getPointPlayerB());
        Assertions.assertEquals("15", result.get(1).getPointPlayerA());
        Assertions.assertEquals("15", result.get(1).getPointPlayerB());
        Assertions.assertEquals("30", result.get(2).getPointPlayerA());
        Assertions.assertEquals("15", result.get(2).getPointPlayerB());
        Assertions.assertEquals("30", result.get(3).getPointPlayerA());
        Assertions.assertEquals("30", result.get(3).getPointPlayerB());
        Assertions.assertEquals("40", result.get(4).getPointPlayerA());
        Assertions.assertEquals("30", result.get(4).getPointPlayerB());
        Assertions.assertEquals("DEUCE", result.get(5).getPointPlayerA());
        Assertions.assertEquals("DEUCE", result.get(5).getPointPlayerB());
        Assertions.assertEquals("ADVANTAGE", result.get(6).getPointPlayerA());
        Assertions.assertEquals("DEUCE", result.get(6).getPointPlayerB());
        Assertions.assertEquals("DEUCE", result.get(7).getPointPlayerA());
        Assertions.assertEquals("DEUCE", result.get(7).getPointPlayerB());
        Assertions.assertEquals("DEUCE", result.get(8).getPointPlayerA());
        Assertions.assertEquals("ADVANTAGE", result.get(8).getPointPlayerB());
        Assertions.assertEquals("DEUCE", result.get(9).getPointPlayerA());
        Assertions.assertEquals("GAME", result.get(9).getPointPlayerB());
    }


    @Test
    public void InsufficientInput() {
        //GIVEN
        Player playerA = new Player();
        Player playerB = new Player();

        char[] ballsWinners = {'A', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B'};


        //WHEN
        InsufficientInputException thrown = Assertions.assertThrows(InsufficientInputException.class, () -> {
            ScoringService.processScore(ballsWinners, playerA, playerB);
        });

        //THEN

        Assertions.assertEquals("unable to identify a winner", thrown.getMessage());

    }
}
