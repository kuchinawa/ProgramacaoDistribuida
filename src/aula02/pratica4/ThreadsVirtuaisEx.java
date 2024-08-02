package aula02.pratica4;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsVirtuaisEx {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        executor.submit(() -> {
            String nome = Thread.currentThread().getName();
            int n = new Random().nextInt(100);
            System.out.println("Thread: " + nome + " - Número: " + n);
        });

        executor.submit(() -> {
            String nome = Thread.currentThread().getName();
            int n = new Random().nextInt(100);
            System.out.println("Thread: " + nome + " - Número: " + n);
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}
