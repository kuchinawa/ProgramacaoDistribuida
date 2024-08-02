package aula03.pratica2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubmitThreadSimples {
    public static void main(String[] args) {
        ExecutorService executor = null;

        try {
            executor = Executors.newSingleThreadExecutor();
            Future<?> future = executor.submit(new ThreadSimples2()); // Usando submit() para executar um Runnable
            System.out.println(future.isDone());
            executor.shutdown();
            boolean b = executor.awaitTermination(60, TimeUnit.SECONDS);
            System.out.println(future.isDone());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (executor != null) {
                executor.shutdownNow();
            }
        }
    }
}
