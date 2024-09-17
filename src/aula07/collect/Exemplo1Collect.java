package aula07.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1Collect {
    public static void main(String[] args) {
        List<String> palavras =
                Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

        String resultado = palavras.stream()
                .collect(Collectors.joining(" | "));
        System.out.println(resultado);
    }
}
