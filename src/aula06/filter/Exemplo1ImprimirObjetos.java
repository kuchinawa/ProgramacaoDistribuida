package aula06.filter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Exemplo1ImprimirObjetos {
        public static void main(String[] args) {
            List<String> nomes = Arrays.asList("Joao", "Ana", "Paulo", "Marina");
            System.out.println("for tradicional");
            for (int i = 0; i < nomes.size(); i++) {
                System.out.println(nomes.get(i));
            }
            System.out.println("foreach tradicional");
            for (String nome : nomes) {
                System.out.println(nome);
            }
            System.out.println("for each Iterator");
            Iterator<String> iterator = nomes.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            System.out.println("usando Stream");
            Stream <String> stream = nomes.stream();
//            stream.forEach (n -> System.out.println(n));
//            stream.forEach(System.out::println);
            stream.forEach(Exemplo1ImprimirObjetos::imprimir);
        }
        static void imprimir(String x){

        }
    }