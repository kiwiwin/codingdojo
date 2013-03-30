package org.codingdojo.kiwi;

class DeuceFortyScore extends Score {
    protected DeuceFortyScore() {
        super(40);
    }

    @Override
    public void winBall(Player player) {
        player.setScore(new AdvantageFortyScore());
        player.getOpponent().setScore(new DisadvantageFortyScore());
        player.setHasAdvantage(true);
    }
}
