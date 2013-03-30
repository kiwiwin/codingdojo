package org.codingdojo.kiwi;

import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {
    @Test
    public void player_has_15_points_after_win_the_ball_when_points_is_0() {
        Player player = new Player(new ZeroScore());
        player.winBall();
        assertThat(player.getScore(), instanceOf(FifteenScore.class));
    }

    @Test
    public void player_has_30_points_after_win_the_ball_when_points_is_15() {
        Player player = new Player(new FifteenScore());
        player.winBall();
        assertThat(player.getScore(), instanceOf(ThirtyScore.class));
    }

    @Test
    public void player_has_40_points_after_win_the_ball_when_points_is_30() {
        Player player = new Player(new ThirtyScore());
        player.setOpponent(new Player(new ZeroScore()));
        player.winBall();
        assertThat(player.getScore(), instanceOf(LeadFortyScore.class));
    }

    @Test
    public void player_win_after_win_the_ball_when_points_is_40() {
        Player player = new Player(new LeadFortyScore());
        player.setOpponent(new Player(new ZeroScore()));
        player.winBall();
        assertThat(player.isWinner(), is(true));
    }

    @Test
    public void player_get_advantage_after_win_the_ball_when_tied() {
        Player player = new Player(new DeuceFortyScore());
        Player opponent = new Player(new DeuceFortyScore());
        player.setOpponent(opponent);

        player.winBall();

        assertThat(player.getScore(), instanceOf(AdvantageFortyScore.class));
        assertThat(opponent.getScore(), instanceOf(DisadvantageFortyScore.class));
        assertThat(player.hasAdvantage(), is(true));
    }

    @Test
    public void player_win_after_win_the_ball_if_has_advantage() {
        Player player = new Player(new AdvantageFortyScore());
        player.setOpponent(new Player(new DisadvantageFortyScore()));
        player.winBall();
        player.winBall();
        assertThat(player.isWinner(), is(true));
    }

    @Test
    public void player_get_deuce_after_win_the_ball_if_opponent_has_advantage() {
        Player player = new Player(new DisadvantageFortyScore());
        Player opponent = new Player(new AdvantageFortyScore());
        player.setOpponent(opponent);

        player.winBall();

        assertThat(player.getScore(), instanceOf(DeuceFortyScore.class));
        assertThat(player.getScore(), instanceOf(DeuceFortyScore.class));
        assertThat(opponent.hasAdvantage(), is(false));
    }
}