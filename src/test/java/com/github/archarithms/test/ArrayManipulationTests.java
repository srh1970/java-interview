package com.github.archarithms.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.github.archarithms.App;

/**
 * Array Manipulation unit tests for simple App.
 */
public class ArrayManipulationTests{
    /**
     * Test the updateArray method
     */
    @Test
    public void testUpdateArray() {

    int[] inputArray = new int[]{-10, 20, 30, -40, -50, 60, 70, -80, -90};
    int[] answerArray = new int[]{-30, 20, 30, -120, -50, 60, 210, -80, -90};
    assertTrue(Arrays.equals(App.updateArray(inputArray), answerArray));        
    }

}
