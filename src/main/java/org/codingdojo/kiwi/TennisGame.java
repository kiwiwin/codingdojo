package org.codingdojo.kiwi;

import java.util.*;

public class TennisGame {
    private Player playerA;
    private Player playerB;

    public static void main(String[] args) {
        TennisGame game = new TennisGame();
        while (!game.isFinish()) {
            Scanner scanner = new Scanner(System.in);
            game.winBall(scanner.next());
        }
    }

    public TennisGame() {
        this.playerA = new Player(0);
        this.playerB = new Player(0);
        playerA.setOpponent(playerB);
        playerB.setOpponent(playerA);
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void winBall(String ballWinner) {
        if (ballWinner.equals("A")) {
            playerA.winBall();
        } else {
            playerB.winBall();
        }
    }

    public boolean isFinish() {
        return playerA.isWinner() || playerB.isWinner();
    }
}
