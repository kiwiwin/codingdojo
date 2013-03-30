package org.codingdojo.kiwi;

import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TennisGameTest {
    @Test
    public void two_players_begin_with_0_points() {
        TennisGame game = new TennisGame();
        assertThat(game.getPlayerA().getPoints(), is(0));
        assertThat(game.getPlayerB().getPoints(), is(0));
    }

    @Test
    public void A_win_ball_when_input_is_A() {
        TennisGame game = new TennisGame();
        game.winBall("A");
        assertThat(game.getPlayerA().getPoints(), is(15));
    }

    @Test
    public void B_win_ball_when_input_is_B() {
        TennisGame game = new TennisGame();
        game.winBall("B");
        assertThat(game.getPlayerB().getPoints(), is(15));
    }

    @Test
    public void game_finish_when_one_player_win_the_game() {
        TennisGame game = new TennisGame();
        game.winBall("A");
        game.winBall("A");
        game.winBall("A");
        game.winBall("A");
        assertThat(game.isFinish(), is(true));
    }
}
