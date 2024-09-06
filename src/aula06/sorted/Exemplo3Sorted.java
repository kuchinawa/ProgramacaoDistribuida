package aula06.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exemplo3Sorted {
    public static void main(String[] args) {
        // Lista de números inteiros
        List<Integer> numeros =
                Arrays.asList(5, 3, 8, 1, 9, 2, 4, 7, 6, 22,
                        77, 90, 15, 89, 10, 73);

        System.out.println("Usando collect ");
        List<Integer> resultado =
                numeros.stream()
                .filter(n-> n % 2 == 0) // Filtra números pares
                .map(n-> n * n) // Mapeia para seus quadrados
                .sorted() // Ordena em ordem crescente
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println(resultado);

        System.out.println("Usando forEach ");
        numeros.stream()
                .filter(n-> n % 2 == 0) // Filtra números pares
                .map(n-> n * n) // Mapeia para seus quadrados
                .sorted() // Ordena em ordem crescente
                .forEach(System.out::println);

        System.out.println("Usando forEach2 ");
        usadoForEach2(numeros);
    }

    static void usadoForEach2 (List<Integer> nums){

        //Predicate<Integer> isPar = (n -> n % 2 == 0);



        nums.stream()
                .filter(n-> n % 2 == 0) // Filtra números pares
                .map(n-> new Random().nextInt(100)) // Mapeia para seus quadrados
                .sorted() // Ordena em ordem crescente
                .forEach(System.out::println);

    }
}
