package org.example.model;

public class BattingScoreCard implements ScoreCard {
    public int runs;
    int ballsPlayed;

    public BattingScoreCard() {
    }

    @Override
    public void update(Ball ball) {
        this.runs += ball.run;
        this.ballsPlayed++;
        System.out.println("total run = " + this.runs);
    }

    @Override
    public String toString() {
        return "BattingScoreCard{" +
                "runs=" + runs +
                ", ballsPlayed=" + ballsPlayed +
                '}';
    }
}
