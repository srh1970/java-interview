package com.github.archarithms;

import java.util.stream.Collectors;

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

    returnValue = Arrays.stream(inpStr.split("_"))
                          .map(word -> word.replaceAll("[^a-zA-Z0-9]", ""))
                          .filter(word -> !word.isEmpty())
                          .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                          .collect(Collectors.joining(" "));

    return returnValue;
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds)
  {
    // 2.1 - Update the returnValue to pass the Unit Test.
    // 2.2 - Update to handle 'null' by throwing an exception to pass the unit test.

    if (inpUnixSeconds == null){
      throw new IllegalArgumentException("Epoch time cannot be null");
    }

    String returnValue = new String();

    LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochSecond(inpUnixSeconds), ZoneId.systemDefault());
    DateTimeFormatter = formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    returnValue = date.format(formatter);

    return returnValue; 
  }

  public static int[] updateArray(int[] array){
    int[] returnValue = array; 

    // Update array here. 
    for(int i = 0; i < returnValue.length; i++){
      if ((i + 1) % 3 == 0){
        returnValue[i] *= 3;
      }
    }

    return returnValue;
  }
}
