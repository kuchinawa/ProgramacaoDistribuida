package aula06.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Exemplo2Map {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Usando map");
        List<Integer> quadrados = numeros.stream().map((n) -> n * n).collect(Collectors.toList());
        System.out.println("Quadrados dos números: " + quadrados);

        System.out.println("Usando forEach");
        System.out.print("Quadrados dos números: ");
        numeros.stream().map((n) -> n * n).forEach((quadrado) -> System.out.print(quadrado + " "));
    }
}
