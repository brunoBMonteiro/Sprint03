package threads.interfaceRunnable;

public class TesteThread {
    public static void main(String[] args) {
        MyThreadRunnable thread1 = new MyThreadRunnable("#1", 200);

        MyThreadRunnable thread2 = new MyThreadRunnable("#1", 600);

        MyThreadRunnable thread3 = new MyThreadRunnable("#1", 300);

        //Toda vez que eu instanciar a classe isso é chamado automaticamente, pq ta sendo passada a instancia no construtor
        //Thread t1 = new Thread(thread1);
        //t1.start();
    }
}