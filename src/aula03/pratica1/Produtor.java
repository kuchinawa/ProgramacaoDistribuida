package aula03.pratica1;

public class Produtor extends Thread {
    private Buffer buffer;

    public Produtor(Buffer b) {
        this.buffer = b;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.produzir(i);
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
