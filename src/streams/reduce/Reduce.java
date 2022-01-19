package streams.reduce;

import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        // Imprimi soma
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        // imprimi soma, passando o identity ele retorna um valor final e não mais um Optional
        System.out.println(integers.stream().reduce(0,(x,y) -> x + y));

        // Utilizando "sum" da classe Integer
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        // Somando utilizando o reduce
        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println("-----------------");

        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        System.out.println("------------------------------");

        // x > y ? x : y   Se o x for maior que y, então retorna x, senão y (Ternário)
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        // pegando maior numero da lista
        System.out.println(integers.stream().reduce(0, Integer::max));
    }
}
