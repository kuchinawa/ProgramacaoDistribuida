package aula06.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Exemplo4Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        List<String> marcas =
                Arrays.asList("Honda", "Toyota", "VW", "Chevrolet", "Renault");


        //construir stream
        //marcas.stream().map(m-> m.toUpperCase()).forEach(print);
        marcas.stream().map(String::toUpperCase).forEach(print);

        System.out.println("Transformando em maiusculas ");
        UnaryOperator<String> maiuscula = m-> m.toUpperCase();
        UnaryOperator<String> primeiraLetra = l-> l.charAt(0) + "";
        UnaryOperator<String> exclamacao = e-> e + "!!!";


        System.out.println("Transformando em maiusculas, ");
        marcas.stream()
                .map(maiuscula)
                .forEach(print);
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .forEach(print);
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(exclamacao)
                .forEach(print);
    }
}
