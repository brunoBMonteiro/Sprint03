package streams.reduce;

import streams.withStreamsWithoutStreams.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample2 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 5.95),
            new LightNovel("Violet Evergarden", 3.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.50)
    ));

    public static void main(String[] args) {
        // somando todos preços acima de 3
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(preco -> preco > 3)
                // soma utilizando reduce, vai retornar um Optional
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
