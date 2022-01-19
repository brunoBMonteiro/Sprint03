package streams.collectors;

import streams.withStreamsWithoutStreams.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Summarizing {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 5.95),
            new LightNovel("Violet Evergarden", 3.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.50)
    ));

    public static void main(String[] args) {
        // Without collect
        System.out.println(lightNovels.stream().count());

        //With collect
        System.out.println(lightNovels.stream().collect(Collectors.counting()));


        // Retorna um objeto contendo os valores
        // Pega sumário, minimo, máximo, a media... tudo dentro de um objeto
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println();

        //Exibe lista sem virgula no final
        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
