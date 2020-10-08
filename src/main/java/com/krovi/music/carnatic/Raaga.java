package com.krovi.music.carnatic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;

public final class Raaga {
  private final String name;
  private final String fileName;
  private final Pair<SwaraList, SwaraList> moorchana;
  private final SwaraList aarohana;
  private final SwaraList avarohana;

  private Raaga(
      final String name,
      final String fileName,
      final Pair<List<String>, List<String>> moorchana,
      final List<String> aarohana,
      final List<String> avarohana) {
    this.name = name;
    this.fileName = fileName;
    this.moorchana = Pair.of(SwaraList.of(moorchana.getKey()), SwaraList.of(moorchana.getValue()));
    this.aarohana = SwaraList.of(aarohana);
    this.avarohana = SwaraList.of(avarohana);
  }

  public List<List<String>> applyPatterns(
      final List<List<Integer>> aarohanaPatterns, final List<List<Integer>> avarohanaPatterns) {
    List<List<String>> list = new ArrayList<>();
    list.addAll(
        aarohanaPatterns.stream()
            .map(pattern -> getAarohana().applyPattern(pattern))
            .collect(Collectors.toList()));
    list.addAll(
        avarohanaPatterns.stream()
            .map(pattern -> getAvarohana().applyPattern(pattern))
            .collect(Collectors.toList()));

    return list;
  }

  public String name() {
    return name;
  }

  public String fileName() {
    return fileName;
  }

  public Pair<SwaraList, SwaraList> getMoorchana() {
    return moorchana;
  }

  public SwaraList getAarohana() {
    return aarohana;
  }

  public SwaraList getAvarohana() {
    return avarohana;
  }

  public String toString() {
    return "\n"
        + name
        + " -- "
        + LabelsDelegate.moorchana()
        + ":"
        + "\n     "
        + LabelsDelegate.aarohana()
        + ": "
        + moorchana.getLeft().join(" ")
        + "\n    "
        + LabelsDelegate.avarohana()
        + ": "
        + moorchana.getRight().join(" ");
  }

  public static RaagaBuilder newBuilder() {
    return new RaagaBuilder();
  }

  public static class RaagaBuilder {
    private String name;
    private String fileName;
    private Pair<List<String>, List<String>> moorchana;
    private List<String> aarohana;
    private List<String> avarohana;

    public RaagaBuilder name(final String name) {
      this.name = name;
      return this;
    }

    public RaagaBuilder fileName(final String fileName) {
      this.fileName = fileName;
      return this;
    }

    public RaagaBuilder moorchana(final Pair<List<String>, List<String>> moorchana) {
      this.moorchana = moorchana;
      return this;
    }

    public RaagaBuilder aaorhana(final List<String> aarohana) {
      this.aarohana = aarohana;
      return this;
    }

    public RaagaBuilder avaorhana(final List<String> avarohana) {
      this.avarohana = avarohana;
      return this;
    }

    public Raaga build() {
      if (null == name
          || null == moorchana
          || null == moorchana.getLeft()
          || null == moorchana.getRight()
          || null == aarohana
          || null == avarohana) {
        throw new IllegalArgumentException(
            "Expected non-null moorchana, aarohana and avarohona but found: [m: "
                + moorchana
                + ", aa:"
                + aarohana
                + ", av:"
                + avarohana);
      }
      return new Raaga(name, fileName, moorchana, aarohana, avarohana);
    }
  }
}
