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
import java.util.Map;
import org.apache.commons.lang3.tuple.Pair;

public class RaagaRepo {

  public static final Raaga MAAYA_MAALAWA_GOWLA =
      Raaga.newBuilder()
          .name(
              Map.of(
                  TeluguLabels.SUFFIX,
                  "మాయా మాళవ గౌళ",
                  EnglishLabels.SUFFIX,
                  "Maaya Maalawa Gowla"))
          .fileName("maaya-maalawa-gowla")
          .moorchana(
              Pair.of(
                  List.of(SA, RI, GA, MA, PA, DA, NI, SA_H),
                  List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, MA, PA, DA, NI, SA_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga MALAHARI =
      Raaga.newBuilder()
          .name(Map.of(TeluguLabels.SUFFIX, "మలహరి", EnglishLabels.SUFFIX, "Malahari"))
          .fileName("malahari")
          .moorchana(
              Pair.of(List.of(SA, RI, MA, PA, DA, SA_H), List.of(SA_H, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, MA, PA, DA, SA_H, RI_H, MA_H))
          .avaorhana(List.of(RI_H, SA_H, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga MOHANA =
      Raaga.newBuilder()
          .name(Map.of(TeluguLabels.SUFFIX, "మోహన", EnglishLabels.SUFFIX, "Mohana"))
          .fileName("mohana")
          .moorchana(Pair.of(List.of(SA, RI, GA, PA, DA, SA_H), List.of(SA_H, DA, PA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, DA, SA_H, RI_H, GA_H))
          .avaorhana(List.of(GA_H, RI_H, SA_H, DA, PA, GA, RI, SA))
          .build();

  public static final Raaga SHUDDHA_DHANYASI =
          Raaga.newBuilder()
                  .name(Map.of(TeluguLabels.SUFFIX, "శుద్ధ ధన్యాసి", EnglishLabels.SUFFIX, "Shuddha Dhanyasi"))
                  .fileName("shuddha-dhanyasi")
                  .moorchana(Pair.of(List.of(SA, GA, MA, PA, NI, SA_H), List.of(SA_H, NI, PA, MA, GA, SA)))
                  .aaorhana(List.of(SA, GA, MA, PA, NI, SA_H, GA_H, MA_H))
                  .avaorhana(List.of(MA_H, GA_H, SA_H, NI, PA, MA, GA, SA))
                  .build();

  public static final Raaga HAMSADHWANI =
      Raaga.newBuilder()
          .name(Map.of(TeluguLabels.SUFFIX, "హంసధ్వని", EnglishLabels.SUFFIX, "Hamsadhwani"))
          .fileName("hamsadhwani")
          .moorchana(Pair.of(List.of(SA, RI, GA, PA, NI, SA_H), List.of(SA_H, NI, PA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, NI, SA_H, RI_H, GA_H))
          .avaorhana(List.of(GA_H, RI_H, SA_H, NI, PA, GA, RI, SA))
          .build();

  public static final Raaga KALYANI =
      Raaga.newBuilder()
          .name(Map.of(TeluguLabels.SUFFIX, "కల్యాణి", EnglishLabels.SUFFIX, "Kalyaani"))
          .fileName("kalyani")
          .moorchana(
              Pair.of(
                  List.of(SA, RI, GA, MA, PA, DA, NI, SA_H),
                  List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, MA, PA, DA, NI, SA_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga HINDOLAM =
      Raaga.newBuilder()
          .name(Map.of(TeluguLabels.SUFFIX, "హిందోళం", EnglishLabels.SUFFIX, "Hindolam"))
          .fileName("hindolam")
          .moorchana(Pair.of(List.of(SA, GA, MA, DA, NI, SA_H), List.of(SA_H, NI, DA, MA, GA, SA)))
          .aaorhana(List.of(SA, GA, MA, DA, NI, SA_H, GA_H, MA_H))
          .avaorhana(List.of(MA_H, GA_H, SA_H, NI, DA, MA, GA, SA))
          .build();

  public static final Raaga MALAYA_MAARUTHAM =
      Raaga.newBuilder()
          .name(Map.of(TeluguLabels.SUFFIX, "మలయమారుతం", EnglishLabels.SUFFIX, "Malayamaarutham"))
          .fileName("malayamaarutham")
          .moorchana(
              Pair.of(List.of(SA, RI, GA, PA, DA, NI, SA_H), List.of(SA_H, NI, DA, PA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, DA, NI, SA_H, RI_H))
          .avaorhana(List.of(RI_H, SA_H, NI, DA, PA, GA, RI, SA))
          .build();

  public static final Raaga KAMBHOJI =
      Raaga.newBuilder()
          .name(Map.of(TeluguLabels.SUFFIX, "కాంభోజి", EnglishLabels.SUFFIX, "Kaambhoji"))
          .fileName("kambhoji")
          .moorchana(
              Pair.of(
                  List.of(SA, RI, GA, MA, PA, DA, SA_H), List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, MA, PA, DA, SA_H, RI_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga BILAHARI =
      Raaga.newBuilder()
          .name(Map.of(TeluguLabels.SUFFIX, "బిళహరి", EnglishLabels.SUFFIX, "Bilahari"))
          .fileName("bilahari")
          .moorchana(
              Pair.of(List.of(SA, RI, GA, PA, DA, SA_H), List.of(SA_H, NI, DA, PA, MA, GA, RI, SA)))
          .aaorhana(List.of(SA, RI, GA, PA, DA, SA_H, RI_H, GA_H))
          .avaorhana(List.of(SA_H, NI, DA, PA, MA, GA, RI, SA))
          .build();

  public static final Raaga JHINJHOTI =
      Raaga.newBuilder()
          .name(Map.of(TeluguLabels.SUFFIX, "జింజోటి", EnglishLabels.SUFFIX, "Jinjhoti"))
          .fileName("jinjhoti")
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
          SHUDDHA_DHANYASI,
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
