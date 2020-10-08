package com.krovi.music.carnatic;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DhaatuVarasaRepo {
  public static final Function<Raaga, String> dhaatuVarasa1 =
      raaga ->
          s(
              raaga,
              1,
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 1, i + 1),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 1, i + 1),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()));

  protected static String s(
      final Raaga raaga,
      final int number,
      final List<List<Integer>> aarohanaPatterns,
      final List<List<Integer>> avarohanaPatterns) {
    return String.format(
        "%2d. %s%s%n",
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

  private DhaatuVarasaRepo() {
    // This class is not expected to be instantiated.
  }
}
