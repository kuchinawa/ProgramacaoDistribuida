package aula03.pratica1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App2 {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(5);
        Thread produtor = new Thread(new ProdutorSafe(buffer));
        Thread consumidor = new Thread(new ConsumidorSafe(buffer));
        Thread produtor2 = new Thread(new ProdutorSafe(buffer));
        Thread consumidor2 = new Thread(new ConsumidorSafe(buffer));

        produtor.start();
        consumidor.start();
    }
}
