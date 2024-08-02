package aula03.pratica1;

import java.util.concurrent.BlockingQueue;

class ProdutorSafe implements Runnable {
    private BlockingQueue<Integer> buffer;
    public ProdutorSafe(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

@Override
public void run() {
    int valor = 0;
    try {
        while (true) {
            System.out.println("\u001B[32mProduzindo valor: \u001B[0m" + valor);
            buffer.put(valor);
            System.out.println("\u001B[34mValor Produzido \u001B[0m" + valor);
            valor++;
            Thread.sleep(1000);
        }
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}}

