package aula06.sorted;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo2Sorted {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto(101, "Notebook"),
                new Produto(202, "Smartphone"),
                new Produto(303, "Tablet"),
                new Produto(404, "Smartwatch"),
                new Produto(505, "SmartTV"),
                new Produto(605, "Roteador WiFi")
        );
        List<Produto> produtosOrdenados = produtos
                .stream()
                .sorted(Comparator.comparing(Produto::getNome).reversed())
                .collect(Collectors.toList());
        System.out.println("Produtos ordenados por nome: " + produtosOrdenados);


        System.out.println("Usando forEach: ");
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getNome))
                .forEach(System.out::println);

        System.out.println("Usando forEach2: ");
        produtos.stream()
                .filter(p-> p.getCodigo() > 200)
                .sorted(Comparator.comparing(Produto::getNome))
                .forEach(System.out::println);
    }

}
