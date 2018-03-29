package com.github.archarithms.interview_project;

import com.github.archarithms.App;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TitleCase extends TestCase
{
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public TitleCase(String testName)
  {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite()
  {
    return new TestSuite(TitleCase.class);
  }

  public void testConvertToTitleCase()
  {
    String testStr = "Title Case";
    assertTrue(testStr.equals(App.convertToTitleCase("TITLE_CASE")));
  }

  public void testNumbers()
  {
    String testStr = "Number 3";
    assertTrue(testStr.equals(App.convertToTitleCase("NUMBER_3")));
  }

  public void testOtherChars()
  {
    String testStr = "Truth Track";
    assertTrue(testStr.equals(App.convertToTitleCase("TRUTH-TRACK")));
  }
}
