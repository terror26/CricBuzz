package org.example.model;

public class Match {
    Team A;
    Team B;
    public Innings[] innings = new Innings[2]; // for now 2 innings only

    public Match(Team a, Team b) {
        this.A = a;
        this.B = b;
    }
}
