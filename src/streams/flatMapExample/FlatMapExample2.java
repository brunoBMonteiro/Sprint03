package streams.flatMapExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample2 {
    public static void main(String[] args) {
        // Pegando as letras das palavras da Lista
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        // Pega as letra somente da primeira palavra
        System.out.println(Arrays.toString(letters));


        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(letters);

        List<String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letters2);


    }
}
