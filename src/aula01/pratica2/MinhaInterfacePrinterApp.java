package aula01.pratica2;

public class MinhaInterfacePrinterApp {
    public static void main(String[] args) {
        MinhaInterfacePrinter meuPrinter = System.out::println;
        meuPrinter.print("Bora agir!!");
    }
}
