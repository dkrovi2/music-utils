package com.krovi.music.carnatic;

import java.util.function.Supplier;

public final class Swara {
  public static final String REPEAT = ".   ";

  public static class SwaraSupplier implements Supplier<Swara> {
    private Supplier<Swara> supplier;

    public static SwaraSupplier of(final Supplier<Swara> supplier) {
      return new SwaraSupplier(supplier);
    }

    private SwaraSupplier(final Supplier<Swara> supplier) {
      this.supplier = supplier;
    }

    public Swara get() {
      return supplier.get();
    }

    public void set(final Supplier<Swara> supplier) {
      this.supplier = supplier;
    }
  }

  private String swara;

  public static Swara of(final String swara) {
    return new Swara(swara);
  }

  private Swara(final String swara) {
    // This class is not expected to be instantiated.
    this.swara = swara;
  }

  public String getSwara() {
    return swara;
  }

  public void setSwara(final String swara) {
    this.swara = swara;
  }

  public static SwaraSupplier SA_L = SwaraSupplier.of(TeluguLabels.INSTANCE::SA_L);
  public static SwaraSupplier RI_L = SwaraSupplier.of(TeluguLabels.INSTANCE::RI_L);
  public static SwaraSupplier GA_L = SwaraSupplier.of(TeluguLabels.INSTANCE::GA_L);
  public static SwaraSupplier MA_L = SwaraSupplier.of(TeluguLabels.INSTANCE::MA_L);
  public static SwaraSupplier PA_L = SwaraSupplier.of(TeluguLabels.INSTANCE::PA_L);
  public static SwaraSupplier DA_L = SwaraSupplier.of(TeluguLabels.INSTANCE::DA_L);
  public static SwaraSupplier NI_L = SwaraSupplier.of(TeluguLabels.INSTANCE::NI_L);
  public static SwaraSupplier SA = SwaraSupplier.of(TeluguLabels.INSTANCE::SA);
  public static SwaraSupplier RI = SwaraSupplier.of(TeluguLabels.INSTANCE::RI);
  public static SwaraSupplier GA = SwaraSupplier.of(TeluguLabels.INSTANCE::GA);
  public static SwaraSupplier MA = SwaraSupplier.of(TeluguLabels.INSTANCE::MA);
  public static SwaraSupplier PA = SwaraSupplier.of(TeluguLabels.INSTANCE::PA);
  public static SwaraSupplier DA = SwaraSupplier.of(TeluguLabels.INSTANCE::DA);
  public static SwaraSupplier NI = SwaraSupplier.of(TeluguLabels.INSTANCE::NI);
  public static SwaraSupplier SA_H = SwaraSupplier.of(TeluguLabels.INSTANCE::SA_H);
  public static SwaraSupplier RI_H = SwaraSupplier.of(TeluguLabels.INSTANCE::RI_H);
  public static SwaraSupplier GA_H = SwaraSupplier.of(TeluguLabels.INSTANCE::GA_H);
  public static SwaraSupplier MA_H = SwaraSupplier.of(TeluguLabels.INSTANCE::MA_H);
  public static SwaraSupplier PA_H = SwaraSupplier.of(TeluguLabels.INSTANCE::PA_H);
  public static SwaraSupplier DA_H = SwaraSupplier.of(TeluguLabels.INSTANCE::DA_H);
  public static SwaraSupplier NI_H = SwaraSupplier.of(TeluguLabels.INSTANCE::NI_H);

  public static void setLabels(final Labels labels) {
    Swara.SA_L.set(labels::SA_L);
    Swara.RI_L.set(labels::RI_L);
    Swara.GA_L.set(labels::GA_L);
    Swara.MA_L.set(labels::MA_L);
    Swara.PA_L.set(labels::PA_L);
    Swara.DA_L.set(labels::DA_L);
    Swara.NI_L.set(labels::NI_L);
    Swara.SA.set(labels::SA);
    Swara.RI.set(labels::RI);
    Swara.GA.set(labels::GA);
    Swara.MA.set(labels::MA);
    Swara.PA.set(labels::PA);
    Swara.DA.set(labels::DA);
    Swara.NI.set(labels::NI);
    Swara.SA_H.set(labels::SA_H);
    Swara.RI_H.set(labels::RI_H);
    Swara.GA_H.set(labels::GA_H);
    Swara.MA_H.set(labels::MA_H);
    Swara.PA_H.set(labels::PA_H);
    Swara.DA_H.set(labels::DA_H);
    Swara.NI_H.set(labels::NI_H);
  }
}
