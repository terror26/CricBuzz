package org.example.service;

import org.example.model.Player;
import org.example.model.PlayerType;

import java.util.*;

public class BallingController {

    Deque<Player> players = new ArrayDeque<>();

    Map<Player, Integer> maxOverBowled = new HashMap<>();

    public BallingController(List<Player> players) {
        for (Player player : players) {
            if (player.playerType.equals(PlayerType.BOWLER)) {
                this.players.add(player);
            }
        }
    }

    public Player getNextBowler() {
        Player bowler = null;
        while (players.size() > 0) {
            bowler = players.poll();
            System.out.println("bowler = " + bowler);
            if (maxOverBowled.get(bowler) != null && maxOverBowled.get(bowler) >= bowler.maxAllowedOvers) {
                continue;
            }
            maxOverBowled.put(bowler, maxOverBowled.getOrDefault(bowler, 0) + 1);
            players.addLast(bowler);
            break;
        }
        return bowler;
    }

    @Override
    public String toString() {
        return "BallingController{" +
                "players=" + Arrays.toString(players.toArray()) +
                ", maxOverBowled=" + maxOverBowled +
                '}';
    }
}

