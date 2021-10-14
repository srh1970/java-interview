package com.github.archarithms;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import org.joda.time.DateTime;

public class App
{
  public static String convertToTitleCase(final String inpStr)
  {
    if (inpStr == null)
      throw new IllegalArgumentException("Yo dawg, your string is empty");

    // Replace all underscores with spaces
    String inputString = inpStr.replaceAll("[^a-zA-Z0-9]", " ");
    // Make all letters lowercase
    inputString = inputString.toLowerCase();
    // Split words into array entries
    String[] words = inputString.split(" ");
    // Loop over array of words and make first letter capital
    for (int i = 0; i < words.length; i++) {
      // Make the first letter capital and add rest of word as is.
      String temp = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
      words[i] = temp;
    }
    inputString = String.join(" ", words);
    return inputString;
  }

  public static String convertUnixToDateString(final Long inpUnixSeconds)
  {
    if (inpUnixSeconds == null)
      throw new IllegalArgumentException("Input can't be null");

    String test = LocalDateTime.ofEpochSecond(inpUnixSeconds, 0, ZoneOffset.UTC).toLocalDate()
        .format(DateTimeFormatter.ofPattern("MMMM d, YYYY"));
    return test;

  }

  public static String convertUnixToDateString() {
    return LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM d, YYYY"));
  }
}
