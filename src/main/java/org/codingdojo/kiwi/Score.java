package org.codingdojo.kiwi;

abstract class Score {
    private final int points;

    protected Score(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public abstract void winBall(Player player);
}
