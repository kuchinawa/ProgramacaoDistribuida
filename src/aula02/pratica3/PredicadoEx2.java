package aula02.pratica3;

import java.util.function.Predicate;

public class PredicadoEx2 {
    public static void main(String[] args) {
        Predicate<Integer> isPar = n -> n % 2 == 0;

        System.out.println(isPar.test(4));
        System.out.println(isPar.test(5));
    }
}
