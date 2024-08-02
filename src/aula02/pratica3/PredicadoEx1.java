package aula02.pratica3;

import java.util.function.Predicate;

public class PredicadoEx1 {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> prod.getPreco() >= 700.0;

        Produto p1 = new Produto("Notebook", 4000.0, 0.10);
        System.out.println(isCaro.test(p1)) ;

        Predicate<Produto> isCaroComDesconto =
                prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 700.0;
        System.out.println(isCaroComDesconto.test(p1));
    }
}
