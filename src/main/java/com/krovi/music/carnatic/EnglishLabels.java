package com.krovi.music.carnatic;

public class EnglishLabels implements Labels {
  public static final EnglishLabels INSTANCE = new EnglishLabels();
  public static final String SUFFIX = "en";

  public String languageSuffix() {return SUFFIX;}
  public String moorchana() { return "Moorchana";}
  public String aarohana() {return "Aarohana";}
  public String avarohana() {return "Avarohana";}
  public String saralis() { return "Sarali Varasa"; }
  public String jantis() { return "Janti Varasa"; }
  public String dhaatus() { return "Dhaatu Varasa"; }
  public String alankaarams() { return "Alankaaram";}
  public String roopaka() { return "Roopaka Taalam"; }
  public String triputa() { return "Triputa Taalam"; }
  public String matya() { return "Matya Taalam"; }
  public String dhruva() { return "Dhruva Taalam"; }
  public String atta() { return "Atta Taalam"; }
  public String jhampe() { return "Jampe Taalam"; }
  public String eka() { return "Eka Taalam"; }

  public String SA_L() { return "Sa↓  ";}
  public String RI_L() { return "Ri↓  ";}
  public String GA_L() { return "Ga↓  ";}
  public String MA_L() { return "Ma↓  ";}
  public String PA_L() { return "Pa↓  ";}
  public String DA_L() { return "Da↓  ";}
  public String NI_L() { return "Ni↓  ";}
  public String SA() { return "Sa   ";}
  public String RI() { return "Ri   ";}
  public String GA() { return "Ga   ";}
  public String MA() { return "Ma   ";}
  public String PA() { return "Pa   ";}
  public String DA() { return "Da   ";}
  public String NI() { return "Ni   ";}
  public String SA_H() { return "Sa↑  ";}
  public String RI_H() { return "Ri↑  ";}
  public String GA_H() { return "Ga↑  ";}
  public String MA_H() { return "Ma↑  ";}
  public String PA_H() { return "Pa↑  ";}
  public String DA_H() { return "Da↑  ";}
  public String NI_H() { return "Ni↑  ";}

  private EnglishLabels() {
    // Not expected to be instantiated outside this class.
  }
}
