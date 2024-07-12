package aula01.pratica2;
@FunctionalInterface

public interface MinhaInterfaceFuncional {
    void agir();

    default void metodoDefault() {
        System.out.println("Método default");
    }

    static void metodoEstatico() {
        System.out.println("Método estático");
    }
}
