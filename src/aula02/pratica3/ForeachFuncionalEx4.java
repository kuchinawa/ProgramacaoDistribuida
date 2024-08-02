package aula02.pratica3;

import java.util.Arrays;
import java.util.List;

public class ForeachFuncionalEx4 {
    public static void main(String[] args) {
        List<String> nomes =
                Arrays.asList("João", "José", "Maria", "Sebastião");
        nomes.forEach(nome-> {
            String nomeMaiusculo = nome.toUpperCase();
            System.out.println(nomeMaiusculo);
        });
    }
}
