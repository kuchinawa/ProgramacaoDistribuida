package aula02.pratica3;

import java.util.function.Function;

public class FuncaoEx2 {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        Function<String, String> resultado =
                str -> "O resultado é: " + str;
        Function<String, String> exclamacao = str -> str + "!";
        //Exemplos simples de composição de funções.
        String resultadoFinal = parOuImpar.andThen(resultado).apply(21);
      //  System.out.println(resultadoFinal);
        Function<Integer, Integer> triplo =
                numero -> numero * 3;
        resultadoFinal = triplo.
                andThen(parOuImpar).
                andThen(resultado).
                andThen(exclamacao).
                apply(31);
        System.out.println(resultadoFinal);
    }
}