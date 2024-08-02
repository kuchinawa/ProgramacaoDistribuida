package aula03.pratica2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThreadSimples2 {
    public static void main(String[] args) {
        ExecutorService executor = null;

        try {
            executor = Executors.newSingleThreadExecutor();

            executor.execute(new ThreadSimples2());

            executor.execute(new ThreadSimples2());
           // executor.shutdownNow();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (executor != null) {
                executor.shutdownNow();
            }
        }
    }
}