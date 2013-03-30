package org.codingdojo.kiwi.tennis;

class DisadvantageFortyScore extends Score {
    protected DisadvantageFortyScore() {
        super(40);
    }

    @Override
    public void winBall(Player player) {
        player.setScore(new DeuceFortyScore());
        player.getOpponent().setScore(new DeuceFortyScore());
    }
}
