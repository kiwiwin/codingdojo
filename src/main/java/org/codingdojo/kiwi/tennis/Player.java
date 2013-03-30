package org.codingdojo.kiwi.tennis;

public class Player {
    private Boolean isWinner;
    private Player opponent;
    private Boolean hasAdvantage;
    private Score score;

    public Player(Score score) {
        setWinner(false);
        setHasAdvantage(false);
        setScore(score);
    }

    public int getPoints() {
        return score.getPoints();
    }

    public Boolean isWinner() {
        return getWinner();
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public Boolean hasAdvantage() {
        return getHasAdvantage();
    }

    public Boolean getWinner() {
        return isWinner;
    }

    public void setWinner(Boolean winner) {
        isWinner = winner;
    }

    public Player getOpponent() {
        return opponent;
    }

    public Boolean getHasAdvantage() {
        return hasAdvantage;
    }

    public void setHasAdvantage(Boolean hasAdvantage) {
        this.hasAdvantage = hasAdvantage;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public void winBall() {
        score.winBall(this);
    }
}
