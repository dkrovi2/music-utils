package com.krovi.music.carnatic;

import java.util.List;
import java.util.stream.Collectors;

public class MusicUtil {
  private MusicUtil() {
    // This class is not expected to be instantiated.
  }

  protected static String s(
      final Raaga raaga,
      final int number,
      final List<List<Integer>> aarohanaPatterns,
      final List<List<Integer>> avarohanaPatterns) {
    return String.format(
        "%2d. %s%s%n%n",
        number,
        aarohanaPatterns.stream()
            .map(pattern -> s(pattern, raaga.getMoorchana().getLeft()))
            .collect(Collectors.joining()),
        avarohanaPatterns.stream()
            .map(pattern -> s(pattern, raaga.getMoorchana().getRight()))
            .collect(Collectors.joining()));
  }

  private static String s(final List<Integer> pattern, final SwaraList list) {
    return String.format("%n    %s", String.join(" ", list.applyPattern(pattern)));
  }
}
