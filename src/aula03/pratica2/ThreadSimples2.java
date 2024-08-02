package aula03.pratica2;

public class ThreadSimples2 implements Runnable {
    public void run() {
        System.out.println("oi, eu sou a Thread: " +
                Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("Iterador: "+i);
            dormir(500);
        }
    }
    private void dormir(int v){
        try {
            Thread.sleep(v);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}