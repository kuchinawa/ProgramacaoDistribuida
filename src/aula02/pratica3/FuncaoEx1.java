package aula02.pratica3;

import java.util.function.Function;

public class FuncaoEx1 {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                numero -> {
                    String r;
                    if (numero % 2 == 0) {
                        r = "Par";
                    } else {
                        r = "Ímpar";
                    }
                    return r;
                };

        Function<Integer, String> parOuImpar2 =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(parOuImpar2.apply(30));
        System.out.println(parOuImpar2.apply(31));
        Function<Integer, Integer> dobro =
                numero -> numero * 2;
        System.out.println(dobro.apply(30));
    }
}
