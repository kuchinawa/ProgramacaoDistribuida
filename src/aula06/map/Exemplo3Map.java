package aula06.map;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo3Map {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto(101, "Notebook"),
                new Produto(202, "Smartphone"),
                new Produto(303, "Tablet"),
                new Produto(304, "Camera"),
                new Produto(405, "Monitor")
        );
        List<String> resultados = produtos.stream()
                .map(p -> p.getNome() + " - " + p.getCodigo())
                .collect(Collectors.toList());

        System.out.println("Resultados após o collect: " + resultados);
        System.out.println("Resultados usando o forEach: ");
        produtos.stream()
                .map(p -> p.getNome() + " - " + p.getCodigo())
                .forEach(System.out::println);
    }
}
