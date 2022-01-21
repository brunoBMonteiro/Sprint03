package threads.threadexampleexercicio1;

public class Thread1 {
    public static void main(String[] args) {
        // Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        // 3 threads executando em paralelo

        // Novo objeto que representa uma nova Thread
        // passando a implementação de Runnable via parametro
        Thread t1 = new Thread(new MeuRunnable());
        // run: apenas executa na mesma thread
        t1.start();

        // utilizando o método start ele cria uma nova thread
        Thread t2 = new Thread(new MeuRunnable());
        // start: executa em uma nova thread
        t2.start();

        Thread t3 = new Thread(
                () -> System.out.println("3 Threads executando em paralelo"));
        t3.start();
    }
}
