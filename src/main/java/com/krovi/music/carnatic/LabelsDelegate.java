package com.krovi.music.carnatic;

public class LabelsDelegate {
  private static Labels labels;

  public static void setLabels(final Labels labels) {
    LabelsDelegate.labels = labels;
  }

  public static String moorchana() {
    return labels.moorchana();
  }

  public static String aaorhana() {
    return labels.aarohana();
  }

  public static String avaorhana() {
    return labels.avarohana();
  }
}
