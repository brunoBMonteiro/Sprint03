package generics.exampleWithGenericsAndWithoutGenrics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("10");

        //Com genéricos, é necessário especificar o tipo de objeto que precisamos armazenar.
        List<Integer> lista = new  ArrayList<Integer> ();
        list.add(10);
        list.add("10"); // erro de tempo de compilação

        /*
        Sem Generics
        List list = new ArrayList();
li      st.add("hello");
        String s = (String) list.get(0); //type  casting

        Com generics
Af      Depois dos Genéricos, não precisamos digitar o objeto.

Li      st<String> list = new ArrayList<String>();
li      st.add("hello");
St      ring s = list.get(0);
         */


    }
}
