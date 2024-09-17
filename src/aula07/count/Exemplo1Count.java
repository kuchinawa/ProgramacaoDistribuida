package aula07.count;

import java.util.Arrays;
import java.util.List;

public class Exemplo1Count {
    public static void main(String[] args) {
        List<ProdutoC> produtos = Arrays.asList(
                new ProdutoC(1, "Teclado", 50.00),
                new ProdutoC(2, "Mouse", 30.00),
                new ProdutoC(3, "Monitor", 250.00),
                new ProdutoC(4, "Notebook", 1200.00),
                new ProdutoC(5, "Cadeira", 150.00),
                new ProdutoC(6, "Caneta", 2.00),
                new ProdutoC(7, "Smartphone", 2000.00),
                new ProdutoC(8, "Roteador WiFi", 450.00),
                new ProdutoC(9, "Smart TV", 2500.00),
                new ProdutoC(10, "Ventilador", 250.00)
        );
        long precoMaior100 = produtos.stream()
                // Filtra produtos com preço maior que 100
                .filter(p-> p.getPreco() > 100)
                // Conta quantos produtos passaram pelo filtro
                .count();
        System.out.println("Número de produtos com preço maior que 100: " +
                precoMaior100);
    }
}