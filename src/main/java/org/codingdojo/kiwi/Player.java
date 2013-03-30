package org.codingdojo.kiwi;

public class Player {
    private int points;
    private Boolean isWinner;
    private Player opponent;
    private Boolean hasAdvantage;
    private Score score;

    public Player(int points) {
        this.setPoints(points);
        setWinner(false);
        setHasAdvantage(false);
    }

    public int getPoints() {
        return points;
    }

    public void lostAdvantage() {
        this.setHasAdvantage(false);
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

    public void setPoints(int points) {
        this.points = points;
        this.setScore(Score.createScore(points));
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
