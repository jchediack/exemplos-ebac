package agregação;

public class Programa {

    public static void main(String args[]) {
        Produto produtoTV = criarProduto(1L, 10d, "TV");
        Produto produtoCel = criarProduto(2L, 20d, "Celular");

        Vendedor vendedor1  = criarVendedor("Jeff", 2d);

        Comprador comprador1 = criarComprador("Jorge", 2000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor1);
        venda.setComprador(comprador1);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concretizarVenda();

    }

    private static Comprador criarComprador(String nome, double verba) {
        Comprador comprador = new Comprador();
        comprador.setNome(nome);
        comprador.setVerba(verba);
        return comprador;
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setPreco(valor);
        return produto;
    }
}
