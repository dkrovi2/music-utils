package com.krovi.music.carnatic;

public class MusicRepo {
  private MusicRepo() {
    // This class is not expected to be instantiated.
  }

  public static String generateAllFor(final Raaga raaga) {
    return "\n\n"
        + LabelsDelegate.raagam()
        + ": "
        + raaga.name(LabelsDelegate.getLabels().languageSuffix())
        + "\n\n        "
        + LabelsDelegate.saralis()
        + "\n===============================================================\n"
        + SaraliVarasaRepo.saralisFor(raaga)
        + "\n\n        "
        + LabelsDelegate.jantis()
        + "\n===============================================================\n"
        + JantiVarasaRepo.jantisFor(raaga)
        + "\n\n        "
        + LabelsDelegate.dhaatus()
        + "\n===============================================================\n"
        + DhaatuVarasaRepo.dhaatusFor(raaga)
        + "\n\n        "
        + LabelsDelegate.alankaarams()
        + "\n===============================================================\n"
        + AlankaaramRepo.alankaramsFor(raaga);
  }
}
