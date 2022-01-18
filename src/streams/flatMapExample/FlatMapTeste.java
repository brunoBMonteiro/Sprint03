package streams.flatMapExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlatMapTeste {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicsDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Edson", "Anthony", "Gustavo", "Guilherme");
        devdojo.add(graphicsDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        // ForEach example
        for (List<String> people: devdojo) {
            for (String person: people) {
                System.out.println(person);
            }
        }

        System.out.println();
        System.out.println("Example with flatMap");
        System.out.println();

        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);


    }
}
