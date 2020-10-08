package com.krovi.music.carnatic;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SaraliVarasaRepo {

  public static final Function<Raaga, String> saraliVarasa1 =
      raaga ->
          s(
              raaga,
              1,
              List.of(List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa20 =
      raaga ->
          s(
              raaga,
              2,
              List.of(List.of(1, 2, 3, 4, 1, 2, 3, 4), List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 3, 4, 1, 2, 3, 4), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa21 =
      raaga ->
          s(
              raaga,
              2,
              List.of(List.of(1, 2, 1, 2, 1, 2, 3, 4), List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 1, 2, 1, 2, 3, 4), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa30 =
      raaga ->
          s(
              raaga,
              3,
              List.of(List.of(1, 2, 3, 4, 1, 2, 1, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 3, 4, 1, 2, 1, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa31 =
      raaga ->
          s(
              raaga,
              3,
              List.of(List.of(1, 2, 3, 1, 2, 3, 1, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 3, 1, 2, 3, 1, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa4 =
      raaga ->
          s(
              raaga,
              4,
              List.of(List.of(1, 2, 3, 4, 5, 0, 1, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 3, 4, 5, 0, 1, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa5 =
      raaga ->
          s(
              raaga,
              5,
              List.of(List.of(1, 2, 3, 4, 5, 4, 3, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 3, 4, 5, 4, 3, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa60 =
      raaga ->
          s(
              raaga,
              6,
              List.of(List.of(1, 2, 3, 4, 5, 4, 6, 5), List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 3, 4, 5, 4, 6, 5), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa61 =
      raaga ->
          s(
              raaga,
              6,
              List.of(List.of(1, 2, 3, 4, 5, 6, 1, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 3, 4, 5, 6, 1, 2), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa71 =
      raaga ->
          s(
              raaga,
              7,
              List.of(List.of(1, 2, 3, 4, 5, 6, 7, 0), List.of(1, 2, 3, 4, 5, 6, 7, 8)),
              List.of(List.of(1, 2, 3, 4, 5, 6, 7, 0), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa10 =
      raaga ->
          s(
              raaga,
              10,
              List.of(List.of(1, 2, 3, 4, 5, 0, 3, 4), List.of(5, 0, 0, 0, 5, 0, 0, 0)),
              List.of(List.of(6, 5, 4, 3, 2, 3, 4, 5), List.of(6, 5, 4, 6, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa11 =
      raaga ->
          s(
              raaga,
              11,
              List.of(List.of(8, 0, 7, 6, 7, 0, 6, 5), List.of(6, 0, 5, 4, 5, 0, 5, 0)),
              List.of(List.of(6, 5, 4, 3, 2, 3, 4, 5), List.of(6, 5, 4, 6, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa12 =
      raaga ->
          s(
              raaga,
              12,
              List.of(List.of(8, 8, 7, 6, 7, 7, 6, 5), List.of(6, 6, 5, 4, 5, 0, 5, 0)),
              List.of(List.of(6, 5, 4, 3, 2, 3, 4, 5), List.of(6, 5, 4, 6, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa13 =
      raaga ->
          s(
              raaga,
              13,
              List.of(List.of(1, 2, 3, 2, 3, 0, 3, 4), List.of(5, 4, 5, 0, 6, 5, 6, 0)),
              List.of(List.of(5, 4, 3, 4, 3, 2, 3, 4), List.of(5, 4, 3, 4, 5, 6, 7, 8)));

  public static final Function<Raaga, String> saraliVarasa14 =
      raaga ->
          s(
              raaga,
              14,
              List.of(List.of(1, 2, 3, 4, 5, 0, 5, 0), List.of(6, 6, 5, 0, 4, 4, 5, 0)),
              List.of(List.of(3, 2, 1, 0, 1, 2, 3, 4), List.of(1, 2, 3, 4, 5, 6, 7, 8)));

  public static final List<Function<Raaga, String>> SARALIS =
      Collections.unmodifiableList(
          List.of(
              saraliVarasa1,
              saraliVarasa20,
              saraliVarasa21,
              saraliVarasa30,
              saraliVarasa31,
              saraliVarasa4,
              saraliVarasa5,
              saraliVarasa60,
              saraliVarasa61,
              saraliVarasa71,
              saraliVarasa10,
              saraliVarasa11,
              saraliVarasa12,
              saraliVarasa13,
              saraliVarasa14));

  private SaraliVarasaRepo() {
    // This class is not expected to be instantiated.
  }

  private static String s(
      final Raaga raaga,
      final int number,
      final List<List<Integer>> aarohanaPatterns,
      final List<List<Integer>> avarohanaPatterns) {

    return String.format(
        "%2d. %s%n",
        number,
        raaga.applyPatterns(aarohanaPatterns, avarohanaPatterns).stream()
            .map(line -> String.format("%n    %s", String.join(" ", line)))
            .collect(Collectors.joining()));
  }

  public static String saralisFor(final Raaga raaga) {
    return SaraliVarasaRepo.SARALIS.stream().map(s -> s.apply(raaga)).collect(Collectors.joining());
  }
}
