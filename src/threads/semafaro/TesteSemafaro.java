package threads.semafaro;

public class TesteSemafaro {
    public static void main(String[] args) {
        ThreadSemafaroExample semafaro = new ThreadSemafaroExample();
        for (int i = 0; i < 10; i++) {
            System.out.println(semafaro.getCor());
            semafaro.esperaCorMudar();
        }
        semafaro.desligarSemafaro();
    }
}
