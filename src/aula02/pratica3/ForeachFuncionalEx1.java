package aula02.pratica3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ForeachFuncionalEx1 {
    public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    for(Integer n : numeros)
        System.out.println(n);
    numeros.forEach(System.out::print);

    numeros.forEach((n -> {
        Integer d = n * 3;
        System.out.println(d);
    }));

    numeros.forEach(n-> {
        Integer d= n * new Random().nextInt(10);
        System.out.println(d);
    });

    }
}
