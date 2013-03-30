package org.codingdojo.kiwi;

abstract class Score {
    private final int points;

    public static Score createScore(int points) {
        if (points == 0) {
            return new ZeroScore();
        } else if (points == 15) {
            return new FifteenScore();
        } else if (points == 30) {
            return new ThirtyScore();
        } else if (points == 40) {
            return new FortyScore();
        } else {
            throw new RuntimeException("Invalid Score Type");
        }
    }

    protected Score(int points) {
        this.points = points;
    }

    public abstract void winBall(Player player);
}
