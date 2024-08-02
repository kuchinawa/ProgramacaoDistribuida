package aula02.pratica3;

public class Produto {
    private String nome;
    private double preco;
    private double desconto;

    public Produto(String nome, double preco, double v) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
