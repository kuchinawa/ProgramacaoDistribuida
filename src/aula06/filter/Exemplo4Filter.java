package aula06.filter;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exemplo4Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 6.8);
        Aluno a3 = new Aluno("Dani", 9.8);
        Aluno a4 = new Aluno("Teo", 5.5);
        Aluno a5 = new Aluno("Lu", 7.3);
        Aluno a6 = new Aluno("Mica", 8.4);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        System.out.println("Usando collect:");
        List<String> aprovados =
                alunos.stream()
                .filter(a -> a.nota >= 7.0)
                .map(a -> a.nome + " está aprovado!!!")
                .collect(Collectors.toList());
        System.out.println("Aprovados: " + aprovados);

        System.out.println("Usando forEach #1: ");
        alunos.stream()
                .filter(a -> a.nota >= 7.0)
                .map(a -> a.nome + " está aprovado!!!")
                .forEach(System.out::println);

        System.out.println("Usando forEach #2: ");
        usandoForEach2(alunos);
    }


    static void usandoForEach2 (List<Aluno> alunos) {
        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
        Function<Aluno, String> mensagem = a -> a.nome + " está aprovado!!!";
        Consumer<String> print = System.out::println;

        alunos.stream()
                .filter(aprovado)
                .map(mensagem)
                .forEach(print);
    }
}
