package aula03.pratica2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThreadSimples {
    public static void main(String[] args) {
        ExecutorService executor =
                Executors.newSingleThreadExecutor();



        executor.execute((()->
                System.out.println(Thread.currentThread().getName() + "Thread Lambda")));

        executor.execute(new ThreadSimples2());

        executor.execute(new ThreadSimples());

        executor.shutdown();

    }
}
