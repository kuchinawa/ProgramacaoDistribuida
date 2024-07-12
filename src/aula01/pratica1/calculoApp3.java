package aula01.pratica1;

import java.util.Random;

public class calculoApp3 {
    public static void main(String[] args) {
        calculo calculo = (p, q) -> {
            return p + q;
        };

        System.out.println(calculo.executar(30, 20));

        calculo = (p, q) -> {
            return p - q;
        };
        System.out.println(calculo.executar(30, 20));

        calculo = (p, q) -> (p +q) * new Random().nextInt(100);
        System.out.println(calculo.executar(30, 20));


    }
}
