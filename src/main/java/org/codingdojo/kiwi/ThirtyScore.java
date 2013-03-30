package org.codingdojo.kiwi;

public class ThirtyScore extends Score {
    public ThirtyScore() {
        super(30);
    }

    @Override
    public void winBall(Player player) {
        if (player.getOpponent().getPoints() == 40) {
            player.setScore(new DeuceFortyScore());
        } else {
            player.setScore(new LeadFortyScore());
        }
    }
}