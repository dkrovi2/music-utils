package com.krovi.music.carnatic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JantiVarasaTest {
  @Test
  void test() {
    String s = JantiVarasaRepo.jantiVarasa1.apply(RaagaRepo.MAAYA_MAALAWA_GOWLA);
    System.out.println(s);
    Assertions.assertFalse(s.isBlank());
  }
}
