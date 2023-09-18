/*
 * 
 * 





  


 Do not modify this file










 
 */



















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

  @Test
  public void testPassLength1() {
    String consoleInput = "WAYTOOLONG";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("WAYTOOLONG - bad", result.toLowerCase().contains("bad"));
  }

  @Test
  public void testPassLength2() {
    String consoleInput = "short";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("short - bad", result.toLowerCase().contains("bad"));
  }

  @Test
  public void testPassCase1() {
    String consoleInput = "lcase12*";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("lcase12* - bad", result.toLowerCase().contains("bad"));
  }

  @Test
  public void testPassCase2() {
    String consoleInput = "UCASE12*";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("UCASE12* - bad", result.toLowerCase().contains("bad"));
  }

  @Test
  public void testPassSymbol1() {
    String consoleInput = "N0Symbls";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("N0Symbls - bad", result.toLowerCase().contains("bad"));
  }

  @Test
  public void testPassSymbol2() {
    String consoleInput = "b4dSMBL%";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("b4dSMBL% - bad", result.toLowerCase().contains("bad"));
  }

  @Test
  public void testPassGood1() {
    String consoleInput = "g00dPAS!";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("g00dPAS! - good", result.toLowerCase().contains("good"));
  }

  @Test
  public void testPassGood11() {
    String consoleInput = "g00dPAS?";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("g00dPAS? - good", result.toLowerCase().contains("good"));
  }

  @Test
  public void testPassGood2() {
    String consoleInput = "g00dPAS*";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("g00dPAS* - good", result.toLowerCase().contains("good"));
  }

  @Test
  public void testPassGood22() {
    String consoleInput = "?d0CV33!";
    InputStream in = new ByteArrayInputStream(consoleInput.getBytes());
    System.setIn(in);
    PasswordChecker.main(null);
    String result = outContent.toString();
    assertTrue("?d0CV33! - good", result.toLowerCase().contains("good"));
  }

}