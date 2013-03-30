package org.codingdojo.kiwi;

public class FifteenScore extends Score {
    public FifteenScore() {
        super(15);
    }

    @Override
    public void winBall(Player player) {
        player.setScore(new ThirtyScore());
    }
}
