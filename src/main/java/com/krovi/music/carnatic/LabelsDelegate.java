package com.krovi.music.carnatic;

public class LabelsDelegate {

  private static Labels labels;

  public static void setLabels(final Labels labels) {
    LabelsDelegate.labels = labels;
    Swara.setLabels(labels);
  }

  public static Labels getLabels() { return labels;}

  public static String aarohana() {
    return labels.aarohana();
  }

  public static String avarohana() {
    return labels.avarohana();
  }

  public static String saralis() {
    return labels.saralis();
  }

  public static String jantis() {
    return labels.jantis();
  }

  public static String dhaatus() {
    return labels.dhaatus();
  }

  public static String alankaarams() {
    return labels.alankaarams();
  }

  public static String roopaka() {
    return labels.roopaka();
  }

  public static String triputa() {
    return labels.triputa();
  }

  public static String matya() {
    return labels.matya();
  }

  public static String dhruva() {
    return labels.dhruva();
  }

  public static String atta() {
    return labels.atta();
  }

  public static String jhampe() {
    return labels.jhampe();
  }

  public static String eka() {
    return labels.eka();
  }

  public static String moorchana() {
    return labels.moorchana();
  }

  private LabelsDelegate() {
    // This class is not expected to be instantiated.
  }
}
