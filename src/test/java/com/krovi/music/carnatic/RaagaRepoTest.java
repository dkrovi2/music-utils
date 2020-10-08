package com.krovi.music.carnatic;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class RaagaRepoTest {

  @BeforeAll
  public static void beforeAll() {
    LabelsDelegate.setLabels(TeluguLabels.INSTANCE);
  }

  public static Stream<Raaga> raagaStream() {
    return RaagaRepo.raagaList.stream();
  }

  @ParameterizedTest
  @MethodSource("raagaStream")
  void test(final Raaga raaga) {
    try {
      System.out.println(MusicRepo.generateAllFor(raaga));
    } catch (Exception e) {
      e.printStackTrace();
      Assertions.fail("Not expecting any exceptions but found " + e.getMessage());
    }
  }
}
