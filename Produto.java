import java.util.ArrayList;

class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
        //...
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
}