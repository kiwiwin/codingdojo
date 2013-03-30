package org.codingdojo.kiwi.tennis;

class LeadFortyScore extends Score {
    @Override
    public String toString() {
        return String.valueOf(getPoints());
    }

    protected LeadFortyScore() {
        super(40);
    }

    @Override
    public void winBall(Player player) {
        player.setWinner(true);
    }
}
