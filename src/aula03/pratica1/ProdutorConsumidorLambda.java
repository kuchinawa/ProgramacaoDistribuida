package aula03.pratica1;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdutorConsumidorLambda {
    // Tamanho do buffer
    private static final int BUFFER_SIZE = 5;

    public static void main(String[] args) {
        // Criação de um buffer compartilhado com capacidade fixa
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(BUFFER_SIZE);
        // Criação do produtor usando lambda
        Runnable produtor = () -> {
            int valor;
            try {
                while (true) {
                    valor = new Random().nextInt(100);
                    System.out.println("\u001B[32mProduzindo valor: \u001B[0m" + valor);
                    buffer.put(valor);
                    System.out.println("\u001B[34mValor produzido: \u001B[0m" + valor);

                    Thread.sleep(1000); // Simulação de tempo para produzir
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        // Criação do consumidor usando lambda
        Runnable consumidor = () -> {
            try {
                while (true) {
                    int valor = buffer.take();
                    System.out.println("\u001B[31mConsumindo valor: \u001B[0m" + valor);
                    Thread.sleep(1500); // Simulação de tempo para consumir
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        // Inicialização das threads
        Thread threadProdutor = new Thread(produtor);
        Thread threadConsumidor = new Thread(consumidor);
        threadProdutor.start();
        threadConsumidor.start();
    }
}