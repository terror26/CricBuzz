package org.example.model;

public class Player {

    String playerName;
    public PlayerType playerType;
    ScoreCard battingScoreCard;
    ScoreCard bowlingScoreCard;

    public Integer maxAllowedOvers;

    public Player(String playerName, PlayerType playerType,Integer maxAllowedOvers, ScoreCard battingScoreCard, ScoreCard bowlingScoreCard) {
        this.playerName = playerName;
        this.playerType = playerType;
        this.maxAllowedOvers = maxAllowedOvers;
        this.battingScoreCard = battingScoreCard;
        this.bowlingScoreCard = bowlingScoreCard;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerType=" + playerType +
                '}';
    }
}
