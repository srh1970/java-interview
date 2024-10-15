package com.github.archarithms;

import java.util.stream.Collectors;
import java.util.Arrays;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App
{
  public static String convertToTitleCase(final String inpStr)
  {
    if (inpStr == null){
      throw new IllegalArgumentException("Input cannot be null");
    }
    // Update the returnValue to pass the Unit Test.
    String returnValue = new String();

    String cleanedStr = inpStr.replaceAll("[^a-zA-Z0-9]+", " ").trim();
    returnValue = Arrays.stream(cleanedStr.split("\\s+"))
                          .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                          .collect(Collectors.joining(" "));
                     // System.out.println("retval " + returnValue);
    return returnValue;
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds)
  {
    // 2.1 - Update the returnValue to pass the Unit Test.
    // 2.2 - Update to handle 'null' by throwing an exception to pass the unit test.

    if (inpUnixSeconds == null || inpUnixSeconds < 0L){
      throw new IllegalArgumentException("Epoch time cannot be null");
    }

    String returnValue = new String();

    LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochSecond(inpUnixSeconds), ZoneId.systemDefault());
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    returnValue = date.format(formatter);

    return returnValue; 
  }

  public static int[] updateArray(int[] array){
    int[] returnValue = array; 

    // Update array here. 
    for (int i = 0; i < returnValue.length; i += 3){
      returnValue[i] *= 3;
    }

    return returnValue;
  }
}
