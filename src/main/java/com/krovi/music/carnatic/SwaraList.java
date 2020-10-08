package com.krovi.music.carnatic;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SwaraList {
  private final List<Supplier<Swara>> list;

  public static SwaraList of(final List<Supplier<Swara>> list) {
    return new SwaraList(list);
  }

  private SwaraList(final List<Supplier<Swara>> list) {
    this.list = list;
  }

  public String get(int index) {
    return index < 0 || index > list.size() ? Swara.REPEAT : list.get(index).get().getSwara();
  }

  public String join(String delimiter) {
    return String.join(
        delimiter, list.stream().map(i -> i.get().getSwara()).collect(Collectors.toList()));
  }

  public int size() {
    return list.size();
  }

  public List<String> applyPattern(final List<Integer> pattern) {
    return pattern.stream().map(i -> get(i - 1)).collect(Collectors.toList());
  }
}
