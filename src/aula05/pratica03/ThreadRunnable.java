package aula05.pratica03;

import java.util.Random;
public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int i = new Random().nextInt(1000);
        System.out.println("Oi, eu sou a thread " +
                Thread.currentThread().getName() + ": " + i);
    }
}