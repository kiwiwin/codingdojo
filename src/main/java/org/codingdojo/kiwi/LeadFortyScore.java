package org.codingdojo.kiwi;

class LeadFortyScore extends Score {
    protected LeadFortyScore() {
        super(40);
    }

    @Override
    public void winBall(Player player) {
        player.setWinner(true);
    }
}
