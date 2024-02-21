package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Innings {
    Team batting;
    Team bowling;
    List<Over> overs = new ArrayList<>();
    private Integer totalOvers;

    public Innings(Team a, Team b, int totalOvers) {
        this.batting = a;
        this.bowling = b;
        this.totalOvers = totalOvers;
    }

    public void startInnings() {
        batting.battlingController.selectBatsmen();
        Player striker;
        try {
            for (int i = 0; i < totalOvers; i++) {
                Player nextBowler = bowling.ballingController.getNextBowler();
                striker = batting.battlingController.striker;
                Over over = new Over(striker, nextBowler, striker.battingScoreCard, nextBowler.bowlingScoreCard, i, batting.battlingController);
                over.startOver();
                overs.add(i, over);
            }
        } catch (NullPointerException e ) { // team finished
            System.out.println("batting Scorecard = ");
            for(Player player: batting.playing11) {
                System.out.println(player.playerName +" : "+ player.battingScoreCard);
            }
        }
    }
}
