package org.example.model;

import org.example.service.BallingController;
import org.example.service.BattlingController;

import java.util.ArrayList;
import java.util.List;

public class Team {

    List<Player> playing11 = new ArrayList<>();
    BattlingController battlingController;
    BallingController ballingController;
    public Team(String pName, Integer maxOvers) {
        for(int i = 0;i<5;i++) {
            playing11.add(new Player(pName+"-"+(i) , PlayerType.BATTER, maxOvers, new BattingScoreCard(), new BowlingScoreCard()));
        }
        for(int i = 5;i<=11;i++) { // remaining are bowlers
            playing11.add(new Player(pName+"-"+(i) , PlayerType.BOWLER , maxOvers, new BattingScoreCard(), new BowlingScoreCard()));
        }
        battlingController = new BattlingController(playing11);
        ballingController = new BallingController(playing11);
    }
}
