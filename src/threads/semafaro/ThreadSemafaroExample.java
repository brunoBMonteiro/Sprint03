package threads.semafaro;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSemafaroExample implements Runnable{

    private CorSemafaro cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemafaroExample(){
        this.cor = CorSemafaro.VERMELHO;
        new Thread(this).start();
    }

    public CorSemafaro getCor() {

        return cor;
    }

    public void run() {
        while (!parar){
            try{
                switch (this.cor){
                    case VERMELHO:
                        Thread.sleep(2000);
                        break;
                    case AMARELO:
                        Thread.sleep(500);
                        break;
                    case VERDE:
                        Thread.sleep(1000);
                        break;
                    default: break;
                }
                this.mudarCor();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudarCor(){
        switch (this.cor){
            case VERMELHO:
                this.cor = CorSemafaro.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemafaro.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemafaro.AMARELO;
                break;
        }
        this.corMudou = true;
        notify();
    }

    // enquanto a cor não mudar, esperar
    public synchronized void esperaCorMudar(){
        while(!this.corMudou){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.corMudou = false;
    }

    public synchronized void desligarSemafaro(){

        this.parar = true;
    }

}
