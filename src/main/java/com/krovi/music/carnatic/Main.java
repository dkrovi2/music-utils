package com.krovi.music.carnatic;

public class Main {
  private Main() {
    // This class is not expected to be instantiated.
  }

  private static void print(final String s) {
    System.out.println(s);
  }

  public static void main(final String[] args) {
    LabelsDelegate.setLabels(new TeluguLabels());

    print(MusicRepo.generateAllFor(RaagaRepo.MAAYA_MAALAWA_GOWLA));
  }
}
