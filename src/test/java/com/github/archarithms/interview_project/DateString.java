package com.github.archarithms.interview_project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DateString extends TestCase
{
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public DateString(String testName)
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

  /*
   * UNCOMMENT THE UNIT TESTS TO RUN THEM. FEEL FREE TO ADD MORE!
   */

  /**
   * Test the testConvertUnixToDateString method
   */
  // public void testConvertUnixToDateString()
  // {
  // String testStr = "July 4, 2017";
  // assertTrue(testStr.equals(App.convertUnixToDateString(1499144400L)));
  // }

  /**
   * Test the testConvertUnixToDateString method
   */
  // public void testNullCase()
  // {
  // DateTime dt = new DateTime();
  // DateTimeFormatter fmt = DateTimeFormat.forPattern("MMMM d, yyyy");
  // assertTrue(dt.toString(fmt).equals(App.convertUnixToDateString(null)));
  // }
}
