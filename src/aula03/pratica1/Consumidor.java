package aula03.pratica1;

public class Consumidor extends Thread {
    private Buffer buffer;

    public Consumidor(Buffer b) {
        this.buffer = b;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.consumir();
                sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
