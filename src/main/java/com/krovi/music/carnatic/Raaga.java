package com.krovi.music.carnatic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Raaga {
  private List<String> aarohana;
  private List<String> avarohana;

  public Raaga(final List<String> aarohana, final List<String> avarohana) {
    this.aarohana = new ArrayList<>(aarohana);
    this.avarohana = new ArrayList<>(avarohana);
  }

  public List<String> aarohana() {
    return Collections.unmodifiableList(aarohana);
  }

  public List<String> avarohana() {
    return Collections.unmodifiableList(avarohana);
  }
}
