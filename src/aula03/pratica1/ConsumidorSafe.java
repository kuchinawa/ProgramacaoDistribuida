package aula03.pratica1;

import java.util.concurrent.BlockingQueue;

public class ConsumidorSafe implements Runnable {
    private BlockingQueue<Integer> buffer;

    public ConsumidorSafe(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int valor = buffer.take();
                System.out.println("\u001B[31mConsumindo valor: \u001B[0m" + valor);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}