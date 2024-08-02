package aula04.pratica01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VerificarPrimoCallable implements Callable<String> {
    private final int numero;
    public VerificarPrimoCallable(int n) {
        this.numero = n;
    }
    @Override
    public String call() throws Exception {
        return isPrimo(numero) ? "verdadeiro" : "falso";
    }
    private Boolean isPrimo(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        int[] numeros = {2, 3, 4, 5, 16, 17, 19, 23, 24, 29};
        List<Future<String>> futures = new ArrayList<>();
        VerificarPrimoCallable tarefa;
        Future<String> future;
        for (int num : numeros) {
            tarefa = new VerificarPrimoCallable(num);
            future = executor.submit(tarefa);
            futures.add(future);
        }
        for (int i = 0; i < numeros.length; i++) {
            try {
                String isPrimo = futures.get(i).get();
                System.out.println(
                        "Número " + numeros[i] + " é primo? " + isPrimo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}