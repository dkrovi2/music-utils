package com.krovi.music.carnatic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  private Main() {
    // This class is not expected to be instantiated.
  }

  private static void print(final Raaga raaga, final String s) {
    File file =
        new File(System.getProperty("user.dir") + "/raaga-exercises/" + raaga.fileName() + ".txt");

    try (FileOutputStream fos = new FileOutputStream(file)) {
      fos.write(s.getBytes());
      System.out.println("Wrote the exercises to " + file.getPath());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(final String[] args) {
    LabelsDelegate.setLabels(new TeluguLabels());
    RaagaRepo.raagaList.forEach(raaga -> print(raaga, MusicRepo.generateAllFor(raaga)));
  }
}
