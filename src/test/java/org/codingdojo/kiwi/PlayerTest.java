package org.codingdojo.kiwi;

import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {
    @Test
    public void player_has_15_points_after_win_the_ball_when_points_is_0() {
        Player player = new Player(0);
        player.winBall();
        assertThat(player.getPoints(), is(15));
    }

    @Test
    public void player_has_30_points_after_win_the_ball_when_points_is_15() {
        Player player = new Player(15);
        player.winBall();
        assertThat(player.getPoints(), is(30));
    }

    @Test
    public void player_has_40_points_after_win_the_ball_when_points_is_30() {
        Player player = new Player(30);
        player.winBall();
        assertThat(player.getPoints(), is(40));
    }

    @Test
    public void player_win_after_win_the_ball_when_points_is_40() {
        Player player = new Player(40);
        player.setOpponent(new Player(0));
        player.winBall();
        assertThat(player.isWinner(), is(true));
    }

    @Test
    public void player_get_advantage_after_win_the_ball_when_tied() {
        Player player = new Player(40);
        player.setOpponent(new Player(40));
        player.winBall();
        assertThat(player.hasAdvantage(), is(true));
    }

    @Test
    public void player_win_after_win_the_ball_if_has_advantage() {
        Player player = new Player(40);
        player.setOpponent(new Player(40));
        player.winBall();
        player.winBall();
        assertThat(player.isWinner(), is(true));
    }

    @Test
    public void player_get_deuce_after_win_the_ball_if_opponent_has_advantage() {
        Player player = new Player(40);
        Player opponent = new Player(40);
        player.setOpponent(opponent);
        opponent.setOpponent(player);
        opponent.getScore().winBall(opponent);
        player.winBall();
        assertThat(opponent.hasAdvantage(), is(false));
    }
}