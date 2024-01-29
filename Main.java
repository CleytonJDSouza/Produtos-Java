import java.util.ArrayList;

public class Main {
    
    public static void main (String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Produto1", 10.0, 5));
        listaProdutos.add(new Produto("Prosuto2", 15.0, 3));

        System.out.println("Tamanho da lista de produtos: " + listaProdutos.size());

        Produto produtoRecuperado = listaProdutos.get(0);
        System.out.println("Produto no indice 0: " + produtoRecuperado);

        System.out.println("Lista de Produtos:");
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        Produto produtoNovo1 = new Produto("NovoProduto1", 20.0, 2);
        Produto produtoNovo2 = new Produto("NovoProduto2", 25.0, 1);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("ProdutoPerecivel1", 30.0, 4, "2024-12-31");

        System.out.println("Produto Perecivel:");
        System.out.println(produtoPerecivel);
    }
}
