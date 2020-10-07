package com.krovi.music.carnatic;

import static com.krovi.music.carnatic.Swara.DA;
import static com.krovi.music.carnatic.Swara.GA;
import static com.krovi.music.carnatic.Swara.GA_H;
import static com.krovi.music.carnatic.Swara.MA;
import static com.krovi.music.carnatic.Swara.MA_H;
import static com.krovi.music.carnatic.Swara.NI;
import static com.krovi.music.carnatic.Swara.PA;
import static com.krovi.music.carnatic.Swara.RI;
import static com.krovi.music.carnatic.Swara.RI_H;
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

  public static final Raaga MALAHARI =
      Raaga.newBuilder()
          .moorchana(
              Pair.of(List.of(SA, RI, MA, PA, DA, SA_H), List.of(SA_H, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, MA, PA, DA, SA_H, RI_H, MA_H))
          .avaorhana(List.of(RI_H, SA_H, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga MOHANA =
      Raaga.newBuilder()
          .moorchana(Pair.of(List.of(SA, RI, GA, PA, DA, SA_H), List.of(SA_H, DA, PA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, DA, SA_H, RI_H, GA_H))
          .avaorhana(List.of(GA_H, RI_H, SA_H, DA, PA, GA, RI, SA))
          .build();

  public static final Raaga KALYANI =
      Raaga.newBuilder()
          .moorchana(
              Pair.of(
                  List.of(SA, RI, GA, MA, PA, DA, NI, SA_H),
                  List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, MA, PA, DA, NI, SA_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga HINDOLAM =
      Raaga.newBuilder()
          .moorchana(Pair.of(List.of(SA, GA, MA, DA, NI, SA_H), List.of(SA_H, NI, DA, MA, GA, SA)))
          .aaorhana(List.of(SA, GA, MA, DA, NI, SA_H, GA_H, MA_H))
          .avaorhana(List.of(MA_H, GA_H, SA_H, NI, DA, MA, GA, SA))
          .build();

  public static final Raaga MALAYA_MAARUTHAM =
      Raaga.newBuilder()
          .moorchana(
              Pair.of(List.of(SA, RI, GA, PA, DA, NI, SA_H), List.of(SA_H, NI, DA, PA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, DA, NI, SA_H, RI_H))
          .avaorhana(List.of(RI_H, SA_H, NI, DA, PA, GA, RI, SA))
          .build();

  public static final Raaga KAMBHOJI =
      Raaga.newBuilder()
          .moorchana(
              Pair.of(
                  List.of(SA, RI, GA, MA, PA, DA, SA_H),
                  List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, MA, PA, DA, SA_H, RI_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  private RaagaRepo() {
    // This class is not expected to be instantiated.
  }
}
