package com.krovi.music.carnatic;

public final class Swara {
  private Swara() {
    // This class is not expected to be instantiated.
  }

  public static String SA_L = "స↓  ";
  public static String RI_L = "రి↓  ";
  public static String GA_L = "గ↓  ";
  public static String MA_L = "మ↓  ";
  public static String PA_L = "ప↓  ";
  public static String DA_L = "ద↓  ";
  public static String NI_L = "ని↓  ";
  public static String SA = "స   ";
  public static String RI = "రి   ";
  public static String GA = "గ   ";
  public static String MA = "మ   ";
  public static String PA = "ప   ";
  public static String DA = "ద   ";
  public static String NI = "ని   ";
  public static String SA_H = "స↑  ";
  public static String RI_H = "రి↑  ";
  public static String GA_H = "గ↑  ";
  public static String MA_H = "మ↑  ";
  public static String PA_H = "ప↑  ";
  public static String DA_H = "ద↑  ";
  public static String NI_H = "ని↑  ";
  public static String REPEAT = ".   ";

  public static void setLabels(final Labels labels) {
    Swara.SA_L = labels.SA_L();
    Swara.RI_L = labels.RI_L();
    Swara.GA_L = labels.GA_L();
    Swara.MA_L = labels.MA_L();
    Swara.PA_L = labels.PA_L();
    Swara.DA_L = labels.DA_L();
    Swara.NI_L = labels.NI_L();
    Swara.SA = labels.SA();
    Swara.RI = labels.RI();
    Swara.GA = labels.GA();
    Swara.MA = labels.MA();
    Swara.PA = labels.PA();
    Swara.DA = labels.DA();
    Swara.NI = labels.NI();
    Swara.SA_H = labels.SA_H();
    Swara.RI_H = labels.RI_H();
    Swara.GA_H = labels.GA_H();
    Swara.MA_H = labels.MA_H();
    Swara.PA_H = labels.PA_H();
    Swara.DA_H = labels.DA_H();
    Swara.NI_H = labels.NI_H();
  }
}
