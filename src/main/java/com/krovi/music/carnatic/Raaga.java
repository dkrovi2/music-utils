package com.krovi.music.carnatic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;

public final class Raaga {
  private final Map<String, String> name;
  private final String fileName;
  private final Pair<SwaraList, SwaraList> moorchana;
  private final SwaraList aarohana;
  private final SwaraList avarohana;

  private Raaga(
      final Map<String, String> name,
      final String fileName,
      final Pair<List<Supplier<Swara>>, List<Supplier<Swara>>> moorchana,
      final List<Supplier<Swara>> aarohana,
      final List<Supplier<Swara>> avarohana) {
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

  public String name(final String languageSuffix) {
    return name.getOrDefault(languageSuffix, "NOT AVAILABLE IN " + languageSuffix);
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
    private Map<String, String> name;
    private String fileName;
    private Pair<List<Supplier<Swara>>, List<Supplier<Swara>>> moorchana;
    private List<Supplier<Swara>> aarohana;
    private List<Supplier<Swara>> avarohana;

    public RaagaBuilder name(final Map<String, String> name) {
      this.name = name;
      return this;
    }

    public RaagaBuilder fileName(final String fileName) {
      this.fileName = fileName;
      return this;
    }

    public RaagaBuilder moorchana(
        final Pair<List<Supplier<Swara>>, List<Supplier<Swara>>> moorchana) {
      this.moorchana = moorchana;
      return this;
    }

    public RaagaBuilder aaorhana(final List<Supplier<Swara>> aarohana) {
      this.aarohana = aarohana;
      return this;
    }

    public RaagaBuilder avaorhana(final List<Supplier<Swara>> avarohana) {
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
