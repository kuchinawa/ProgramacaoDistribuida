package aula06.map;

import java.util.Arrays;
import java.util.List;

public class Exemplo5Map {
    public static void main(String[] args) {
        List<String> marcas =
                Arrays.asList("Honda", "Toyota", "VW", "Chevrolet", "Renault");

        System.out.println("Usando Stream");
        marcas.stream()
                .map(Util.maiuscula)
                .map(Util.primeiraLetra)
                .forEach(Util.print);

        System.out.println("Usando ParallelStream");
        marcas.parallelStream()
                .map(Util.maiuscula)
                .map(Util.primeiraLetra)
                .forEach(Util.print);


    }
}
