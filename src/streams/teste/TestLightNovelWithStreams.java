package streams.teste;

import streams.withStreamsWithoutStreams.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class TestLightNovelWithStreams {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 5.95),
            new LightNovel("Violet Evergarden", 3.99),
            new LightNovel("No Game no life", 7.99),
            new LightNovel("Fullmetal Alchemist", 5.50)
    ));

    public static void main(String[] args) {

    }
}
