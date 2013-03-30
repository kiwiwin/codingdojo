package org.codingdojo.kiwi;

import org.junit.*;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TennisGameTest {

    private Player seed;
    private TennisGame game;
    private Player challenger;

    @Before
    public void setUp() throws Exception {
        seed = new Player(new ZeroScore());
        challenger = new Player(new ZeroScore());
        game = new TennisGame(seed, challenger);
    }

    @Test
    public void A_win_ball_when_input_is_A() {
        Player mockSeed = mock(Player.class);
        game = new TennisGame(mockSeed, challenger);

        game.winBall("Seed");

        verify(mockSeed).winBall();
    }

    @Test
    public void B_win_ball_when_input_is_B() {
        Player mockChallenger = mock(Player.class);
        game = new TennisGame(seed, mockChallenger);

        game.winBall("Challenger");

        verify(mockChallenger).winBall();
    }

    @Test
    public void game_finish_when_one_player_win_the_game() {
        seed.setScore(new LeadFortyScore());
        game.winBall("Seed");

        assertThat(game.isFinish(), is(true));
    }
}
