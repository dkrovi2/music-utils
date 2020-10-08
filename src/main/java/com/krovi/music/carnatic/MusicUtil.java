package com.krovi.music.carnatic;

import java.util.List;
import java.util.stream.Collectors;

public class MusicUtil {
  private MusicUtil() {
    // This class is not expected to be instantiated.
  }

  protected static String format(
      final Raaga raaga,
      final int number,
      final List<List<Integer>> aarohanaPatterns,
      final List<List<Integer>> avarohanaPatterns) {
    return format(raaga, number, "", aarohanaPatterns, avarohanaPatterns);
  }

  protected static String format(
      final Raaga raaga,
      final int number,
      final String label,
      final List<List<Integer>> aarohanaPatterns,
      final List<List<Integer>> avarohanaPatterns) {
    String fmtStr =
        null == label || "".equals(label)
            ? "%2d. %s%s%n%n"
            : "%2d. %s:%n" + "    " + "===================================" + " %s%s%n%n";
    return String.format(
        fmtStr,
        number,
        label,
        aarohanaPatterns.stream()
            .map(pattern -> format(pattern, raaga.getMoorchana().getLeft()))
            .collect(Collectors.joining()),
        avarohanaPatterns.stream()
            .map(pattern -> format(pattern, raaga.getMoorchana().getRight()))
            .collect(Collectors.joining()));
  }

  private static String format(final List<Integer> pattern, final SwaraList list) {
    return String.format("%n    %s", String.join(" ", list.applyPattern(pattern)));
  }
}
