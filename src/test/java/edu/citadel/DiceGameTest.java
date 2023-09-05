package edu.citadel;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DiceGameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    @Test
    public void testNegativeBet() {
        String consoleInput = "-12.3";
        InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
        System.setIn(in);
        DiceGame.main(null);
        String result = outContent.toString();

        assertTrue("prints invalid bet message for negative bet",
                result.toLowerCase().contains("invalid"));
        assertTrue("prints you won $0 for negative bet", result.toLowerCase().contains("you won $0"));
    }

    @Test
    public void testSmallBet() {
        String consoleInput = "14";
        InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
        System.setIn(in);
        DiceGame.main(null);
        String result = outContent.toString();
        assertTrue("reports small bet", result.toLowerCase().contains("small"));
    }

    @Test
    public void testMediumBet() {
        String consoleInput = "55";
        InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
        System.setIn(in);
        DiceGame.main(null);
        String result = outContent.toString();
        assertTrue("reports medium bet", result.toLowerCase().contains("medium"));
    }

    @Test
    public void testLargeBet() {
        String consoleInput = "65";
        InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
        System.setIn(in);
        DiceGame.main(null);
        String result = outContent.toString();
        assertTrue("reports high roller bet", result.toLowerCase().contains("high roller"));
    }

    @Test
    public void testYouRolled() {
        String consoleInput = "5";
        InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
        System.setIn(in);
        DiceGame.main(null);
        String result = outContent.toString();
        assertTrue("prints \"you rolled\" message", result.toLowerCase().contains("you rolled"));
    }

    @Test
    public void testWinnerStatements() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500; i++) {
            String consoleInput = "5";
            InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
            System.setIn(in);
            DiceGame.main(null);
            String result = outContent.toString();
            sb.append(result.toLowerCase());
        }
        String s = sb.toString();
        assertTrue("big winner possible after many rolls", s.contains("big winner"));
        assertTrue("medium winner possible after many rolls", s.contains("medium winner"));
        assertTrue("small winner possible after many rolls", s.contains("small winner"));
        assertTrue("draw possible after many rolls", s.contains("draw"));
        assertTrue("you lose possible after many rolls", s.contains("you lose"));
    }

}