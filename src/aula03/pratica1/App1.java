package aula03.pratica1;

public class App1 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produtor produtor = new Produtor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        produtor.start();
        consumidor.start();
    }
}
