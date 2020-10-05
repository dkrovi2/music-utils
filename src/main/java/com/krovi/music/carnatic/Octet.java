package com.krovi.music.carnatic;

import java.util.List;

public class Octet {
  private final List<String> list;

  public static Octet of (final List<String> list) {
    if (null == list ||list.size() != 8) {
      throw new IllegalArgumentException("Octet should have only 8 elements");
    }
    return new Octet(list);
  }
  private Octet(final List<String> list) {
    this.list = list;
  }

  public String get(int index) {
    return index <0 ||index>7 ? ".   " : list.get(index);
  }
}
