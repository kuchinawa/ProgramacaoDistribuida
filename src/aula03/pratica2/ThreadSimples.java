package aula03.pratica2;

public class ThreadSimples implements Runnable {
    public void run() {
        System.out.println("oi, eu sou a Thread: " +
                Thread.currentThread().getName());
    }

}
