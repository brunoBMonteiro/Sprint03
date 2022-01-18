package streams.teste;

import streams.withStreamsWithoutStreams.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteLightNovel {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 5.95),
            new LightNovel("Violet Evergarden", 3.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.50)
    ));

    public static void main(String[] args) {

        // Without Streams
        /*
        Ordenação pelo titulo
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();

        for(LightNovel lightNovel : lightNovels){
            if(lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if(titles.size() >= 3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);

         */

        // With Streams

        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                // Duas formas de escrever
                //.map(ln -> ln.getTitle())
                .collect(Collectors.toList());
        System.out.println(titles);


        /*
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);
         */
    }

}
