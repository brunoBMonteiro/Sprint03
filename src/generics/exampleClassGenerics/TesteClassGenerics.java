package generics.exampleClassGenerics;

public class TesteClassGenerics {
    public static void main(String[] args) {

        MyGen<Integer> m = new MyGen<>();
        m.add(5);

        System.out.println(m.get());
    }
}
