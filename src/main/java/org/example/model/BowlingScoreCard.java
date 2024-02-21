package org.example.model;

public class BowlingScoreCard implements ScoreCard {
    int wickets;
    int totalBalls;
    @Override
    public void update(Ball ball) {
        this.wickets += ball.wicket;
        this.totalBalls++;
    }
}
