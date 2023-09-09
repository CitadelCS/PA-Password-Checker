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
public class PasswordCheckerTest {
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


    public void testPass1() {
        setSystemIn("WAYTOOLONG");
        PasswordChecker.main(null);
        assertTrue("WAYTOOLONG - bad", systemOut().getHistory().toLowerCase().contains("bad"));
      }
    
      public void testPass2() {
        setSystemIn("short");
        PasswordChecker.main(null);
        assertTrue("short - bad", systemOut().getHistory().toLowerCase().contains("bad"));
      }
    
      public void testPass3() {
        setSystemIn("lcase12*");
        PasswordChecker.main(null);
        assertTrue("lcase12* - bad", systemOut().getHistory().toLowerCase().contains("bad"));
      }
    
      public void testPass4() {
        setSystemIn("UCASE12*");
        PasswordChecker.main(null);
        assertTrue("UCASE12* - bad", systemOut().getHistory().toLowerCase().contains("bad"));
      }
    
      public void testPass5() {
        setSystemIn("N0Symbls");
        PasswordChecker.main(null);
        assertTrue("N0Symbls - bad", systemOut().getHistory().toLowerCase().contains("bad"));
      }
    
      public void testPass6() {
        setSystemIn("b4dSMBL%");
        PasswordChecker.main(null);
        assertTrue("b4dSMBL% - bad", systemOut().getHistory().toLowerCase().contains("bad"));
      }
    
      public void testPass7() {
        setSystemIn("g00dPAS!");
        PasswordChecker.main(null);
        assertTrue("g00dPAS! - good", systemOut().getHistory().toLowerCase().contains("good"));
      }
    
      public void testPass8() {
        setSystemIn("g00dPAS?");
        PasswordChecker.main(null);
        assertTrue("g00dPAS? - good", systemOut().getHistory().toLowerCase().contains("good"));
      }
    
      public void testPass9() {
        setSystemIn("g00dPAS*");
        PasswordChecker.main(null);
        assertTrue("g00dPAS* - good", systemOut().getHistory().toLowerCase().contains("good"));
      }
    
      public void testPass10() {
        setSystemIn("?d0CV33!");
        PasswordChecker.main(null);
        assertTrue("?d0CV33! - good", systemOut().getHistory().toLowerCase().contains("good"));
      }
/*   
    @Test
    public void testYouRolled() {
        String consoleInput = "5";
        InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
        System.setIn(in);
        PasswordChecker.main(null);
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
            PasswordChecker.main(null);
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
*/
}