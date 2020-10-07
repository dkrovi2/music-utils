package com.krovi.music.carnatic;

public class Main {
  private Main() {
    // This class is not expected to be instantiated.
  }

  public static void main(final String[] args) {
    LabelsDelegate.setLabels(new TeluguLabels());
    System.out.println(SaraliVarasaRepo.saralisFor(RaagaRepo.MAAYA_MAALAWA_GOWLA));
    System.out.println(SaraliVarasaRepo.saralisFor(RaagaRepo.MALAHARI));
    System.out.println(SaraliVarasaRepo.saralisFor(RaagaRepo.MOHANA));
    System.out.println(SaraliVarasaRepo.saralisFor(RaagaRepo.KALYANI));
    System.out.println(SaraliVarasaRepo.saralisFor(RaagaRepo.HINDOLAM));
    System.out.println(SaraliVarasaRepo.saralisFor(RaagaRepo.MALAYA_MAARUTHAM));
    System.out.println(SaraliVarasaRepo.saralisFor(RaagaRepo.KAMBHOJI));

    System.out.println(JantiVarasaRepo.jantisFor(RaagaRepo.MALAYA_MAARUTHAM));
    System.out.println(JantiVarasaRepo.jantisFor((RaagaRepo.MALAHARI)));
    System.out.println(JantiVarasaRepo.jantisFor((RaagaRepo.MOHANA)));

  }
}
