package aula07.MulticastSocket.pratica1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EmissorSimples {
    public static void main(String[] args) throws IOException {
        int porta = 55554;
        String grupo = "225.17.8.9";

        DatagramSocket ds = new DatagramSocket();
        System.out.println("Emissor " +
                InetAddress.getLocalHost() +
                " executando na porta " +
                ds.getLocalPort());

        String msg = "mensagem";
        byte[] bufferEnvio = msg.getBytes();

        System.out.println("Enviando mensagem ao grupo multicast: mensagem");
        DatagramPacket pacoteEnvio = new DatagramPacket(
                bufferEnvio,
                bufferEnvio.length,
                InetAddress.getByName(grupo),
                porta);

        ds.send(pacoteEnvio);

        ds.close();
    }
}
