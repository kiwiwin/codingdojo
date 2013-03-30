package org.codingdojo.kiwi;

public class FifteenScore extends Score {
    @Override
    public void winBall(Player player) {
        player.setPoints(30);
    }

    public FifteenScore() {
        super(15);
    }
}
