package aula01.pratica1;

public class falarApp {
    public static void main(String[] args) {
        falar brasileiro = () -> {
            return "Oi, tudo bem?";
        };

        System.out.println(brasileiro.Falar());

        falar japones = () -> {
            return "こんにちは、元気ですか？";
        };

        System.out.println(japones.Falar());

        falar ingles = () -> {
            return "Hello, how are you?";
        };
        System.out.println(ingles.Falar());

    }
}
