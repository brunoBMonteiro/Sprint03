package streams.findingAndMatching;

import streams.withStreamsWithoutStreams.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 5.95),
            new LightNovel("Violet Evergarden", 3.99),
            new LightNovel("No Game no life", 7.99),
            new LightNovel("Fullmetal Alchemist", 5.50)
    ));

    public static void main(String[] args) {

        // Tem algum maior que 9 ,Faz a buca e retorna booleano por que é Predicate, False
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        // Todo mundo é maior que 0, True
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        // Nenhum elemento é maior que 0, False
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0));
        System.out.println();

        System.out.println("Pegando de forma aleatória");
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                // findAny seleciona qualquer elemento dentro da list, OBS: uasar quando não importar o valor que retorna
                .findAny()
                .ifPresent(System.out::println);

        System.out.println();

        // pegando valor mais alto
        System.out.println("LightNovel com valor mais alto");
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        System.out.println();

        // Pegando valor mais baixo
        System.out.println("LightNovel com valor mais baixo");
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
