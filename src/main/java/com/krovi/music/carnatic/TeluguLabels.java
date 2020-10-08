package com.krovi.music.carnatic;

public class TeluguLabels implements Labels {
  public static final TeluguLabels INSTANCE = new TeluguLabels();
  public static final String SUFFIX = "telugu";

  public String languageSuffix() {return SUFFIX;}
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

  public String SA_L() { return "స↓  ";}
  public String RI_L() { return "రి↓  ";}
  public String GA_L() { return "గ↓  ";}
  public String MA_L() { return "మ↓  ";}
  public String PA_L() { return "ప↓  ";}
  public String DA_L() { return "ద↓  ";}
  public String NI_L() { return "ని↓  ";}
  public String SA() { return "స   ";}
  public String RI() { return "రి   ";}
  public String GA() { return "గ   ";}
  public String MA() { return "మ   ";}
  public String PA() { return "ప   ";}
  public String DA() { return "ద   ";}
  public String NI() { return "ని   ";}
  public String SA_H() { return "స↑  ";}
  public String RI_H() { return "రి↑  ";}
  public String GA_H() { return "గ↑  ";}
  public String MA_H() { return "మ↑  ";}
  public String PA_H() { return "ప↑  ";}
  public String DA_H() { return "ద↑  ";}
  public String NI_H() { return "ని↑  ";}

  private TeluguLabels() {
    // Not expected to be instantiated outside this class.
  }
}
