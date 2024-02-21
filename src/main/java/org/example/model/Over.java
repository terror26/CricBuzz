package org.example.model;

import org.example.service.BattlingController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Over {
    List<Ball> balls = new ArrayList<>();
    int overNumber;

    Player striker;
    Player bowler;

    ScoreCard bowlingScoreCard;
    ScoreCard battingScoreCard;
    BattlingController battlingController;

    public Over(Player striker, Player bowler, ScoreCard bowlingScoreCard, ScoreCard battingScoreCard, int overNumber, BattlingController battlingController) {
        this.striker = striker;
        this.bowler = bowler;
        this.overNumber = overNumber;
        this.bowlingScoreCard = bowlingScoreCard;
        this.battingScoreCard = battingScoreCard;
        this.battlingController =battlingController;
    }

    public void startOver() {
        for(int i = 0;i<6;i++) {
            Ball ball = new Ball( bowler, striker, battingScoreCard, bowlingScoreCard);
            ball.playBall();
            if(ball.wicket == 1) {
                System.out.println(striker.playerName +" is out");
                battlingController.striker = null;
                striker = battlingController.selectBatsmen();
            }
            balls.add(ball);
        }
    }
}
