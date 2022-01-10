package threads.extendsThreads;

public class TesteThread {
    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread("Thread #1", 100);

        MinhaThread thread2 = new MinhaThread("Thread #2", 120);
        // para não ficar chamando o método toda hora, eu coloco ele no construtor
        //thread.start();
    }
}
