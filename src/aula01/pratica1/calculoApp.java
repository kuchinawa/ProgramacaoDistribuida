package aula01.pratica1;

public class calculoApp {
    public static void main(String[] args) {
        calculo soma = new somar();
        calculo produto = new multiplicar();

        System.out.println(soma.executar(2, 3));
    }

}
