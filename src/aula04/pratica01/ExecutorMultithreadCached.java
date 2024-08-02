package aula04.pratica01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorMultithreadCached {
    public static void main(String[] args) {

        ExecutorService executor = null;

        try{
            executor = Executors.newFixedThreadPool(5);

            Future<String> future1 = executor.submit(new ThreadCallable());
            Future<String> future2 = executor.submit(new ThreadCallable());
            Future<String> future3 = executor.submit(new ThreadCallable());
            Future<String> future4 = executor.submit(new ThreadCallable());
            Future<String> future5 = executor.submit(new ThreadCallable());
            Future<String> future6 = executor.submit(new ThreadCallable());

            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
            System.out.println(future4.get());
            System.out.println(future5.get());
            System.out.println(future6.get());
            executor.shutdown();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(executor != null){
                executor.shutdown();
            }
        }

    }
}
