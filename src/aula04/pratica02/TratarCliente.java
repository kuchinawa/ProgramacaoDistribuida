package aula04.pratica02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TratarCliente implements Runnable {
    private final Socket socket;
    public TratarCliente(Socket socketCliente) {
        this.socket = socketCliente;
    }
    @Override
    public void run() {
        try (
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(
                        socket.getOutputStream(), true)) {
            out.println("Bem-vindo ao servidor multithreaded!");
            String msgCliente;
            while ((msgCliente = in.readLine()) != null) {
                System.out.println("Mensagem do cliente: " + msgCliente);
                out.println("Echo: " + msgCliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}