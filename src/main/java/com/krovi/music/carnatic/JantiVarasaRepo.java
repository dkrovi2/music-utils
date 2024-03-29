package com.krovi.music.carnatic;

import static com.krovi.music.carnatic.MusicUtil.format;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JantiVarasaRepo {
  public static final Function<Raaga, String> jantiVarasa1 =
      raaga ->
          format(
              raaga,
              1,
              List.of(
                  IntStream.range(0, raaga.getMoorchana().getKey().size())
                      .boxed()
                      .map(i -> List.of(i + 1, i + 1))
                      .flatMap(Collection::stream)
                      .collect(Collectors.toList())),
              List.of(
                  IntStream.range(0, raaga.getMoorchana().getValue().size())
                      .boxed()
                      .map(i -> List.of(i + 1, i + 1))
                      .flatMap(Collection::stream)
                      .collect(Collectors.toList())));

  public static final Function<Raaga, String> jantiVarasa2 =
      raaga ->
          format(
              raaga,
              2,
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(i -> List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3))
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(i -> List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3))
                  .collect(Collectors.toList()));

  public static final Function<Raaga, String> jantiVarasa3 =
      raaga ->
          format(
              raaga,
              3,
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

  public static final Function<Raaga, String> jantiVarasa4 =
      raaga ->
          format(
              raaga,
              4,
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i, i, i + 1, i + 1, i + 2, i, i + 1, i + 2),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i, i, i + 1, i + 1, i + 2, i, i + 1, i + 2),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()));

  public static final Function<Raaga, String> jantiVarasa5 =
      raaga ->
          format(
              raaga,
              4,
              IntStream.range(1, raaga.getMoorchana().getKey().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i + 3, i + 3, i + 2, i + 2, i + 1, i + 1, i + 2, i + 2),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()),
              IntStream.range(1, raaga.getMoorchana().getValue().size() - 2)
                  .mapToObj(
                      i ->
                          List.of(
                              List.of(i + 3, i + 3, i + 2, i + 2, i + 1, i + 1, i + 2, i + 2),
                              List.of(i, i, i + 1, i + 1, i + 2, i + 2, i + 3, i + 3)))
                  .flatMap(Collection::stream)
                  .collect(Collectors.toList()));

  public static final List<Function<Raaga, String>> jantiVarasaList =
      List.of(jantiVarasa1, jantiVarasa2, jantiVarasa3, jantiVarasa4, jantiVarasa5);

  public static String jantisFor(final Raaga raaga) {
    return jantiVarasaList.stream().map(j -> j.apply(raaga)).collect(Collectors.joining());
  }

  private JantiVarasaRepo() {
    // This class is not expected to be instantiated.
  }
}
