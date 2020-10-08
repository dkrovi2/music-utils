package com.krovi.music.carnatic;

import static com.krovi.music.carnatic.Swara.DA;
import static com.krovi.music.carnatic.Swara.DA_L;
import static com.krovi.music.carnatic.Swara.GA;
import static com.krovi.music.carnatic.Swara.GA_H;
import static com.krovi.music.carnatic.Swara.MA;
import static com.krovi.music.carnatic.Swara.MA_H;
import static com.krovi.music.carnatic.Swara.NI;
import static com.krovi.music.carnatic.Swara.NI_L;
import static com.krovi.music.carnatic.Swara.PA;
import static com.krovi.music.carnatic.Swara.PA_L;
import static com.krovi.music.carnatic.Swara.RI;
import static com.krovi.music.carnatic.Swara.RI_H;
import static com.krovi.music.carnatic.Swara.SA;
import static com.krovi.music.carnatic.Swara.SA_H;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class RaagaRepo {

  public static final Raaga MAAYA_MAALAWA_GOWLA =
      Raaga.newBuilder()
          .name("మాయా మాళవ గౌళ")
          .moorchana(
              Pair.of(
                  List.of(SA, RI, GA, MA, PA, DA, NI, SA_H),
                  List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, MA, PA, DA, NI, SA_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga MALAHARI =
      Raaga.newBuilder()
          .name("మలహరి")
          .moorchana(
              Pair.of(List.of(SA, RI, MA, PA, DA, SA_H), List.of(SA_H, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, MA, PA, DA, SA_H, RI_H, MA_H))
          .avaorhana(List.of(RI_H, SA_H, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga MOHANA =
      Raaga.newBuilder()
          .name("మోహన")
          .moorchana(Pair.of(List.of(SA, RI, GA, PA, DA, SA_H), List.of(SA_H, DA, PA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, DA, SA_H, RI_H, GA_H))
          .avaorhana(List.of(GA_H, RI_H, SA_H, DA, PA, GA, RI, SA))
          .build();

  public static final Raaga HAMSADHWANI =
      Raaga.newBuilder()
          .name("హంసధ్వని")
          .moorchana(Pair.of(List.of(SA, RI, GA, PA, NI, SA_H), List.of(SA_H, NI, PA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, NI, SA_H, RI_H, GA_H))
          .avaorhana(List.of(GA_H, RI_H, SA_H, NI, PA, GA, RI, SA))
          .build();

  public static final Raaga KALYANI =
      Raaga.newBuilder()
          .name("కల్యాణి")
          .moorchana(
              Pair.of(
                  List.of(SA, RI, GA, MA, PA, DA, NI, SA_H),
                  List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, MA, PA, DA, NI, SA_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga HINDOLAM =
      Raaga.newBuilder()
          .name("హిందోళం")
          .moorchana(Pair.of(List.of(SA, GA, MA, DA, NI, SA_H), List.of(SA_H, NI, DA, MA, GA, SA)))
          .aaorhana(List.of(SA, GA, MA, DA, NI, SA_H, GA_H, MA_H))
          .avaorhana(List.of(MA_H, GA_H, SA_H, NI, DA, MA, GA, SA))
          .build();

  public static final Raaga MALAYA_MAARUTHAM =
      Raaga.newBuilder()
          .name("మలయమారుతం")
          .moorchana(
              Pair.of(List.of(SA, RI, GA, PA, DA, NI, SA_H), List.of(SA_H, NI, DA, PA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, DA, NI, SA_H, RI_H))
          .avaorhana(List.of(RI_H, SA_H, NI, DA, PA, GA, RI, SA))
          .build();

  public static final Raaga KAMBHOJI =
      Raaga.newBuilder()
          .name("కాంభోజి")
          .moorchana(
              Pair.of(
                  List.of(SA, RI, GA, MA, PA, DA, SA_H), List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, MA, PA, DA, SA_H, RI_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga BILAHARI =
      Raaga.newBuilder()
          .name("బిళహరి")
          .moorchana(
              Pair.of(List.of(SA, RI, GA, PA, DA, SA_H), List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, DA, SA_H, RI_H, GA_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga JHINJHOTI =
      Raaga.newBuilder()
          .name("జింజోటి")
          .moorchana(
              Pair.of(
                  List.of(DA_L, SA, RI, GA, MA, PA, DA, NI),
                  List.of(NI, DA, PA, MA, GA, RI, SA, NI_L, DA_L, PA_L, DA_L, SA)))
          .aaorhana(List.of(DA_L, SA, RI, GA, MA, PA, DA, NI))
          .avaorhana(List.of(NI, DA, PA, MA, GA, RI, SA, NI_L, DA_L, PA_L, DA_L, SA))
          .build();

  public static final List<Raaga> raagaList =
      List.of(
          MAAYA_MAALAWA_GOWLA,
          MALAHARI,
          MALAYA_MAARUTHAM,
          MOHANA,
          KALYANI,
          KAMBHOJI,
          HINDOLAM,
          BILAHARI,
          JHINJHOTI,
          HAMSADHWANI);

  private RaagaRepo() {
    // This class is not expected to be instantiated.
  }
}
