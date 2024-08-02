package aula03.pratica2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorThreadSimples3 {
    public static void main(String[] args) {
        ExecutorService executor = null;
        try {
            //Criando uma thread dentro da thread main
            executor = Executors.newSingleThreadExecutor();
            //Usando execute() para executar um Runnable
            executor.execute(new ThreadSimples2());
            executor.execute(new ThreadSimples2());
            boolean b = executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (executor != null)
                executor.shutdownNow();
            //executor.shutdown();
        }
    }
    }