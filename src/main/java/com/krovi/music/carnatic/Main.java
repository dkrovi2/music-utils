package com.krovi.music.carnatic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
  private Main() {
    // This class is not expected to be instantiated.
  }

  private static void print(final Raaga raaga, final String s, final String langSuffix) {
    final String fileName = raaga.fileName() + ".txt";
    Path path = Path.of(System.getProperty("user.dir"), "raaga-exercises", langSuffix);
    if (!path.toFile().exists() && !path.toFile().mkdir()) {
      throw new IllegalArgumentException("Could not create directory at " + path);
    }
    File file =
        new File(
            System.getProperty("user.dir") + "/raaga-exercises/" + langSuffix + '/' + fileName);

    try (FileOutputStream fos = new FileOutputStream(file)) {
      fos.write(s.getBytes());
      System.out.println("Wrote the exercises to " + file.getPath());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(final String[] args) {
    LabelsDelegate.setLabels(TeluguLabels.INSTANCE);
    RaagaRepo.raagaList.forEach(
        raaga ->
            print(
                raaga,
                MusicRepo.generateAllFor(raaga),
                LabelsDelegate.getLabels().languageSuffix()));
    LabelsDelegate.setLabels(EnglishLabels.INSTANCE);
    RaagaRepo.raagaList.forEach(
        raaga ->
            print(
                raaga,
                MusicRepo.generateAllFor(raaga),
                LabelsDelegate.getLabels().languageSuffix()));
  }
}
