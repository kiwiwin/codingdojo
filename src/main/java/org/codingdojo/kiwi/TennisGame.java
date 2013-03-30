package org.codingdojo.kiwi;

import java.util.*;

public class TennisGame {
    private Player seed;
    private Player challenger;

    public static void main(String[] args) {
        TennisGame game = createGame();
        while (!game.isFinish()) {
            Scanner scanner = new Scanner(System.in);
            game.winBall(scanner.next());
        }
    }

    public static TennisGame createGame() {
        Player seed = new Player(new ZeroScore());
        Player challenger = new Player(new ZeroScore());
        return new TennisGame(seed, challenger);
    }

    public TennisGame(Player seed, Player challenger) {
        this.seed = seed;
        this.challenger = challenger;
        seed.setOpponent(challenger);
        challenger.setOpponent(seed);
    }

    public void winBall(String ballWinner) {
        if (ballWinner.equals("Seed")) {
            seed.winBall();
        } else if (ballWinner.equals("Challenger")) {
            challenger.winBall();
        } else {
            throw new IllegalArgumentException("Invalid Player");
        }
    }

    public boolean isFinish() {
        return seed.isWinner() || challenger.isWinner();
    }
}