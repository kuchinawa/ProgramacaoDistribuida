package aula07.reduce;

import java.util.Arrays;
import java.util.List;

public class Exemplo2Reduce {
    public static void main(String[] args) {
        List<String> palavras =
                Arrays.asList("Reduce", "para",
                        "concatenar", "strings", "de uma lista");
        String concat = palavras.stream()
                .reduce("", (acc, p) -> acc + p + " ");
        System.out.println("Concatenação das palavras: " + concat);
    }
}
