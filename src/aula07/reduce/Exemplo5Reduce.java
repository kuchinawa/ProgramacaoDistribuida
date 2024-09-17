package aula07.reduce;

import java.util.Arrays;
import java.util.List;

public class Exemplo5Reduce {
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int somaDosQuadrados = numeros.stream()
                .filter(n-> n % 2 == 0)
                .map(n -> n * n)
                .sorted((a,b ) -> b - a)
                .reduce(0, Integer::sum);
        System.out.println("Soma dos quadrados dos números pares: " + somaDosQuadrados);

        numeros.stream()
                .filter(n-> n % 2 == 0)
                .map(n -> n * n)
                .sorted((a,b ) -> b - a)
                .forEach(System.out::println);
    }
}
