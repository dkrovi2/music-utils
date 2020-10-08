package com.krovi.music.carnatic;

import static com.krovi.music.carnatic.MusicUtil.format;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlankaaramRepo {
  public static final Function<Raaga, String> roopaka =
      raaga ->
          format(
              raaga,
              1,
              LabelsDelegate.roopaka(),
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(i -> List.of(i, i + 1, i, i + 1, i + 2, i + 3))
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(i -> List.of(i, i + 1, i, i + 1, i + 2, i + 3))
                  .collect(Collectors.toList()));

  public static final Function<Raaga, String> triputa =
      raaga ->
          format(
              raaga,
              2,
              LabelsDelegate.triputa(),
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(i -> List.of(i, i + 1, i + 2, i, i + 1, i + 2, i + 3))
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(i -> List.of(i, i + 1, i + 2, i, i + 1, i + 2, i + 3))
                  .collect(Collectors.toList()));

  public static final Function<Raaga, String> matya =
      raaga ->
          format(
              raaga,
              3,
              LabelsDelegate.matya(),
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                                  List.of(i, i + 1, i + 2, i + 1),
                                  List.of(i, i + 1),
                                  List.of(i, i + 1, i + 2, i + 3))
                              .stream()
                              .flatMap(Collection::stream)
                              .collect(Collectors.toList()))
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                                  List.of(i, i + 1, i + 2, i + 1),
                                  List.of(i, i + 1),
                                  List.of(i, i + 1, i + 2, i + 3))
                              .stream()
                              .flatMap(Collection::stream)
                              .collect(Collectors.toList()))
                  .collect(Collectors.toList()));

  public static final Function<Raaga, String> dhruva =
      raaga ->
          format(
              raaga,
              4,
              LabelsDelegate.dhruva(),
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                                  List.of(i, i + 1, i + 2, i + 3),
                                  List.of(i + 2, i + 1),
                                  List.of(i, i + 1, i + 2, i + 1),
                                  List.of(i, i + 1, i + 2, i + 3))
                              .stream()
                              .flatMap(Collection::stream)
                              .collect(Collectors.toList()))
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                                  List.of(i, i + 1, i + 2, i + 3),
                                  List.of(i + 2, i + 1),
                                  List.of(i, i + 1, i + 2, i + 1),
                                  List.of(i, i + 1, i + 2, i + 3))
                              .stream()
                              .flatMap(Collection::stream)
                              .collect(Collectors.toList()))
                  .collect(Collectors.toList()));

  public static final Function<Raaga, String> atta =
      raaga ->
          format(
              raaga,
              5,
              LabelsDelegate.atta(),
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                                  List.of(i, i + 1, 0, i + 2, 0),
                                  List.of(i, 0, i + 1, i + 2, 0),
                                  List.of(i + 3, i + 3))
                              .stream()
                              .flatMap(Collection::stream)
                              .collect(Collectors.toList()))
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                                  List.of(i, i + 1, 0, i + 2, 0),
                                  List.of(i, 0, i + 1, i + 2, 0),
                                  List.of(i + 3, i + 3))
                              .stream()
                              .flatMap(Collection::stream)
                              .collect(Collectors.toList()))
                  .collect(Collectors.toList()));

  public static final Function<Raaga, String> jampe =
      raaga ->
          format(
              raaga,
              6,
              LabelsDelegate.jhampe(),
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                                  List.of(i, i + 1, i + 2),
                                  List.of(i, i + 1, i, i + 1, i + 2),
                                  List.of(i + 3, 0))
                              .stream()
                              .flatMap(Collection::stream)
                              .collect(Collectors.toList()))
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                                  List.of(i, i + 1, i + 2),
                                  List.of(i, i + 1, i, i + 1, i + 2),
                                  List.of(i + 3, 0))
                              .stream()
                              .flatMap(Collection::stream)
                              .collect(Collectors.toList()))
                  .collect(Collectors.toList()));

  public static final Function<Raaga, String> eka =
      raaga ->
          format(
              raaga,
              7,
              LabelsDelegate.eka(),
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(i -> List.of(i, i + 1, i + 2, i + 3))
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(i -> List.of(i, i + 1, i + 2, i + 3))
                  .collect(Collectors.toList()));

  public static final List<Function<Raaga, String>> alankarams =
      List.of(roopaka, triputa, matya, dhruva, atta, jampe, eka);

  public static String alankaramsFor(final Raaga raaga) {
    return alankarams.stream().map(s -> s.apply(raaga)).collect(Collectors.joining());
  }

  private AlankaaramRepo() {
    // This class is not expected to be instantiated.
  }
}
