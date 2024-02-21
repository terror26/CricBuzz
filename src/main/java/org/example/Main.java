package org.example;

import org.example.model.Innings;
import org.example.model.Match;
import org.example.model.Team;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        new Main().driver();
    }

    private void driver() {
        Team A = new Team("INDIA", 10);
        Team B = new Team("PAKISTAN", 10);
        Match match = new Match(A,B);
        match.innings = new Innings[2];

        match.innings[0] = new Innings(A,B,10); // maxOver
        match.innings[0].startInnings();
        match.innings[1] = new Innings(B,A,10);
        match.innings[1].startInnings();
    }
}