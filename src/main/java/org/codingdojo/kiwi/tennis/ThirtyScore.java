package org.codingdojo.kiwi.tennis;

public class ThirtyScore extends Score {
    @Override
    public String toString() {
        return String.valueOf(getPoints());
    }

    public ThirtyScore() {
        super(30);
    }

    @Override
    public void winBall(Player player) {
        Player opponent = player.getOpponent();
        if (opponent.getPoints() == 40) {
            player.setScore(new DeuceFortyScore());
            opponent.setScore(new DeuceFortyScore());
        } else {
            player.setScore(new LeadFortyScore());
        }
    }
}