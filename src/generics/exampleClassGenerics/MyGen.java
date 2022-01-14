package generics.exampleClassGenerics;

public class MyGen<T> {

    private T obj;

    void add(T obj){
        this.obj = obj;
    }
    public T get(){
        return obj;
    }

    public <T> void fazAlgo(){
        System.out.println("teste");
    }


}
