package aula04.pratica01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubmitThreadCallable {
    public static void main(String[] args) {
        ExecutorService executor = null;

        try {
            executor = Executors.newSingleThreadExecutor();
            Future<String> future =
                    executor.submit(new ThreadCallable());
            System.out.println(future.isDone());
            String s = future.get(3, TimeUnit.SECONDS);
            System.out.println(s);
            System.out.println(future.isDone());

            Future<String> future2 =
                    executor.submit(new ThreadCallable());
            System.out.println(future2.isDone());
            String s2 = future2.get(3, TimeUnit.SECONDS);
            System.out.println(s2);
            System.out.println(future2.isDone());


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (executor != null) {
                executor.shutdown();
            }
        }
    }
}