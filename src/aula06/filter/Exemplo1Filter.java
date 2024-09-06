package aula06.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exemplo1Filter {
    static Predicate<Integer> isPar = n -> n % 2 == 0;
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Numeros originais " + numeros);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Numeros pares: " + numerosPares);

        System.out.println("Numeros pares com forEach #1: " + numerosPares);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


        System.out.println("Numeros pares com forEach #2: " + numerosPares);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


    }
}
