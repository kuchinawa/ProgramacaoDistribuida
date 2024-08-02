package aula04.pratica01;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class InvokeAllTeste {
    public static void main(String[] args) {
        ExecutorService executor = null;
        try {
            executor = Executors.newCachedThreadPool();
            ThreadCallable t1 = new ThreadCallable();
            ThreadCallable t2 = new ThreadCallable();
            ThreadCallable t3 = new ThreadCallable();
            ThreadCallable t4 = new ThreadCallable();
            ThreadCallable t5 = new ThreadCallable();
            List<Future<String>> futures =
                    executor.invokeAll(List.of(t1, t2, t3, t4, t5));
            for (Future<String> future : futures)
                System.out.println(future.get());
            executor.shutdown();
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            if(executor != null)
                executor.shutdownNow();
        }
    }
}
