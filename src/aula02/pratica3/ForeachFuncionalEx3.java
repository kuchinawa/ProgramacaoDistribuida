package aula02.pratica3;

import java.util.Arrays;
import java.util.List;

public class ForeachFuncionalEx3 {
    public static void main(String[] args) {
        List<String> paises = Arrays.asList("Brasil", "Argentina", "Alemanha", "Itália");
        paises.forEach(texto-> imprimir(texto));
        System.out.println("\nVersão 2 com referência a método");
        paises.forEach(ForeachFuncionalEx3::imprimir);

    }
    static void imprimir(String texto){
        System.out.println("O texto passado foi " + texto);
    }
}
