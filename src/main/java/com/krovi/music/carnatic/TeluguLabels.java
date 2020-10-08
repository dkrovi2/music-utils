package com.krovi.music.carnatic;

public class TeluguLabels implements Labels {
  public static final TeluguLabels INSTANCE = new TeluguLabels();
  public static final String SUFFIX = "tg";

  public String languageSuffix() {return SUFFIX;}
  public String raagam() { return "రాగము";}
  public String moorchana() { return "మూర్ఛన";}
  public String aarohana() {return "ఆరోహణము";}
  public String avarohana() {return "ఆవరోహణము";}
  public String saralis() { return "సరళీ వరుసలు"; }
  public String jantis() { return "జంట వరుసలు"; }
  public String dhaatus() { return "ధాటు వరుసలు"; }
  public String alankaarams() { return "అలంకారములు";}
  public String roopaka() { return "రూపక తాళం"; }
  public String triputa() { return "త్రిపుట తాళం"; }
  public String matya() { return "మట్య తాళం"; }
  public String dhruva() { return "ధృవ తాళం"; }
  public String atta() { return "అట్ట తాళం"; }
  public String jhampe() { return "జంపె తాళం"; }
  public String eka() { return "ఏక తాళం"; }

  public Swara SA_L() { return Swara.of("స↓  ");}
  public Swara RI_L() { return Swara.of("రి↓  ");}
  public Swara GA_L() { return Swara.of("గ↓  ");}
  public Swara MA_L() { return Swara.of("మ↓  ");}
  public Swara PA_L() { return Swara.of("ప↓  ");}
  public Swara DA_L() { return Swara.of("ద↓  ");}
  public Swara NI_L() { return Swara.of("ని↓  ");}
  public Swara SA() { return Swara.of("స   ");}
  public Swara RI() { return Swara.of("రి   ");}
  public Swara GA() { return Swara.of("గ   ");}
  public Swara MA() { return Swara.of("మ   ");}
  public Swara PA() { return Swara.of("ప   ");}
  public Swara DA() { return Swara.of("ద   ");}
  public Swara NI() { return Swara.of("ని   ");}
  public Swara SA_H() { return Swara.of("స↑  ");}
  public Swara RI_H() { return Swara.of("రి↑  ");}
  public Swara GA_H() { return Swara.of("గ↑  ");}
  public Swara MA_H() { return Swara.of("మ↑  ");}
  public Swara PA_H() { return Swara.of("ప↑  ");}
  public Swara DA_H() { return Swara.of("ద↑  ");}
  public Swara NI_H() { return Swara.of("ని↑  ");}

  private TeluguLabels() {
    // Not expected to be instantiated outside this class.
  }
}
