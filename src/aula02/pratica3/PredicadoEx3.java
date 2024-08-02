package aula02.pratica3;

import java.util.function.Predicate;

public class PredicadoEx3 {
    public static void main(String[] args) {
        Predicate<String> isVazio = String::isEmpty;
        System.out.println(isVazio.test("")); // true
        System.out.println(isVazio.test("abc")); // false

    }
}
