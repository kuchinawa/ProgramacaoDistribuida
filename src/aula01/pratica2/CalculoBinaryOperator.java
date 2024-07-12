package aula01.pratica2;

import java.util.function.BinaryOperator;

public class CalculoBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Double> calculo = (p, q) -> {
            return p + q;
        };
        System.out.println(calculo.apply(40.0, 25.0));

        calculo = (p, q) -> {
            return p * q;
        };
        System.out.println(calculo.apply(40.0, 25.0));


        BinaryOperator<Integer> calculo2 = (p, q) -> {
            return p + q;
        };
    }
}
