package aula04.pratica01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FatorialCallable implements Callable<Long> {
    private final int numero;
    public FatorialCallable(int n) {
        this.numero = n;
    }
    @Override
    public Long call() throws Exception {
        return fatorial(numero);
    }
    private Long fatorial(int n) {
        if (n <= 1) return 1L;
        return n * fatorial(n- 1);
    }
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        FatorialCallable tarefa1 = new FatorialCallable(10);
        FatorialCallable tarefa2 = new FatorialCallable(8);
        Future<Long> future1 = executor.submit(tarefa1);
        Future<Long> future2 = executor.submit(tarefa2);
        try {
            Long resultado1 = future1.get();
            Long resultado2 = future2.get();
            System.out.println("Fatorial de 10 é: " + resultado1);
            System.out.println("Fatorial de 8 é: " + resultado2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}