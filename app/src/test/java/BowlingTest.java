import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTest {

    private Bowling bowlingGame;

    @BeforeEach
    public void setup() throws Exception {
        bowlingGame = new Bowling();
    }

    @Test
    public void testGutterBallGame() {
        int expected = 0;

        bowlingGame.roll(0);
        bowlingGame.roll(0);

        int actual = bowlingGame.getScore();

        Assertions.assertEquals(expected, actual);
    }
}