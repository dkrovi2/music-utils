package com.krovi.music.carnatic;

import static com.krovi.music.carnatic.Swara.DA;
import static com.krovi.music.carnatic.Swara.GA;
import static com.krovi.music.carnatic.Swara.MA;
import static com.krovi.music.carnatic.Swara.NI;
import static com.krovi.music.carnatic.Swara.PA;
import static com.krovi.music.carnatic.Swara.RI;
import static com.krovi.music.carnatic.Swara.SA;
import static com.krovi.music.carnatic.Swara.SA_H;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class RaagaRepo {

  public static final Raaga MAAYA_MAALAWA_GOWLA =
      Raaga.newBuilder()
          .moorchana(
              Pair.of(
                  List.of(SA, RI, GA, MA, PA, DA, NI, SA_H),
                  List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, MA, PA, DA, NI, SA_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  private RaagaRepo() {
    // This class is not expected to be instantiated.
  }
}
