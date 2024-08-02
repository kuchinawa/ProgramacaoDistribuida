package aula02.pratica3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumidorEx1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> printNumero = System.out::println;
        numeros.forEach(printNumero);

        List<String> nomes = Arrays.asList("João", "Maria", "José", "Pedro");
        Consumer<String> printNome = System.out::println;
        nomes.forEach(printNome);

    }
}