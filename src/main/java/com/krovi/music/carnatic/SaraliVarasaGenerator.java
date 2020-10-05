package com.krovi.music.carnatic;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SaraliVarasaGenerator {

  public static final Function<Raaga, String> saraliVarasa1 =
      raaga ->
          "\n1. "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining());

  public static final Function<Raaga, String> saraliVarasa2 =
      raaga ->
          "\n2. "
              + List.of(1, 2, 3, 4, 1, 2, 3, 4).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 1, 2, 3, 4).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining());

  public static final Function<Raaga, String> saraliVarasa3 =
      raaga ->
          "\n3. "
              + List.of(1, 2, 3, 4, 1, 2, 1, 2).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 1, 2, 1, 2).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining());

  public static final Function<Raaga, String> saraliVarasa4 =
      raaga ->
          "\n4. "
              + List.of(1, 2, 3, 4, 5, 0, 1, 2).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 0, 1, 2).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining());

  public static final Function<Raaga, String> saraliVarasa5 =
      raaga ->
          "\n5. "
              + List.of(1, 2, 3, 4, 5, 4, 3, 2).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 4, 3, 2).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining());

  public static final Function<Raaga, String> saraliVarasa6 =
      raaga ->
          "\n6. "
              + List.of(1, 2, 3, 4, 5, 4, 6, 5).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 4, 6, 5).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining())
              + "\n   "
              + List.of(1, 2, 3, 4, 5, 6, 7, 8).stream()
                  .map(i -> raaga.getAvarohana().get(i - 1))
                  .collect(Collectors.joining());

  private SaraliVarasaGenerator() {
    // This class is not expected to be instantiated.
  }
}
