package aula06.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1Sorted {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5, 3, 8, 1, 9, 2);
        System.out.println("Números desordenados: " + numeros);
        System.out.println();

        System.out.println("Usando Collect: ");
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted() // Ordena naturalmente (crescente)
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println("Números ordenados: " + numerosOrdenados);
        System.out.println();


        System.out.println("Usando forEach: ");
        numeros.stream()
                .sorted()
                .forEach(System.out::print);
    }
}