package generics.wildcardExample;

import java.util.List;

public class WildCardComCoringa02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        // Java não vai saber que cachorro e gato, são do tipo animal
        // Da um erro de incompatibilidade de tipos - incompatible types
        printConsulta(cachorros);
        printConsulta(gatos);
    }

    // Sem wildcard
    // Type erasure - Tipo eliminação
    /*
    private static void printConsulta(List<Animal> animals){
        for (Animal animal: animals) {
            animal.consulta();
        }
    }
     */

    // Com o Upper-wildCard
    // Type erasure - Tipo eliminação
    // Utilizando extends ele aceita o tipo animal e todas suas subclasses
    // utilizando o super aceita o tipo e suas superclasses
    // Vou aceitar ? Qualquer tipo de lista que extends Animal
    // Não posso adicionar elementos na lista, tudo que passar aqui dentro será para leitura
    private static void printConsulta(List<? extends Animal> animals){
        // Cachorro cao = new Cachorro(); //Não posso adicionar, perdi a capacidade por aceitar qualquer coisa
        for (Animal animal: animals) {
            animal.consulta();
        }
    }
    // Lower-wildcard
    // Posso adidiconar qualquer um por garantia do polimorfismo, passa no teste "é um"
    //
    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());

        System.out.println(animals);
    }
}
