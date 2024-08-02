package aula04.pratica01;

import java.util.Random;
import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        int i = new Random().nextInt(1000);
        return "Oi, eu sou a thread " + Thread.currentThread().getName() + " e meu número aleatório é " + i;
    }
}
