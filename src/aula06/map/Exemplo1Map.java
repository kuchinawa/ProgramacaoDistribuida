package aula06.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1Map {
    public static void main(String[] args) {
        List<String> frutas =
                Arrays.asList("manga", "banana", "abacaxi", "abacate");
        System.out.println("usando lambda");
        List<Integer> tamanhos = frutas.stream()
                .map(f -> f.length())
                .collect(Collectors.toList());


        System.out.println("usando String::leangth");
        List<Integer> tamanhos2 = frutas.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("usando forEach");
        System.out.print("Tamanhos das frutas: ");
        frutas.stream()
                .map((fruta) -> fruta.length())
                .forEach((tamanho) -> System.out.print(tamanho + " "));

        System.out.println("Comprimentos :" + tamanhos);
    }
}
