package aula03.pratica1;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Integer> fila = new LinkedList<>();
    private int capacidade = 5;

    public static Buffer getInstance() {
        return new Buffer();
    }
    public synchronized void produzir(int item) throws InterruptedException {
        while (fila.size() == capacidade) {
            wait();
        }
        fila.add(item);
        System.out.println("\u001B[32mProduzindo: \u001B[0m" + item);
        notifyAll();
    }

    public synchronized void consumir() throws InterruptedException {
        while (fila.isEmpty()) {
            wait();
        }
        int item = fila.poll();
        System.out.println("\u001B[31mConsumindo: \u001B[0m" + item);
        notifyAll();
    }
}
