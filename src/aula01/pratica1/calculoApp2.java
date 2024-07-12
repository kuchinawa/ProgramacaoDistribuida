package aula01.pratica1;

public class calculoApp2 {
    public static void main(String[] args) {
        calculo soma = (p, q ) -> {
            return p + q;
        };
        System.out.println(soma.executar(30, 40));

        calculo produto = (p, q) -> {
            return p * q;
        };
        System.out.println(produto.executar(30, 40));

        calculo outraSoma = (p , q) ->{
            return p + q;
        };
        System.out.println(outraSoma.executar(2, 3));
        }
}
