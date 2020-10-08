package com.krovi.music.carnatic;

import static com.krovi.music.carnatic.MusicUtil.format;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DhaatuVarasaRepo {
  public static final Function<Raaga, String> dhaatuVarasa1 =
      raaga ->
          format(
              raaga,
              1,
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i, i + 1, i, i + 2, i, i + 3, i + 2, i + 1),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i, i + 1, i, i + 2, i, i + 3, i + 2, i + 1),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()));

  public static final Function<Raaga, String> dhaatuVarasa2 =
      raaga ->
          format(
              raaga,
              2,
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i, i + 3, i + 2, i + 3, i + 1, i + 2, i, i + 1),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i, i + 3, i + 2, i + 3, i + 1, i + 2, i, i + 1),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()));

  public static final List<Function<Raaga, String>> dhaatuVarasaList =
      List.of(dhaatuVarasa1, dhaatuVarasa2);

  public static String dhaatusFor(final Raaga raaga) {
    return dhaatuVarasaList.stream().map(d -> d.apply(raaga)).collect(Collectors.joining());
  }

  private DhaatuVarasaRepo() {
    // This class is not expected to be instantiated.
  }
}
