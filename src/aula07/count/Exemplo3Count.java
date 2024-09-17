package aula07.count;

import java.util.Random;
import java.util.stream.IntStream;

public class Exemplo3Count {
    public static void main(String[] args) {
        Random random = new Random();
        // Gera uma stream de 100 números aleatórios entre 1 e 1000
        // Gera números aleatórios entre 1 e 1000
        long resultado = IntStream.generate(()-> random.nextInt(1000) + 1)
                // Limita para 100 números
                .limit(1000)
                // Filtra números múltiplos de 3
                .filter(n-> n % 73 == 0)
                // Conta quantos números passaram pelo filtro
                .count();
        System.out.println("Quantidade de múltiplos de 3: " + resultado);
    }
}