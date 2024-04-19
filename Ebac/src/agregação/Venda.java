package agregação;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;
    public Venda() {
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() { return produtos;
    }
    public void add(Produto produto) {  // Forma correta de fazer um Setter em uma lista
        this.produtos.add(produto);
    }

    public void concretizarVenda() {
        System.out.println("Venda concretizada");
        System.out.println("*******************************");
        System.out.println("Comprador: " + this.comprador.getNome());
        System.out.println("Vendedor: " + this.vendedor.getNome());
        System.out.println("Itens comprados: ");
        for (Produto prod : this.produtos) {
            System.out.println("Nome Produto: " + prod.getNome() + " - Valor Produto: " + prod.getPreco());
        }
        System.out.println("*******************************");
    }
    public void cancelarVenda(){
        System.out.println("Venda cancelada");
    }
}
