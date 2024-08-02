package aula02.pratica3;

import java.util.Arrays;
import java.util.List;

public class ForeachFuncionalEx2 {
    public static void main(String[] args) {
        List<String> paises =
                Arrays.asList("Brasil", "Argentina", "Alemanha", "Itália");
        System.out.println("Foreach comum.");
        for (String s: paises){
            System.out.println(s);
        }
        System.out.println("\nVersão 1.1 com lambda");
        paises.forEach((s)-> {
            System.out.println(s + " #1.1");
            System.out.println("outra linha...");
        });
        System.out.println("\nVersão 1.2 com lambda");
        paises.forEach(s-> System.out.println(s + " #1.2"));
        System.out.println("\nVersão com referência a método");
        paises.forEach(System.out::println);
    }
}
