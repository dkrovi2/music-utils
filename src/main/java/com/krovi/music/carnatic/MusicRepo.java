package com.krovi.music.carnatic;

public class MusicRepo {
  private MusicRepo() {
    // This class is not expected to be instantiated.
  }

  public static String generateAllFor(final Raaga raaga) {
    return SaraliVarasaRepo.saralisFor(raaga)
        + JantiVarasaRepo.jantisFor(raaga)
        + DhaatuVarasaRepo.dhaatusFor(raaga)
        + AlankaaramRepo.alankaramsFor(raaga);
  }
}
