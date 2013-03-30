package org.codingdojo.kiwi.tennis;

class AdvantageFortyScore extends Score {
    protected AdvantageFortyScore() {
        super(40);
    }

    @Override
    public String toString() {
        return "AD";
    }

    @Override
    public void winBall(Player player) {
        player.setWinner(true);
    }
}
