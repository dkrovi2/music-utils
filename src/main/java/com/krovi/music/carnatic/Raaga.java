package com.krovi.music.carnatic;

import static com.krovi.music.carnatic.Swara.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public final class Raaga {
  private final Pair<List<String>, List<String>> moorchana;
  private final Octet aarohana;
  private final Octet avarohana;

  private Raaga(
      final Pair<List<String>, List<String>> moorchana,
      final List<String> aarohana,
      final List<String> avarohana) {
    this.moorchana =
        Pair.of(
            Collections.unmodifiableList(moorchana.getKey()),
            Collections.unmodifiableList(moorchana.getValue()));
    this.aarohana = Octet.of(aarohana);
    this.avarohana = Octet.of(avarohana);
  }

  public Pair<List<String>, List<String>> getMoorchana() {
    return moorchana;
  }

  public Octet getAarohana() {
    return aarohana;
  }

  public Octet getAvarohana() {
    return avarohana;
  }

  public String toString() {
    return "\nమూర్ఛన:"
        + "\n     ఆరోహణము: "
        + String.join(" ", moorchana.getLeft())
        + "\n    " + LabelsDelegate.avaorhana() + ": "
        + String.join(" ", moorchana.getRight());
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Pair<List<String>, List<String>> moorchana;
    private List<String> aarohana;
    private List<String> avarohana;

    public Builder moorchana(final Pair<List<String>, List<String>> moorchana) {
      this.moorchana = moorchana;
      return this;
    }

    public Builder aaorhana(final List<String> aarohana) {
      this.aarohana = aarohana;
      return this;
    }

    public Builder avaorhana(final List<String> avarohana) {
      this.avarohana = avarohana;
      return this;
    }

    public Raaga build() {
      if (null == moorchana
          || null == moorchana.getLeft()
          || null == moorchana.getRight()
          || null == aarohana
          || aarohana.size() != 8
          || null == avarohana
          || avarohana.size() != 8) {
        throw new IllegalArgumentException(
            "Expected non-null moorchana, eight swaras in aarohana and avarohona but found: [aa:"
                + aarohana
                + ", av:"
                + avarohana);
      }
      return new Raaga(moorchana, aarohana, avarohana);
    }
  }

  public static void main(final String[] args) {
    Raaga maayamalawagowla =
        Raaga.newBuilder()
            .moorchana(
                Pair.of(
                    List.of(SA, RI, GA, MA, PA, DA, NI, SA_H),
                    List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
            .aaorhana(List.of(SA, RI, GA, MA, PA, DA, NI, SA_H))
            .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
            .build();
    System.out.println(SaraliVarasaGenerator.saraliVarasa1.apply(maayamalawagowla));
    System.out.println(SaraliVarasaGenerator.saraliVarasa2.apply(maayamalawagowla));
    System.out.println(SaraliVarasaGenerator.saraliVarasa3.apply(maayamalawagowla));
    System.out.println(SaraliVarasaGenerator.saraliVarasa4.apply(maayamalawagowla));
    System.out.println(SaraliVarasaGenerator.saraliVarasa5.apply(maayamalawagowla));
    System.out.println(SaraliVarasaGenerator.saraliVarasa6.apply(maayamalawagowla));
  }
}
