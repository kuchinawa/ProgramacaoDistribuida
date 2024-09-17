package aula07.MulticastSocket.pratica1;

import java.io.IOException;
import java.net.*;

public class ReceptorSimples {
    public static void main(String[] args) {
        final int porta = 55554;

        try {
            MulticastSocket ms = new MulticastSocket(porta);
            System.out.println("Receptor" +
                    InetAddress.getLocalHost() +
                    " escutando na porta " +
                    ms.getLocalPort());
            InetAddress multicastIP =
                    InetAddress.getByName("225.17.1.1");
            InetSocketAddress grupo =
                    new InetSocketAddress(multicastIP, 55555);
            NetworkInterface interfaceRede =
                    NetworkInterface.getByName("wlp2s0");
            ms.joinGroup(grupo, interfaceRede);
            System.out.println(String.valueOf(ms.getNetworkInterface()));

            System.out.println("Receptor" +
                    InetAddress.getLocalHost() +
                    " entrou no grupo: "
                    + grupo);

            byte[] bufferRecepcao = new byte[1024];
            DatagramPacket pacoteRecepcao = new DatagramPacket(
                    bufferRecepcao,
                    bufferRecepcao.length);
            ms.receive(pacoteRecepcao);


            System.out.println("Dados recebidos de: " +
                    pacoteRecepcao.getAddress().toString() +
                    ":" + pacoteRecepcao.getPort() +
                    " com tamanho: " + pacoteRecepcao.getLength());
            System.out.write(bufferRecepcao,
                    0,
                    pacoteRecepcao.getLength());
            System.out.println();

            ms.leaveGroup(grupo, interfaceRede);
            ms.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
