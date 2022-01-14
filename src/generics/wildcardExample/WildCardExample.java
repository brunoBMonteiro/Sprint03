package generics.wildcardExample;

public class WildCardExample {
    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        Animal[] animals = {new Gato(), new Cachorro()};
        printConsulta(cachorros);
        System.out.println();
        printConsulta(gatos);
        System.out.println();
        printConsulta(animals);

    }

    private static void printConsulta(Animal[] animals){
        for (Animal animal: animals) {
            animal.consulta();
        }

    }
}
