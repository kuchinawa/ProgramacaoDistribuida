package aula07.reduce;

import java.util.Arrays;
import java.util.List;

public class Exemplo3Reduce {
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(15, 22, 9, 45, 38, 2, 14);
        int minimo = numeros.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Menor número: " + minimo);

        int maximo = numeros.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Maior número: " + maximo);
    }
}
