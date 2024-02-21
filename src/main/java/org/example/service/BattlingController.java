package org.example.service;

import org.example.model.Player;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BattlingController {
    Deque<Player> remainingPlayers;
    public Player striker;
    public Player nonStriker;


    public BattlingController(List<Player> remainingPlayers) {
        this.remainingPlayers = new ArrayDeque<>(remainingPlayers);
    }

    public Player selectBatsmen() {
        if (canAssignBatsmen() && striker == null) {
            striker = remainingPlayers.pop();
        }
        if (canAssignBatsmen() && nonStriker == null) {
            nonStriker = remainingPlayers.pop();
        }
        return striker;
    }

    private boolean canAssignBatsmen() {
        if (remainingPlayers.size() == 0) {
            return false;
        }
        return true;
    }
}
