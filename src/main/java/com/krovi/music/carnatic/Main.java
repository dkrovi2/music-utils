package com.krovi.music.carnatic;

public class Main {
  private Main() {
    // This class is not expected to be instantiated.
  }

  public static void main(final String[] args) {
    LabelsDelegate.setLabels(new TeluguLabels());
    SaraliVarasaRepo.SARALIS.forEach(
        s -> System.out.println(s.apply(RaagaRepo.MAAYA_MAALAWA_GOWLA)));
  }
}
