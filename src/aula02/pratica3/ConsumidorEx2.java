package aula02.pratica3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class ConsumidorEx2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        final int adicionar = 20;
        Consumer<Integer> somaPrint = n -> {
            System.out.println(n + adicionar);
        };

        numeros.forEach(somaPrint);

        Consumer<Integer> dobroPrint = n -> {
            System.out.println(n * 2);
        };

        numeros.forEach(dobroPrint);

        Consumer<Integer> randomPrint = n -> {
            System.out.println(n * new Random().nextInt(100));
        };

        numeros.forEach(randomPrint);
    }
}
