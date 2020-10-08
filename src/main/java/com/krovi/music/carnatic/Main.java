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
    print(SaraliVarasaRepo.saralisFor(RaagaRepo.MAAYA_MAALAWA_GOWLA));
    print(SaraliVarasaRepo.saralisFor(RaagaRepo.MALAHARI));
    print(SaraliVarasaRepo.saralisFor(RaagaRepo.MOHANA));
    print(SaraliVarasaRepo.saralisFor(RaagaRepo.KALYANI));
    print(SaraliVarasaRepo.saralisFor(RaagaRepo.HINDOLAM));
    print(SaraliVarasaRepo.saralisFor(RaagaRepo.MALAYA_MAARUTHAM));
    print(SaraliVarasaRepo.saralisFor(RaagaRepo.KAMBHOJI));

    print(JantiVarasaRepo.jantisFor(RaagaRepo.MAAYA_MAALAWA_GOWLA));
    print(JantiVarasaRepo.jantisFor((RaagaRepo.MALAHARI)));
    print(JantiVarasaRepo.jantisFor((RaagaRepo.MOHANA)));

    print(DhaatuVarasaRepo.dhaatusFor(RaagaRepo.MAAYA_MAALAWA_GOWLA));
    print(DhaatuVarasaRepo.dhaatusFor((RaagaRepo.MALAHARI)));
    print(DhaatuVarasaRepo.dhaatusFor((RaagaRepo.MOHANA)));
  }
}
