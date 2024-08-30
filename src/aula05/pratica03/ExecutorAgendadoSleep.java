package aula05.pratica03;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorAgendadoSleep {
    public static void main(String[] args) {
        ScheduledExecutorService executor = null;
        try {
            executor = Executors.newScheduledThreadPool(3);
 /*
 Agendar a execução de uma tarefa daqui a 2 segundos
 */
            executor.schedule(new ThreadRunnable(), 2, TimeUnit.SECONDS);
            executor.schedule(new ThreadRunnable(), 3, TimeUnit.SECONDS);
            executor.schedule(new ThreadRunnable(), 4, TimeUnit.SECONDS);
            executor.schedule(new ThreadRunnable(), 1, TimeUnit.SECONDS);
            executor.schedule(new ThreadRunnable(), 2, TimeUnit.SECONDS);

            executor.shutdown();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}