package org.codingdojo.kiwi;

public class ThirtyScore extends Score {
    @Override
    public void winBall(Player player) {
        player.setPoints(40);
    }

    public ThirtyScore() {
        super(30);
    }
}
