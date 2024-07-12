package aula01.pratica2;

public class MinhaInterfaceFuncionalApp {
    public static void main(String[] args) {
        MinhaInterfaceFuncional func = () -> {
            System.out.println("Meotodo agir funcional");
        };
            func.agir();
            func.metodoDefault();
            MinhaInterfaceFuncional.metodoEstatico();
        }
}
