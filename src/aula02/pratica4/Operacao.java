package aula02.pratica4;

public class Operacao {
    public static void main(String[] args) {
        OperacaoMatematica somar = (a, b) -> a + b;
        OperacaoMatematica subtrair = (a, b) -> a - b;
        OperacaoMatematica multiplicar = (a, b) -> a * b;
        OperacaoMatematica dividir = (a, b) -> {
            if (b == 0) {
                throw  new ArithmeticException("Divisão por zero :(");
            }
            return a / b;
        };
        //Runnable teste = () -> Thread.currentThread().getName();
        Thread tSoma = new Thread(() ->{
            double resultado = somar.calcular(10, 20);
            System.out.println("Soma: " + resultado);
        });
        Thread tSubtrair = new Thread(() ->{
            double resultado = subtrair.calcular(10, 20);
            System.out.println("Subtração: " + resultado);
        });
        Thread tMultiplicar = new Thread(() ->{
            double resultado = multiplicar.calcular(10, 20);
            System.out.println("Multiplicação: " + resultado);
        });
        Thread tDividir = new Thread(() ->{
            double resultado = dividir.calcular(10, 20);
            System.out.println("Divisão: " + resultado);
        });

        tSoma.start();
        tSubtrair.start();
        tMultiplicar.start();
        tDividir.start();

        try {
            tSoma.join();
            tSubtrair.join();
            tMultiplicar.join();
            tDividir.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
