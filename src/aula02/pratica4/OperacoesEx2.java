package aula02.pratica4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OperacoesEx2 {
    public static void main(String[] args) {
        OperacaoMatematica somar = (a, b) -> a + b;
        OperacaoMatematica subtrair = (a, b) -> a - b;
        OperacaoMatematica multiplicar = (a, b) -> a * b;
        OperacaoMatematica dividir = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            return a / b;
        };

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        executor.submit(
                () -> {
                    double r = somar.calcular(10, 5);
                    System.out.println("Soma: " + r);
                });

        executor.submit(
                () -> {
                    double r = subtrair.calcular(10, 5);
                    System.out.println("Subtração: " + r);
                });

        executor.submit(
                () -> {
                    double r = multiplicar.calcular(10, 5);
                    System.out.println("Multiplicação: " + r);
                });

        executor.submit(
                () -> {
                    double r = dividir.calcular(10, 5);
                    System.out.println("Divisão: " + r);
                });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();

    }
}