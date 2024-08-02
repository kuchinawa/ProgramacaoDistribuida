package aula02.pratica3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumidorEx3 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("João", 20),
                new Pessoa("Maria", 25),
                new Pessoa("José", 30),
                new Pessoa("Pedro", 35)
        );
        Consumer<Pessoa> printPessoas = pessoa-> System.out.println(pessoa);
        pessoas.forEach(printPessoas);

        pessoas.forEach(System.out::println);
    }
}