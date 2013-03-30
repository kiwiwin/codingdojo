package org.codingdojo.kiwi;

public class FortyScore extends Score {
    @Override
    public void winBall(Player player) {
        if (player.getOpponent().getPoints() < 40) {
            player.setWinner(true);
            return;
        }

        if (player.hasAdvantage()) {
            player.setWinner(true);
            return;
        }

        if (player.getOpponent().hasAdvantage()) {
            player.getOpponent().lostAdvantage();
        } else {
            player.setHasAdvantage(true);
        }
    }

    public FortyScore() {
        super(40);
    }
}
