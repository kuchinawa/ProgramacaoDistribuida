package aula06.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exemplo3Filter {
    public static void main(String[] args) {
        // Lista de strings
        List<String> palavras =
                Arrays.asList("Java", "Stream", "Filter", "Exemplo", "Código");
        // Filtra strings com comprimento maior que 5 caracteres
        List<String> palavrasLongas = palavras.stream()
                // Mantém apenas strings com mais de 5 caracteres
                .filter(s-> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Palavras com mais de 5 caracteres: " +
                palavrasLongas);
        System.out.println("Usando forEach #1");
        usandoForEach1(palavras);

        System.out.println("Usando forEach #2");
        usandoForEach2(palavras);
    }

    static void usandoForEach1 (List<String> palavras) {
        palavras.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }

    static void usandoForEach2 (List<String> palavras) {
        Predicate<String> maiorQue5 = s -> s.length() > 5;
        Consumer<String> print = System.out::println;
        palavras.stream()
                .filter(maiorQue5)
                .forEach(print);
    }
}