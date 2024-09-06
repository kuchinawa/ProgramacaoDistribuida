package aula06.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exemplo2Filter {
    static Predicate<Produto> comecaComS = p -> p.getNome().startsWith("S");
    static Consumer<Produto> print = System.out::println;

    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto(101, "Notebook"),
                new Produto(202, "Smartphone"),
                new Produto(303, "Tablet"),
                new Produto(304, "Camera"),
                new Produto(405, "Monitor"),
                new Produto(404, "Smartwatch")
        );
        System.out.println("Usando Collect: ");
        List<Produto> produtosComS = produtos.stream()
                .filter(p -> p.getNome().startsWith("S"))
                .collect(Collectors.toList());

        System.out.println("Produtos com a letra S: " + produtosComS);


        System.out.println("Usando ForEach #1: ");
        produtos.stream()
                .filter(p -> p.getNome().startsWith("S"))
                .forEach(System.out::println);

        System.out.println("Usando ForEach #2: ");
        produtos.stream()
                .filter(comecaComS)
                .forEach(print);
    }
}
