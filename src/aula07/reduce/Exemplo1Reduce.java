package aula07.reduce;

import java.util.Arrays;
import java.util.List;

public class Exemplo1Reduce {
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int soma = numeros.stream()
           //     .reduce(0, (acc, n) -> acc + n);
                .reduce(0, Integer::sum);
        System.out.println("Soma dos números: " + soma);
    }
}
