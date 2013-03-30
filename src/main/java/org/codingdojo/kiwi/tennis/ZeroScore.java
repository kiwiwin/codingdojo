package org.codingdojo.kiwi.tennis;

public class ZeroScore extends Score {
    public ZeroScore() {
        super(0);
    }

    @Override
    public String toString() {
        return String.valueOf(getPoints());
    }

    @Override
    public void winBall(Player player) {
        player.setScore(new FifteenScore());
    }
}
