package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ball {
    Player bowledBy;
    Player playedBy;

    int wicket;
    public int run;

    List<ScoreCard> observers = new ArrayList<>();

    public Ball(Player bowledBy, Player playedBy, ScoreCard battlingScoreCard, ScoreCard bowlingScoreCard) {
        this.bowledBy = bowledBy;
        this.playedBy = playedBy;
        observers.add(battlingScoreCard);
        observers.add(bowlingScoreCard);
    }

    public void playBall() {
        int random = (int) (Math.random() * 6);
        if (random < 2) {
            // consider out just for sake of it;
            wicket = 1;
        } else {
            run = random;
        }
        System.out.println("Batsman = " + playedBy.playerName + " batted the ball by" + bowledBy.playerName + " with run = " + run + " wicket = " + wicket);
        update();
    }


    public void update() {
        for (ScoreCard scoreCard : observers) {
            scoreCard.update(this);
        }
    }

    @Override
    public String toString() {
        return "Ball{" +
                "bowledBy=" + bowledBy +
                ", playedBy=" + playedBy +
                ", wicket=" + wicket +
                ", run=" + run +
                '}';
    }
}
