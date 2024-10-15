package com.github.archarithms.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.github.archarithms.App;

/**
 * DateStringTests unit tests for simple App.
 */
public class DateStringTests
{

    /**
     * Test the testConvertUnixToDateString method
     */
    @Test
    public void testConvertUnixToDateString() {
        String testStr = "July 4, 2017";
        assertTrue(testStr.equals(App.convertUnixToDateString(1499144400L)));
    }

    /**
     * Test the testNullCase method
     */
    @Test
    public void testNullCase() {
        assertThrows(Exception.class, () -> App.convertUnixToDateString(null));
    }

    /**
     * Test the testFutureCase method
     */
    @Test
    public void testFutureCase() {
        String testStr = "June 18, 2099";
        assertTrue(testStr.equals(App.convertUnixToDateString(4070908800L)));
    }

    /**
     * Test the testNegativeTimestamp method
     */
    @Test
    public void testNegativeTimestamp() {
        assertThrows(IllegalArgumentException.class, () -> App.convertUnixToDateString(-100L));
    }

}
