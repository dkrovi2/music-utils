package com.krovi.music.carnatic;

public class EnglishLabels implements Labels {
  public static final EnglishLabels INSTANCE = new EnglishLabels();
  public static final String SUFFIX = "en";

  public String languageSuffix() {return SUFFIX;}
  public String raagam() { return "Raaga";}
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

  public Swara SA_L() { return Swara.of("Sa↓  ");}
  public Swara RI_L() { return Swara.of("Ri↓  ");}
  public Swara GA_L() { return Swara.of("Ga↓  ");}
  public Swara MA_L() { return Swara.of("Ma↓  ");}
  public Swara PA_L() { return Swara.of("Pa↓  ");}
  public Swara DA_L() { return Swara.of("Da↓  ");}
  public Swara NI_L() { return Swara.of("Ni↓  ");}
  public Swara SA() { return Swara.of("Sa   ");}
  public Swara RI() { return Swara.of("Ri   ");}
  public Swara GA() { return Swara.of("Ga   ");}
  public Swara MA() { return Swara.of("Ma   ");}
  public Swara PA() { return Swara.of("Pa   ");}
  public Swara DA() { return Swara.of("Da   ");}
  public Swara NI() { return Swara.of("Ni   ");}
  public Swara SA_H() { return Swara.of("Sa↑  ");}
  public Swara RI_H() { return Swara.of("Ri↑  ");}
  public Swara GA_H() { return Swara.of("Ga↑  ");}
  public Swara MA_H() { return Swara.of("Ma↑  ");}
  public Swara PA_H() { return Swara.of("Pa↑  ");}
  public Swara DA_H() { return Swara.of("Da↑  ");}
  public Swara NI_H() { return Swara.of("Ni↑  ");}

  private EnglishLabels() {
    // Not expected to be instantiated outside this class.
  }
}
