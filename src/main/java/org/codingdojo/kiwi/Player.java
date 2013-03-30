package org.codingdojo.kiwi;

public class Player {
    private int points;
    private Boolean isWinner;
    private Player opponent;
    private Boolean hasAdvantage;

    public Player(int points) {
        this.points = points;
        isWinner = false;
        hasAdvantage = false;
    }

    public int getPoints() {
        return points;
    }

    public void winBall() {
        if (points == 0) {
            points = 15;
        } else if (points == 15) {
            points = 30;
        } else if (points == 30) {
            points = 40;
        } else if (points == 40) {
            if (opponent.hasAdvantage()) {
                opponent.lostAdvantage();
            } else {
                if (hasAdvantage) {
                    isWinner = true;
                } else if (opponent.getPoints() == 40) {
                    hasAdvantage = true;
                } else {
                    isWinner = true;
                }
            }
        }
    }

    private void lostAdvantage() {
        this.hasAdvantage = false;
    }

    public Boolean isWinner() {
        return isWinner;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public Boolean hasAdvantage() {
        return hasAdvantage;
    }
}
